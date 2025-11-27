package ejercicios.CuadradoMagico;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("¿Que tamaño quieres que tenga tu cuadrado mágico?: ");
        int size = scn.nextInt();

        int[][] cubo;
        int intentos = 0;

        boolean filasIguales = false,
                columnasIguales = false,
                diagonalesIguales = false;

        do{

            cubo = generadorCuadradoMagico(size);
            rellenoCuadrado(cubo);
            filasIguales = comprobarFilas(cubo);
            columnasIguales = comprobarColumnas(cubo);
            diagonalesIguales = comprobarDiagonales(cubo);
            intentos +=1 ;
            System.out.println(intentos);

        }while(!filasIguales || !columnasIguales || !diagonalesIguales);

        displayCuadradoMagico(cubo);
        System.out.printf("Lo has conseguido en %d intentos.", intentos);
    }

    public static int[][] generadorCuadradoMagico(int dimension){
        return new int[dimension][dimension];
    }

    public static int[][] rellenoCuadrado(int[][] cubo){
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {

                int temporal;
                do{
                    temporal = (int) (Math.random()*(cubo.length*cubo.length))+1;
                }while(buscarUnico(temporal, cubo));

                cubo[i][j]=temporal;
            }
        }
        return cubo;
    };

    public static boolean buscarUnico(int numero, int[][] cubo){
     for (int[] fila : cubo) {
         for (int item : fila) {
             if (numero==item){
                 return true;
             }
         }
     }
     return false;
    }

    public static void displayCuadradoMagico(int[][] cubo){
        for (int[] fila : cubo) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static boolean comprobarFilas(int[][] cubo){
        int[] sumas = new int[cubo.length];
        for (int i = 0; i < cubo.length; i++) {
            sumas[i] = 0;
            for (int j = 0; j < cubo[i].length; j++) {
                sumas[i] += cubo[i][j];
            }
        }
        // Comprobamos si son todas iguales
        for (int i = 0; i < cubo.length - 1; i++) {
            if (sumas[i] != sumas[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarColumnas(int[][] cubo){
        int[] sumas = new int[cubo.length];
        for (int i = 0; i < cubo.length; i++) {
            sumas[i] = 0;
            for (int j = 0; j < cubo[i].length; j++) {
                sumas[i] += cubo[j][i];
            }
        }
        // Comprobamos si son todas iguales
        for (int i = 0; i < cubo.length - 1; i++) {
            if (sumas[i] != sumas[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarDiagonales(int[][] cubo){
        //Diagonales siempre hay 2 principales
        int diagA = 0;
        int diagB = 0;
        int prueba = 0;
        int target = 0;

        for (int i = 0; i < cubo.length; i++) {
            target += cubo[0][i];
        }

        for (int i = 0; i < cubo.length; i++) {
            for (int j = prueba; j < cubo[i].length;) {
                diagA += cubo[i][j];
                prueba++;
                break;
            }
        }
        prueba = 0;
        for (int i = cubo.length-1; i >= 0 ; i--) {
            for (int j = prueba; j < cubo[i].length;) {
                diagB += cubo[i][j];
                prueba++;
                break;
            }
        }

        // Comprobamos si son iguales DiagonalA y una Horizontal
        if (diagA != target){
            return false;
        }

        // Comprobamos si son iguales A y B
        if (diagA != diagB){
            return false;
        }
        return true;
    }

}

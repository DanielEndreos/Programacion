package ejercicios.Prueba;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = 9;

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

                //i = filas
                //j = columnas [i][j]

                int cuadrante;
                if  (i<=2 && j<=2) {
                    cuadrante = 0;
                } else if (i<=2 && j<=5) {
                    cuadrante = 1;
                } else if (i<=2 && j<=8) {
                    cuadrante = 2;
                } else if ((i>=3 && i<=5) && j<=2) {
                    cuadrante = 3;
                } else if ((i>=3 && i<=5) && j<=5) {
                    cuadrante = 4;
                }


                boolean cuadrante0 =?0:false;
                boolean cuadrante1 = ?true:false;
                boolean cuadrante2 = ()?true:false;
                boolean cuadrante3 = ()?true:false;
                boolean cuadrante4 = ()?true:false;
                boolean cuadrante5 = ((i>=3 && i<=5) && (j>=6 && j<=8))?true:false;
                boolean cuadrante6 = ((i>=6 && i<=8) && (j>=0 && j<=2))?true:false;
                boolean cuadrante7 = ((i>=6 && i<=8) && (j>=3 && j<=5))?true:false;
                boolean cuadrante8 = ((i>=6 && i<=8) && (j>=6 && j<=8))?true:false;

                }





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

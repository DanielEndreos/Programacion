package ejercicios.Programacion.Tema4._1_ArraysMultidimensionales.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 1: Crear y mostrar una matriz

        Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
        Usa bucles for anidados para mostrar la matriz en formato de tabla.

        Ejemplo de salida por consola:
        Matriz 3x3:
        1 2 3
        4 5 6
        7 8 9
         */

        int[][] matriz = new int[3][3];
        int num = 1;

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = num;
                num++;
            }
        }

        System.out.println("Matriz 3x3:");
        for (int[] linea : matriz ) {
            for (int columna : linea ) {
                System.out.printf("%d\t", columna);
            }
            System.out.println("");
        }

    }
}

package ejercicios.Programacion.Notion.Tema4._1_ArraysMultidimensionales.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 2: Rellenar matriz con input del usuario

        Desarrolla un programa que cree una matriz de 2x4. Usa bucles for anidados
        para pedir al usuario que introduzca 8 números y los almacene en la matriz.
        Al final, muestra la matriz completa.

        Ejemplo de salida por consola:

        Introduce el valor para posición [0][0]: 5
        Introduce el valor para posición [0][1]: 10
        Introduce el valor para posición [0][2]: 15
        Introduce el valor para posición [0][3]: 20
        Introduce el valor para posición [1][0]: 25
        Introduce el valor para posición [1][1]: 30
        Introduce el valor para posición [1][2]: 35
        Introduce el valor para posición [1][3]: 40

        Matriz resultante:
        5 10 15 20
        25 30 35 40
        */
        int[][] matriz = new int[2][4];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el valor para posición [%d][%d]: ", i,j);
                matriz[i][j] = scn.nextInt();
            }
        }

        System.out.println("Matriz resultante:");
        for (int[] fila : matriz ) {
            for (int item : fila) {
                System.out.printf("%2d\t", item);
            }
            System.out.println("");
        }

    }
}

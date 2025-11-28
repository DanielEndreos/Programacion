package ejercicios.Programacion.Tema4._1_ArraysMultidimensionales.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Ejercicio 4: Buscar un elemento en una matriz

    Crea un programa con una matriz de 3x5 con números.
    Pide al usuario un número a buscar y usa bucles for
    anidados para encontrarlo. Si existe, muestra su posición
    (fila y columna). Si no existe, indica que no se encontró.

    Ejemplo de salida por consola:
    Matriz:
    12 45 23 67 89
    34 56 78 90 11
    22 33 44 55 66

    Introduce el número a buscar: 78
    El número 78 se encuentra en la posición [1][2]
     */
        Scanner scn = new Scanner(System.in);
        int[][] matriz = {{12,45,23,67,89},
                          {34,56,78,90,11},
                          {22,33,44,55,66}};

        System.out.println("Matriz:");
        for (int[] fila : matriz ) {
            for (int item : fila) {
                System.out.printf("%2d\t", item);
            }
            System.out.println("");
        }

        System.out.print("\nIntroduce el número a buscar: ");
        int numBuscar = scn.nextInt();
        boolean existe = false;

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numBuscar == matriz[i][j]){
                    System.out.printf("El número %d se encuentra en la posición [%d][%d]", numBuscar, i, j);
                    existe = true;
                    break;
                }
            }
        }
        if(!existe){
            System.out.printf("El número %d no se encuentra en la matriz", numBuscar);
        }

    }
}

package ejercicios.Programacion.ThePower.Tema4.Ejercicio1;

import Metodos.CtrlMatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Crea un programa que permita sumar arrays multidimensionales. Para ello
        siguiente estos pasos:

        a. Pide al usuario el tamaño de las matrices
        b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
        50
        c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
        de las celdas de las generadas en el punto anterior
        d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
        para poder indentificarlas.
         */

        Scanner scn = new Scanner(System.in);
        System.out.print("¿Cuantas filas tendrán las matrices a sumar?: ");
        int dimA = scn.nextInt();
        System.out.print("¿Cuantas columnas tendrán las matrices a sumar?: ");
        int dimB = scn.nextInt();
        int[][] matrizA = new int[dimA][dimB],
                matrizB = new int[dimA][dimB],
                sumaMatrices = new int[dimA][dimB];

        CtrlMatriz.buildToInt(matrizA,true,51,true, "\nMatriz A: ");
        CtrlMatriz.buildToInt(matrizB,true,51,true, "\nMatriz B: ");

        for (int i = 0; i<matrizA.length; i++){
            for (int j = 0; j < matrizA[0].length; j++) {
                sumaMatrices[i][j] = matrizA[i][j]+matrizB[i][j];
            }
        }
        CtrlMatriz.displayFromInt(sumaMatrices,"\nSuma de las matrices: ");
    }

}


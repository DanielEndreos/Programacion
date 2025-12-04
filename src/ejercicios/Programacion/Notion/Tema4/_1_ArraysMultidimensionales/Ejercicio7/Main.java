package ejercicios.Programacion.Notion.Tema4._1_ArraysMultidimensionales.Ejercicio7;

import Metodos.CtrlMatriz;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 7: Transponer una matriz

        Crea un programa que defina una matriz de 3x4.
        Usa bucles for anidados para crear una nueva matriz transpuesta
        (4x3) donde las filas se convierten en columnas. Muestra ambas matrices.

        Ejemplo de salida por consola:
        Matriz original (3x4):
        1 2 3 4
        5 6 7 8
        9 10 11 12

        Matriz transpuesta (4x3):
        1 5 9
        2 6 10
        3 7 11
        4 8 12
         */

        int[][] matrizOriginal = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrizTranspuesta = new int[4][3];


        for (int i = 0; i < matrizOriginal[0].length; i++) {  //columna
            for (int j = 0; j < matrizOriginal.length; j++) {  //Fila
                matrizTranspuesta[i][j] = matrizOriginal[j][i];
            }
        }

        CtrlMatriz.displayFromInt(matrizOriginal, "Matriz Original (3x4): ");
        CtrlMatriz.displayFromInt(matrizTranspuesta, "\nMatriz Transpuesta (4x3): ");


    }
}

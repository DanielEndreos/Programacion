package ejercicios.Programacion.Notion.Tema4._1_ArraysMultidimensionales.Ejercicio8;

import metodos.CtrlMatriz;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 8: Contar números pares e impares en una matriz

        Desarrolla un programa que cree una matriz de 4x5 con números enteros.
        Usa bucles for anidados para contar cuántos números pares e impares hay en toda la matriz.
        Muestra ambos contadores.

        Ejemplo de salida por consola:
        Matriz:
        12 15 8 23 34
        17 20 9 14 27
        6 11 18 25 30
        13 22 7 16 19

        Números pares: 11
        Números impares: 9
         */

        int[][] matriz = new int[4][5];
        int pares = 0, impares = 0;

        CtrlMatriz.buildToInt(matriz,false, 40,false, "Matriz: ");

        for (int[] fila : matriz ) {
            for (int value : fila) {
                pares += (value%2)==0?1:0;
                impares += (value%2)!=0?1:0;
            }
        }
        System.out.printf("""
                \nNúmeros pares: %d
                Números impares: %d
                """, pares, impares);
    }
}

package ejercicios.Programacion.Notion.Tema4._1_ArraysMultidimensionales.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 6: Encontrar el mayor elemento de cada columna

        Escribe un programa que cree una matriz de 3x4 con números.
        Usa bucles for para encontrar el número mayor de cada columna y muestra los resultados.

        Ejemplo de salida por consola:
        Matriz:
        15 23 8 19
        42 17 31 25
        28 35 12 40

        Mayor de columna 0: 42
        Mayor de columna 1: 35
        Mayor de columna 2: 31
        Mayor de columna 3: 40
         */

        int[][] matriz = {{15,23,8,19},
                          {42,17,31,25},
                          {28,35,12,40}};

        System.out.println("Matriz:");
        for (int[] fila : matriz ) {
            for (int item : fila) {
                System.out.printf("%3d\t", item);
            }
            System.out.println("");
        }


        for (int i = 0; i < matriz[0].length ; i++) {
            int grande = 0;
            for (int j = 0; j < matriz.length; j++) {
                //grande = matriz[j][i]>grande?matriz[j][i]:grande; //Opción A - Mia
                grande = Math.max(matriz[j][i], grande); //Opción B - Sugerida por Intellij
            }
            System.out.printf("\nMayor de columna %d: %d", i, grande);
        }
    }
}

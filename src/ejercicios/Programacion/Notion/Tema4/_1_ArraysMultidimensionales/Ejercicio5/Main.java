package ejercicios.Programacion.Notion.Tema4._1_ArraysMultidimensionales.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 5: Calcular el promedio de cada fila

        Desarrolla un programa que defina una matriz de 4x3 con números decimales.
        Usa bucles for anidados para calcular y mostrar el promedio de cada fila de la matriz.

        Ejemplo de salida por consola:
        Matriz:
        5.5 7.2 6.8
        8.1 9.3 7.5
        4.2 5.6 6.1
        7.8 8.9 9.2

        Promedio de fila 0: 6.50
        Promedio de fila 1: 8.30
        Promedio de fila 2: 5.30
        Promedio de fila 3: 8.63
         */

        double[][] matriz = {{5.5,7.2,6.8},
                             {8.1,9.3,7.5},
                             {4.2,5.6,6.1},
                             {7.8,8.9,9.2}};

        System.out.println("Matriz:");
        for (double[] fila : matriz ) {
            for (double item : fila) {
                System.out.printf("%-3.1f\t", item);
            }
            System.out.println("");
        }


        for (int i = 0; i < matriz.length ; i++) {
            double sum = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
            System.out.printf("\nPromedio de fila %d: %.2f", i, (sum/matriz[i].length));

        }

    }
}

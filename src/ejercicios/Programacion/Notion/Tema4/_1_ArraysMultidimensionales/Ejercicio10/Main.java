package ejercicios.Programacion.Notion.Tema4._1_ArraysMultidimensionales.Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 10: Sistema de notas de una clase

        Desarrolla un programa que pida al usuario cuántos estudiantes
        y cuántas asignaturas hay. Crea una matriz para almacenar las notas
        (estudiantes * asignaturas). Usa bucles for anidados para rellenar
        la matriz con las notas.

        Ejemplo de salida por consola:
        ¿Cuántos estudiantes hay?: 3
        ¿Cuántas asignaturas hay?: 4

        Introduce nota de estudiante 1, asignatura 1: 7.5
        Introduce nota de estudiante 1, asignatura 2: 8.0
        Introduce nota de estudiante 1, asignatura 3: 6.5
        Introduce nota de estudiante 1, asignatura 4: 9.0
        Introduce nota de estudiante 2, asignatura 1: 5.0
        Introduce nota de estudiante 2, asignatura 2: 7.0
        Introduce nota de estudiante 2, asignatura 3: 6.0
        Introduce nota de estudiante 2, asignatura 4: 8.0
        Introduce nota de estudiante 3, asignatura 1: 9.5
        Introduce nota de estudiante 3, asignatura 2: 8.5
        Introduce nota de estudiante 3, asignatura 3: 9.0
        Introduce nota de estudiante 3, asignatura 4: 10.0
        */

        Scanner scn = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes hay?: ");
        int nEstudiantes = scn.nextInt();
        System.out.print("¿Cuántas asignaturas hay?: ");
        int nAsignaturas = scn.nextInt();

        double[][] matriz = new double[nEstudiantes][nAsignaturas];

        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce nota de estudiante %d, asignatura %d: ", i+1, j+1);
                matriz[i][j] = scn.nextDouble();
            }
        }

        /*
        Luego:
        1. Muestra todas las notas en formato de tabla
        2. Calcula y muestra el promedio de cada estudiante
        3. Calcula y muestra el promedio de cada asignatura
        4. Encuentra la nota más alta de toda la clase y su posición
        */

        /*
        --- TABLA DE NOTAS ---
                Asig1  Asig2  Asig3  Asig4
        Est 1:  7.5    8.0    6.5    9.0
        Est 2:  5.0    7.0    6.0    8.0
        Est 3:  9.5    8.5    9.0    10.0
        */

        System.out.println("\n--- TABLA DE NOTAS ---");
        System.out.print("\t");

            for (int i = 0; i < matriz[0].length; i++) {
                System.out.printf("\tAsig%d",i+1);
            }

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("\nEst %d:\t", i+1);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4.1f\t", matriz[i][j]);
            }
        }


        /*
        --- PROMEDIOS POR ESTUDIANTE ---
        Estudiante 1: 7.75
        Estudiante 2: 6.50
        Estudiante 3: 9.25
        */

        System.out.println("\n\n--- PROMEDIOS POR ESTUDIANTE ---");

        for (int i = 0; i < matriz.length; i++) {
            double sumaNotas = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaNotas += matriz[i][j];
            }
            System.out.printf("Estudiante %d:\t%.2f\n", i+1, (sumaNotas/matriz[i].length));
        }


        /*
        --- PROMEDIOS POR ASIGNATURA ---
        Asignatura 1: 7.33
        Asignatura 2: 7.83
        Asignatura 3: 7.17
        Asignatura 4: 9.00
        */

        System.out.println("\n\n--- PROMEDIOS POR ASIGNATURA ---");

        for (int i = 0; i < matriz[0].length; i++) {
            double sumaNotas = 0.0;
            for (int j = 0; j < matriz.length; j++) {
                sumaNotas += matriz[j][i];
            }
            System.out.printf("Asignatura %d:\t%.2f\n", i+1, (sumaNotas/matriz.length));
        }

        /*
        --- NOTA MÁS ALTA ---
        La nota más alta es 10.0 (Estudiante 3, Asignatura 4)
         */

        System.out.println("\n\n --- NOTA MÁS ALTA ---");
        double notaMasAlta = 0.0;
        int estudiante = 0;
        int asignatura = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (notaMasAlta<matriz[i][j]){
                    notaMasAlta=matriz[i][j];
                    estudiante=i+1;
                    asignatura=j+1;
                }
            }
        }
        System.out.printf("La nota más alta es %.2f (Estudiante %d, Asignatura %d)", notaMasAlta, estudiante,asignatura );


    }
}

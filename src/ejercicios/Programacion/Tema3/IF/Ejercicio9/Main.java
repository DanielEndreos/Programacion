package ejercicios.Programacion.Tema3.IF.Ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 9: Calculadora de IMC básica

        // Escribe un programa que pida el peso (en kg) y la altura         //
        // (en metros) del usuario. Calcula el IMC (peso / altura²)         //
        // y determina si está en peso normal (IMC entre 18.5 y 24.9),      //
        // por debajo del peso normal (IMC menor a 18.5) o por encima       //
        // del peso normal (IMC mayor a 24.9).                              //

        /*Introduce tu peso en kg: 70
        Introduce tu altura en metros: 1.75
        Tu IMC es: 22.86
        Estás en peso normal.
        */
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu peso en Kg: ");
        double peso = scn.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        double altura = scn.nextDouble();

        // Cálculo IMC y muestreo por consola
        double imc = (peso / (altura*altura));
        System.out.printf("Tu IMC es: %.2f:", imc);

        // Cálculo del peso
        if (imc < 18.5){
            System.out.println("\nTu peso está por debajo de lo normal.");
        } else if (imc > 24.9) {
            System.out.println("\nTu peso está por encima de lo normal.");
        } else {
            System.out.println("\nTu peso es normal");
        };
    }
}

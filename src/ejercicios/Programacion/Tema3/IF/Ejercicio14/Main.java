package ejercicios.Programacion.Tema3.IF.Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 14: Elegibilidad para préstamo

        // Desarrolla un programa que determine si una persona es       //
        // elegible para un préstamo bancario. Pide: edad, ingresos     //
        // mensuales (€), y si tiene deudas pendientes (true/false).    //
        // Los requisitos son: Edad entre 21 y 65 años, ingresos        //
        // mensuales de al menos 1000€, y NO tener deudas pendientes.   //
        // El programa debe evaluar cada condición y mostrar si es      //
        // elegible o no, explicando qué requisitos no cumple.          //
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("Introduce tus ingresos mensuales: ");
        int ingresos = scn.nextInt();
        System.out.print("¿Tienes deudas pendientes? (true/false): ");
        boolean deudas = scn.nextBoolean();
        System.out.printf("¿Edad entre 21 y 65?: %s\n", edad>=21 && edad<=65);
        System.out.printf("¿Ingresos >= 1000€?: %s\n", ingresos>=1000);
        System.out.printf("¿Sin deudas pendientes?: %s\n", !deudas);
        System.out.printf("¿Es elegible para el préstamos?: %s\n", ( edad>=21 && edad<=65 ) && ingresos >= 1000 && !deudas );
        if ((edad>=21 && edad<=65 ) && ingresos >= 1000 && !deudas) {
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
        } else {
            if (!(edad>=21 && edad<=65)){
                System.out.print("La edad no permite recibir el préstamo (Edad necesaria: 21..65)\n");
            };
            if (!(ingresos >= 1000)){
                System.out.print("Los ingresos no son suficientes. (Ingresos mínimos: 1000€)\n");
            };
            if (!deudas){
                System.out.print("No se permiten préstamos a deudores.\n");
            };
        };

    }
}

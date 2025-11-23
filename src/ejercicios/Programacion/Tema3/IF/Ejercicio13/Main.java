package ejercicios.Programacion.Tema3.IF.Ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 13: Calculadora de precio de entradas

        // Escribe un programa para calcular el precio de entrada a un      //
        // museo. Pide la edad del usuario y el día de la semana            //
        // (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de     //
        // 12 años: entrada gratis. Entre 12 y 17 años: 5€ (pero gratis     //
        // los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves).       //
        // 65 años o más: 6€. Usa operadores lógicos para determinar        //
        // el precio correcto y muestra el cálculo.                         //
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("Introduce el día de la semana (1-7): ");
        int diaSemana = scn.nextInt();
        String nombreDia = "";
        int precioEntrada = 0;

        if (diaSemana <=0 || diaSemana >7){
            System.out.println("El día introducido está fuera de rango.");
        } else {
            if (diaSemana == 1) {
                nombreDia = "Lunes";
            } else if (diaSemana == 2) {
                nombreDia = "Martes";
            } else if (diaSemana == 3) {
                nombreDia = "Miércoles";
            } else if (diaSemana == 4) {
                nombreDia = "Jueves";
            } else if (diaSemana == 5) {
                nombreDia = "Viernes";
            } else if (diaSemana == 6) {
                nombreDia = "Sábado";
            } else if (diaSemana == 7) {
                nombreDia = "Domingo";
            };

            System.out.printf("\nEdad: %d años", edad);
            System.out.printf("\nDía de la semana: %d (%s)", edad, nombreDia);
            System.out.printf("\n¿Eres menor de 12?: %s", edad < 12);
            System.out.printf("\n¿Tienes entre 12 y 17?: %s", edad >= 12 && edad <= 17);
            System.out.printf("\n¿Es martes?: %s", nombreDia.equals("Martes"));

            if (edad < 12) {
                precioEntrada = 0;
            } else if (edad >= 65) {
                precioEntrada = 6;
            } else if (edad >=12 && edad <=17) {
                precioEntrada = 5;
                if (nombreDia == "Martes"){
                    precioEntrada = 0;
                };
            } else {
                precioEntrada = 10;
                if (nombreDia == "Jueves"){
                    precioEntrada = 7;
                };
            };
            System.out.printf("\nPrecio de entrada: %d€", precioEntrada);

        };

    }
}

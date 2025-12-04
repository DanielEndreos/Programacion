package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 15: Sistema de envío con múltiples condiciones

        // Crea un programa que calcule el coste de envío de un paquete.                //
        // Pide: peso del paquete (kg), distancia de envío (km), y si es                //
        // envío urgente (true/false). Las reglas son: Precio base: 5€.                 //
        // Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.                 //
        // Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente,          //
        // multiplicar el precio total por 1.5. Muestra todos los cálculos paso a paso. //

        Scanner scn = new Scanner(System.in);
        double basePrice = 5.0;
        double costeAdicionalDistancia = 0.0;
        double extraCosteKg = 0.0;
        double recargoUrgencia = 1.0;

        System.out.print("Introduce el peso del paquete (kg): ");
        double pesoPaquete = scn.nextDouble();
        System.out.print("Introduce la distancia de envío (km): ");
        int distancia = scn.nextInt();
        System.out.print("¿Es envío urgente? (true/false) ");
        boolean urgente = scn.nextBoolean();
        System.out.printf("Precio base: %.1f€\n", basePrice);
        if (pesoPaquete>5){
            extraCosteKg = (pesoPaquete-5)*2;
            System.out.printf("Peso: %.1fKg (excede 5kg en %.1fKg)\n", pesoPaquete, pesoPaquete-5);
            System.out.printf("Coste adicional por peso: %.1f€\n", extraCosteKg );
        } else {
            System.out.printf("Peso: %.1fKg\n", pesoPaquete);
        };
        if (distancia>100){
            costeAdicionalDistancia = 10.0;
            System.out.printf("Distancia: %dkm (mayor de 100km)\n", distancia);
            System.out.printf("Coste adicional por distancia: %.1f€\n", costeAdicionalDistancia);
        } else {
            System.out.printf("Distancia: %dKm \n", distancia);
        };
        System.out.printf("Subtotal: %.1f€ \n", basePrice + extraCosteKg + costeAdicionalDistancia);
        System.out.printf("¿Es envío urgente?: %s\n", urgente);

        if (urgente) {
            recargoUrgencia = 1.5;
        }

        System.out.printf("Coste total de envío: %.1f€\n", (basePrice + extraCosteKg + costeAdicionalDistancia)*recargoUrgencia);

    }
}

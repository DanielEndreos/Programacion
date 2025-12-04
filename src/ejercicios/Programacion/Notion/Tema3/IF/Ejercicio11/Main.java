package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 11: Sistema de descuentos por niveles

        // Desarrolla un programa que pida el importe de una compra     //
        // y si el cliente es socio (true/false). Aplica descuentos     //
        // según estas reglas: Si es socio Y la compra es mayor o       //
        // igual a 200€, descuento del 20%. Si es socio Y la compra     //
        // es menor de 200€, descuento del 10%. Si NO es socio pero     //
        // la compra es mayor o igual a 300€, descuento del 5%. En      //
        // cualquier otro caso, no hay descuento. Muestra el importe    //
        // original, el descuento aplicado y el importe final.          //
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce el importe de la compra: ");
        double importe = scn.nextDouble();
        System.out.print("¿Eres socio? ");
        boolean socio = scn.nextBoolean();
        scn.nextLine(); //Culpa del boolean dice Bruno
        double importeDisc = 0.0;
        int porcentajeDisc = 0;

        System.out.printf("Importe Original: %.1f€\n", importe);

        if (socio && importe >= 200.0){
            porcentajeDisc = 20;
            importeDisc = importe * (porcentajeDisc/100.0);

            System.out.println("Eres socio y tu compra es >= 200€.");
        } else if (socio) {
            porcentajeDisc = 10;
            importeDisc = importe * (porcentajeDisc/100.0);
            System.out.println("Eres socio y tu compra es < 200€.");
        } else if (!socio && importe >= 300.0){
            porcentajeDisc = 5;
            importeDisc = importe * (porcentajeDisc/100.0);
            System.out.println("No eres socio y tu compra es >= 300€.");
        } else {
            System.out.println("No eres socio y tu compra es < 300€.");
        };

        System.out.printf("Descuento aplicado (%d%%): %.1f€\n", porcentajeDisc, importeDisc);
        System.out.printf("Importe final: %.1f€", importe - importeDisc);

    }
}

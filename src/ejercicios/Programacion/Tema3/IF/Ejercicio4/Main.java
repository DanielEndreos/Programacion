package ejercicios.Programacion.Tema3.IF.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 4: Descuento por compra

        // Crea un programa que pida el importe de una compra.    //
        // Si el importe es mayor o igual a 100€, aplica un       //
        // descuento del 10%. Muestra el importe original y el    //
        // importe final a pagar.                                 //
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra: ");
        double importeCompra = scn.nextDouble();
        double importeDescuento = 0.0;

        if (importeCompra >= 100.0) {
            importeDescuento = (importeCompra * 10/100);
        };

        System.out.printf("""
                Importe original: %.1f
                Descuento aplicado: %.1f
                Importe final: %.1f      
                """, importeCompra, importeDescuento, importeCompra-importeDescuento);


    }
}

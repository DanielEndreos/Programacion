package ejercicios.MPO.Tema1.SwitchAvanzado.Ejercicio2;

import enums.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.
        //Crea un enum Moneda con: DOLAR, LIBRA, YEN, PESO.
        //Declara una variable double euros con una cantidad.
        //Usa un switch con el enum para aplicar la tasa de conversión correspondiente.
        //Muestra el resultado de la conversión.
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce una cantidad en €: ");
        double euros = scn.nextDouble();

        System.out.print("¿A que moneda quieres convertirlo?: ");
        String moneda = scn.next().toUpperCase();

        switch (Moneda.valueOf(moneda)){
            case YEN -> {System.out.printf("El cambio de %.1f€ a %s es %.1f¥.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case PESO ->{System.out.printf("El cambio de %.1f€ a %s es %.1f$ (peso).", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case DOLAR -> {System.out.printf("El cambio de %.1f€ a %s es %.1f$.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case LIBRA -> {System.out.printf("El cambio de %.1f€ a %s es %.1f£.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
        }
    }
}

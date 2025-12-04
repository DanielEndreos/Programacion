package ejercicios.MPO.ThePower.Tema1.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
        centenas, decenas y unidades), y se obtiene el número correspondiente.
        Numero)
        Decenas de mil: 7
        Unidades de mil: 9
        Centenas: 0
        Decenas: 5
        Unidades: 0
        Numero introducido: 79050
        */
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce un núnero: ");
        int numero = scn.nextInt();
        int decMil = numero/10000;
        int unMil = (numero%10000)/1000;
        int cent = (numero%1000)/100;
        int dec = (numero%100)/10;
        int ud = (numero%10);
        System.out.printf("""
Decenas de mil: %d
Unidades de mil: %d
Centenas: %d
Decenas: %d
Unidades: %d
Número introducido: %d
                """, decMil, unMil, cent, dec, ud, numero);
    }
}

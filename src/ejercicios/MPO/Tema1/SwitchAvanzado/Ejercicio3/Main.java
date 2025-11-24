package ejercicios.MPO.Tema1.SwitchAvanzado.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un programa que clasifique la temperatura en categorías usando rangos.
        //Requisitos:
        // 1. Declara una variable int temperatura en grados Celsius.
        // 2. Usa Switch(true) para clasificar la temperatura en: Helado(<0), Frío(0-15), Templado(16-25), Calor(26-35), Muy Caliente(>35).
        // 3. Muestra un mensaje descriptivo y una recomendación de vestimenta

        Scanner scn = new Scanner(System.in);
        Integer temperatura = -50;

        switch (temperatura){
            case Integer n when (n<0) -> {System.out.printf("Hace mucho frío, no salgas de casa: %dºC", temperatura);}
            case Integer n when (n>=0 && n<=15) -> {System.out.printf("Hace mucho frío, no salgas de casa: %dºC", temperatura);}
            case Integer n when (n>=16 && n<=25)-> {System.out.printf("Si sales de casa, bajo tu responsabilidad: %dºC", temperatura);}
            case Integer n when (n>=26 && n<=35)-> {System.out.printf("Dar un paseito no está mal: %d ºC", temperatura);}
            case Integer n when (n>=36)-> {System.out.printf("Buen tiempo para ir a la playa, pero con agua encima eh!: %d ºC", temperatura);}
            default -> throw new IllegalStateException("Unexpected value: " + temperatura);
        }
    }
}

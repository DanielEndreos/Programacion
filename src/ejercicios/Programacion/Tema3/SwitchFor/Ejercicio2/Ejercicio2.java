package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio 2: Calificación con switch
        // Desarrolla un programa que pida una letra de calificación (A, B, C, D, F)
        // y use un switch para mostrar el mensaje correspondiente: A="Excelente",
        // B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
        //                                                                              //
        //Ejemplo de salida por consola:                                                //
        // Introduce tu calificación (A-F): B                                           //
        //Calificación B: Muy bien                                                      //

        Scanner scn = new Scanner(System.in);

        System.out.print("\n\nIntroduce tu calificación (A-F):");
        String letra = scn.nextLine().toUpperCase();
        String calif = "";

        switch (letra){
            case "A" ->{calif = "Excelente";}
            case "B" ->{calif = "Muy Bien";}
            case "C" ->{calif = "Bien";}
            case "D" ->{calif = "Suficiente";}
            case "F" ->{calif = "Insuficiente";}
            default -> {System.out.println("Letra no esperada."); return;}
        }
        System.out.printf("Calificación %s: %s", letra, calif);


    }
}

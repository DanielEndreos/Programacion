package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Ejercicio 10: Combinando switch y for - Sistema de repeticiones

        // Crea un programa que muestre un menú con 3 tipos de ejercicios:
        // 1=Flexiones, 2=Abdominales, 3=Sentadillas. Pide al usuario que
        // elija un ejercicio y cuántas repeticiones quiere hacer. Usa un
        // switch para determinar el ejercicio y un for para contar las
        // repeticiones una a una.

        //--- EJERCICIOS ---
        //1. Flexiones
        //2. Abdominales
        //3. Sentadillas
        //Elige un ejercicio (1-3): 1
        //¿Cuántas repeticiones?: 5
        //Has elegido: Flexiones
        //Repetición 1 completada
        //Repetición 2 completada
        //Repetición 3 completada
        //Repetición 4 completada
        //Repetición 5 completada
        //¡Ejercicio completado! Has hecho 5 flexiones.

        Scanner scn = new Scanner(System.in);

        System.out.print("""
        --- EJERCICIOS ---
          1. Flexiones
          2. Abdominales
          3. Sentadillas
        """);
        System.out.printf("Elige un ejercicio (1-3): ");
        int eje = scn.nextInt();

        String txteje = "";
        switch (eje){
            case 1 -> {txteje = "Flexiones";}
            case 2 -> {txteje = "Abdominales";}
            case 3 -> {txteje = "Sentadillas";}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }

        System.out.printf("¿Cuantas repeticiones? ");
        int repet = scn.nextInt();

        System.out.printf("Has elegido: %s", txteje);

        for (int i = 1; i <= repet; i++){
            System.out.printf("%nRepetición %d completada", i);
        };
        System.out.printf("%n¡Ejercicio completado! Has hecho %s flexiones.", repet);


    }
}

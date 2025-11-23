package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Ejercicio 5: Estaciones del año

        // Desarrolla un programa que pida un mes (número del 1 al 12) y use un
        // switch para determinar la estación del año: Invierno (12, 1, 2),
        // Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
        //
        //Ejemplo de salida por consola:
        //Introduce el número del mes (1-12): 7
        //El mes 7 corresponde a: Verano

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12):  ");
        int mes= scn.nextInt();
        String txtEstacion = "";

        switch (mes){
            case 12, 1, 2  ->{txtEstacion = "Invierno";}
            case 3, 4, 5   ->{txtEstacion = "Primavera";}
            case 6, 7, 8   ->{txtEstacion = "Verano";}
            case 9, 10, 11 ->{txtEstacion = "Otoño";}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
        System.out.printf("El mes %d corresponde a: %s", mes, txtEstacion);

    }
}

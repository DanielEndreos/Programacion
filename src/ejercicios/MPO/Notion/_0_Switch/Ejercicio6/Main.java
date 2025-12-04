package ejercicios.MPO.Notion._0_Switch.Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetivo: Crear un programa que genere saludos diferentes según la hora del día.
        //Requisitos:
        //Crea un métod.o obtenerHoraActual() que devuelva un número entre 0 y 23.
        //En el main, llama al métod.o y usa switch(true) para clasificar en: Madrugada (0-5), Mañana (6-11), Tarde (12-19), Noche (20-23).
        //Muestra un saludo apropiado para cada período del día.
        Scanner scn = new Scanner(System.in);

        int randomHour = (int)(Math.random()*24);
        System.out.println(randomHour);
        switch(randomHour){
            case 0,1,2,3,4,5 -> {System.out.println("Quien madruga dios le ayuda!");}
            case 6,7,8,9,10,11 -> {System.out.println("Buenos días!");}
            case 12,13,14,15,16,17 -> {System.out.println("Buenas tardes!");}
            case 18,19,20,21,22,23 -> {System.out.println("Buenas noches!");}
        }

    }
}

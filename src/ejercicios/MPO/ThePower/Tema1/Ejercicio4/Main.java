package ejercicios.MPO.ThePower.Tema1.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce la cantidad de segundos a calcular:");
        int segundosTotal = scn.nextInt();

        int horasTotal = segundosTotal/3600;
        int minutosTotal = (segundosTotal%3600)/60;
        int segundossTotal = (segundosTotal%3600)%60;


        System.out.println(horasTotal);
        System.out.println(minutosTotal);
        System.out.println(segundossTotal);
    }
}

package ejercicios.MPO.Notion._0_Switch.Ejercicio7;

import enums.ClasificacionNivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetivo: Crear un sistema que determine el nivel del jugador según su puntuación.
        //Requisitos:
        //Declara una variable int puntuacion.
        //Usa switch(true) para clasificar en niveles: Principiante (0-100), Intermedio (101-500), Avanzado (501-1000), Experto (1001-5000), Maestro (>5000).
        //Muestra el nivel alcanzado y un mensaje motivacional.
        //Otorga una recompensa virtual diferente para cada nivel.
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce los puntos: ");
        int puntuacion = scn.nextInt();
        switch (ClasificacionNivel.getNivel(puntuacion)){
            case Principiante -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Intermedio -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Avanzado -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Experto -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Maestro -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
        }

    }
}

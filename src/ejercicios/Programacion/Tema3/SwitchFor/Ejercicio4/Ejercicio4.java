package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Ejercicio 4: Menú de opciones

        // Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil,        //
        // 2=Configuración, 3=Ayuda, 4=Salir. Pide al usuario que elija una opción   //
        // y usa un switch para mostrar el mensaje correspondiente a cada opción.    //
        //--- MENÚ ---
        //1. Ver perfil
        //2. Configuración
        //3. Ayuda
        //4. Salir
        //Elige una opción: 2
        //Has seleccionado: Configuración

        Scanner scn = new Scanner(System.in);

        System.out.println("""
                --- MENÚ ---
                  1. Ver perfil
                  2. Configuración
                  3. Ayuda
                  4. Salir
                """);
        System.out.print("Elige una opción:  ");
        int opt= scn.nextInt();
        String txtopt = "";

        switch (opt){
            case 1 ->{txtopt = "Ver perfil";}
            case 2 ->{txtopt = "Configuración";}
            case 3 ->{txtopt = "Ayuda";}
            case 4 ->{txtopt = "Salir";}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
        System.out.printf("Has seleccionado: %s", txtopt);



    }
}

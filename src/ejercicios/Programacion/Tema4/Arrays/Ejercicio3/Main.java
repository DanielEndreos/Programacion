package ejercicios.Programacion.Tema4.Arrays.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Desarrolla un programa que cree un array
        vacío de tamaño 5. Usa un bucle for para
        pedir al usuario que introduzca 5 nombres,
        guardándolos en el array. Al final, muestra
        todos los nombres almacenados.

        Ejemplo de salida por consola:
        Nombres introducidos:
        Ana
        Luis
        María
        Carlos
        Elena
        */
        Scanner scn = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i=0; i< nombres.length; i++){
            System.out.print("Introduce un nombre: ");
            nombres[i] = scn.next();
        }

        System.out.println("Nombres introducidos: ");
        for (String nombre:nombres){
            System.out.println(nombre);
        }
    }
}

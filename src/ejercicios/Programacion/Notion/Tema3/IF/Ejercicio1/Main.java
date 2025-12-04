package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1: Mayor de edad

        //  Crea un programa que pida la edad del usuario y determine   //
        //  si es mayor de edad (18 años o más). Muestra un mensaje     //
        //  indicando si puede votar o no.                              //
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("Eres menor de edad. No puedes votar.");
        }

    }
}

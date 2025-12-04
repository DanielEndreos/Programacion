package ejercicios.Programacion.Notion.Tema3.SwitchFor.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 1: Día de la semana

        //  Crea un programa que pida un número del 1 al 7 y use un switch para      //
        //  mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).   //
        //                                                                           //
        //Ejemplo de salida por consola:                                             //
        // Introduce un número (1-7): 3                                              //
        //El día 3 es: Miércoles                                                     //

        Scanner scn = new Scanner(System.in);

        System.out.print("\n\nIntroduce un número (1-7):");
        int num = scn.nextInt();

        switch (num){
            case 1 ->  {System.out.printf("El día %d es Lunes.",num);}
            case 2 ->  {System.out.printf("El día %d es Martes.",num);}
            case 3 ->  {System.out.printf("El día %d es Miércoles.",num);}
            case 4 ->  {System.out.printf("El día %d es Jueves.",num);}
            case 5 ->  {System.out.printf("El día %d es Viernes.",num);}
            case 6 ->  {System.out.printf("El día %d es Sábado.",num);}
            case 7 ->  {System.out.printf("El día %d es Domingo.",num);}
            default -> {System.out.println("El número introducido no es compatible con día.");}
        };

    }
}

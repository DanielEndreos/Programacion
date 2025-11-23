package ejercicios.Programacion.Tema3.IF.Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 2: Número positivo o negativo

        //  Desarrolla un programa que pida un número al usuario y       //
        //  determine si es positivo, negativo o cero. Muestra el        //
        //  resultado por consola.                                       //

        Scanner scn = new Scanner(System.in);
        System.out.print("\n\nIntroduce un número:");
        int numA = scn.nextInt();
        if (numA < 0 ){
            System.out.println("El número es negativo.");
        } else if (numA > 0){
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

}

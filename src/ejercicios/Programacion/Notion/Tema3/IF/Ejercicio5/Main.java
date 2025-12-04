package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 5: Número par o impar con mensaje

        // Desarrolla un programa que pida un número entero y       //
        // determine si es par o impar usando el operador módulo.   //
        // Muestra un mensaje personalizado para cada caso.         //
        Scanner scn = new Scanner(System.in);
        System.out.print("\nIntroduce un número: ");
        int numA = scn.nextInt();

        if ((numA%2)==0){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        };

    }
}

package ejercicios.Programacion.Notion.Tema2.Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1: Operadores aritméticos básicos

        //  Crea un programa que pida al usuario dos números enteros por    //
        //  consola y muestre el resultado de las cinco operaciones         //
        //  aritméticas básicas: suma, resta, multiplicación, división y    //
        //  módulo (resto).                                                 //

        Scanner scn = new Scanner(System.in);

        System.out.print("\n\nIntroduce el primer número:");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número:");
        int numB = scn.nextInt();
        System.out.printf("Suma: %d", numA+numB);
        System.out.printf("\nResta: %d", numA-numB);
        System.out.printf("\nMultiplicación: %d", numA*numB);
        System.out.printf("\nDivisión: %.2f", (double)numA/numB);
        System.out.printf("\nMódulo (resto): %d", numA%numB);

    }
}

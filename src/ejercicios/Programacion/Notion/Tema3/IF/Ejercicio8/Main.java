package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 8: Comparar dos números

        // Desarrolla un programa que pida dos números al usuario    //
        // y determine cuál es mayor, o si son iguales. Muestra el   //
        // resultado por consola.                                    //

        Scanner scn = new Scanner(System.in);
        System.out.println("Introducie el primer número: ");
        int numA = scn.nextInt();
        System.out.println("Introducie el segundo número: ");
        int numB = scn.nextInt();

        if (numA > numB){
            System.out.printf("El número %d es mayor que %d. ", numA, numB);
        } else if (numB > numA){
            System.out.printf("El número %d es mayor que %d. ", numB, numA);
        } else {
            System.out.println("Los números son iguales.");
        };
    }
}

package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1: Contador básico con while

        //Crea un programa que pida un número N y use un bucle while para contar
        //desde 1 hasta N, mostrando cada número.
        //
        //Ejemplo de salida por consola:
        //
        //Introduce un número: 5
        // Contando con while:
        // 1
        // 2
        // 3
        // 4
        // 5
        // Fin del conteo
        Scanner scn = new Scanner(System.in);

        int i = 1;

        System.out.print("\n\nIntroduce un número: ");
        int num = scn.nextInt();

        System.out.println("Contando con while:");
        while (i <= num ) {
            System.out.println(i);
            i++;}
        System.out.println("Fin del conteo");
    }
}

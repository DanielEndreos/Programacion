package ejercicios.Programacion.Tema3.IF.Ejercicio7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 7: Calificación con letra

        // Crea un programa que pida una nota numérica (0-10) y determine   //
        // la calificación: Suspenso (0-4), Aprobado (5-6), Notable (7-8)   //
        // o Sobresaliente (9-10).                                          //

        // Introduce tu nota: 8
        // Tu calificación es: Notable

        Scanner scn = new Scanner(System.in);
        System.out.print("\nIntroduce tu nota: ");
        double nota = scn.nextDouble();

        if (nota < 0.0 || nota > 10.0 ) {
            System.out.printf("Introduce una nota correcta, %.1f no está comprendido entre 0 y 10", nota);
        } else {
            if (nota < 5) {
                System.out.println("Tu calificación es: Suspenso");
            } else if (nota < 7) {
                System.out.println("Tu calificación es: Aprobado");
            } else if (nota < 9) {
                System.out.println("Tu calificación es: Notable");
            } else {
                System.out.println("Tu calificación es: Sobresaliente");
            };
        };
    }
}

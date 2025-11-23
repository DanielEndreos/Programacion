package ejercicios.Programacion.Tema2.Ejercicio9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 9: Sistema de calificaciones

        // Escribe un programa que pida al usuario la puntuación de tres exámenes.        //
        // Calcula la nota media y usa operadores relacionales para determinar si         //
        // ha aprobado (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9).     //
        // Muestra todos los resultados.                                                  //
        Scanner scn = new Scanner(System.in);

        System.out.print("\nIntroduce la nota del primer examen: ");
        double nota1 = scn.nextDouble();

        System.out.print("Introduce la nota del segundo examen: ");
        double nota2 = scn.nextDouble();

        System.out.print("Introduce la nota del tercer examen: ");
        double nota3 = scn.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.printf("""
                Nota media: %.1f
                ¿Ha aprobado? (>=5): %s
                ¿Tiene notable? (>=7): %s
                ¿Tiene sobresaliente? (>=9): %s
                """, media, media>=5, media>=7, media>=9 );

    }
}

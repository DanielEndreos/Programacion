package ejercicios.Programacion.Tema2.Ejercicio7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 7: Operador NOT y condiciones compuestas

        // Crea un programa que pida al usuario su edad y si es             //
        // estudiante (true/false). Usa operadores lógicos (AND,            //
        // OR, NOT) para determinar si puede acceder a diferentes           //
        // descuentos: descuento joven (menor de 26 años), descuento        //
        // estudiante, o descuento especial (menor de 26 Y estudiante).     //
        Scanner scn = new Scanner(System.in);

        System.out.print("\nIntroduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = scn.nextBoolean();
        System.out.printf("""
                ¿Eres menor de 26 años?: %s
                ¿Eres estudiante?: %s
                ¿NO eres estudiante?: %s
                ¿Tienes descuento joven? (menor de 26): %s
                ¿Tienes descuento estudiante?: %s
                ¿Tienes descuento especial? (menor de 26 AND estudiante): %s                
                """, edad<26, estudiante, !estudiante, edad<26, estudiante, estudiante && edad<26);

    }
}

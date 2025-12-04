package ejercicios.Programacion.Notion.Tema2.Ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 5: Operadores lógicos AND y OR

        // Crea un programa que pida la edad del usuario y si tiene     //
        // carnet de conducir (true/false). Usa operadores lógicos      //
        // para determinar si puede alquilar un coche (debe tener       //
        // 21 años o más Y tener carnet).                               //
        Scanner scn = new Scanner(System.in);

        System.out.print("\nIntroduce tu edad: ");
        int edad = scn.nextInt();
        System.out.print("\n¿Tienes carnet de conducir? (true/false): ");
        boolean carnetConducir = scn.nextBoolean();

        System.out.printf("""
                ¿Eres mayor de 21 años?: %s
                ¿Tienes carnet?: %s
                ¿Puedes alquilar un coche? (AND): %s
                """, edad>=18, carnetConducir, edad>=18 && carnetConducir);


    }
}

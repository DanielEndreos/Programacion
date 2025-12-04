package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 6: Acceso a contenido por edad

        // Escribe un programa que pida la edad del usuario y determine   //
        // si puede acceder a contenido para mayores de 16 años. Si tiene //
        // 16 o más años, muestra "Acceso permitido", si no, muestra      //
        // "Acceso denegado".                                             //
        Scanner scn = new Scanner(System.in);
        System.out.print("\nIntroduce tu edad: ");
        int edad = scn.nextInt();

        if (edad < 16){
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        } else {
            System.out.println("Acceso permitido.");
        };
    }
}

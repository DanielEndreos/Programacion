package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Ejercicio 2: Validación de contraseña con do-while

        // Desarrolla un programa que pida al usuario una contraseña. La contraseña
        //correcta es "1234". Usa un bucle do-while para seguir pidiendo la contraseña
        // hasta que el usuario la introduzca correctamente.
        //
        //Ejemplo de salida por consola:
        // Introduce la contraseña: hola
        // Contraseña incorrecta. Intenta de nuevo.
        // Introduce la contraseña: 5678
        // Contraseña incorrecta. Intenta de nuevo.
        // Introduce la contraseña: 1234
        // ¡Contraseña correcta! Acceso permitido.

        String passwordOk = "1234";
        String password = "";
        do{
            System.out.print("\nIntroduce la contraseña: ");
            password = scn.next();
            if (password.equals(passwordOk)){
                System.out.print("¡Contraseña correcta! Acceso permitido.");
            } else {
                System.out.print("Contraseña incorrecta. Intenta de nuevo.");
            }
        }while(!password.equals(passwordOk));
    }
}

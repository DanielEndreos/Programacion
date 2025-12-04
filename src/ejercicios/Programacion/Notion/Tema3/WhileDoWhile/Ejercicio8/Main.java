package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 8: Validación de edad con do-while

        // Desarrolla un programa que pida la edad del usuario.
        // Usa un bucle do-while para validar que la edad introducida
        // esté entre 0 y 120. Si no es válida, debe volver a pedirla.
        // Una vez válida, muestra un mensaje de confirmación.
        //
        //Ejemplo de salida por consola:
        //Introduce tu edad: -5
        //Edad no válida. Debe estar entre 0 y 120.
        //Introduce tu edad: 150
        //Edad no válida. Debe estar entre 0 y 120.
        //Introduce tu edad: 25
        //Edad válida: 25 años. ¡Gracias!
        Scanner scn = new Scanner(System.in);

        int edad = 0;
        do{
            System.out.print("Introduce tu edad: ");
            edad = scn.nextInt();
            if(edad <0 || edad > 120){
                System.out.println("Edad no válida. Debe estar entre 0 y 120.");
            }
        }while(edad < 0 || edad > 120);
        System.out.printf("Edad válida: %d años.", edad);
    }
}

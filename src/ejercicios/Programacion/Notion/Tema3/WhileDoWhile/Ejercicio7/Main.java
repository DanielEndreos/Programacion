package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 7: Calcular promedio con while

        // Crea un programa que pida al usuario cuántas calificaciones va a introducir.
        // Luego, usa un bucle while para pedir cada calificación una por una, sumarlas
        // y al final calcular y mostrar el promedio.
        //
        //Ejemplo de salida por consola:
        //¿Cuántas calificaciones vas a introducir?: 4
        //Introduce la calificación 1: 7.5
        //Introduce la calificación 2: 8.0
        //Introduce la calificación 3: 6.5
        //Introduce la calificación 4: 9.0
        //Suma total: 31.0
        //Promedio de calificaciones: 7.75
        Scanner scn = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones vas a introducir?: ");
        int calificaciones = scn.nextInt();
        int i = 1;
        double totalSuma = 0;
        while (calificaciones > 0){
            System.out.printf("¿Introduce la calificación %d: ",i);
            double valor = scn.nextDouble();
            totalSuma += valor;
            i++;
            calificaciones--;
        }
        System.out.printf("Suma total: %.1f ",totalSuma);
        System.out.printf("\nPromedio de calificaciones: %.2f ",totalSuma/(i-1));
    }
}

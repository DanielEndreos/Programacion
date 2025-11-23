package ejercicios.Programacion.Tema2.Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3: Operadores de asignación compuesta

        // Crea un programa que declare una variable con valor inicial 100      //
        // y aplique diferentes operadores de asignación compuesta (+=, -=,     //
        // *=, /=). Muestra el valor de la variable después de cada operación.  //

        Scanner scn = new Scanner(System.in);
        int numA = 100;
        System.out.printf("Valor inicial: %d", numA);
        System.out.printf("\nDespués de sumar 50 (+=): %d", numA+= 50);
        System.out.printf("\nDespués de restar 30 (-=): %d", numA-= 30);
        System.out.printf("\nDespués de multiplicar por 2 (*=): %d", numA*= 2);
        System.out.printf("\nDespués de dividir entre 4 (/=): %d", numA/=4);


    }
}

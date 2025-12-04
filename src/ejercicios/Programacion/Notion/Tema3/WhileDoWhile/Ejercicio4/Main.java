package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 4: Adivinar número con do-while

        // Crea un juego donde el programa elige un número secreto entre 1 y 10
        //(por ejemplo, 7). Usa un bucle do-while para pedir al usuario que adivine
        //el número. El programa debe indicar si el número es mayor o menor, y continuar
        //hasta que el usuario acierte.   //
        //
        //1.¡Adivina el número entre 1 y 10!
        //Introduce tu intento: 5
        //El número es mayor. Intenta de nuevo.
        //Introduce tu intento: 8
        //El número es menor. Intenta de nuevo.
        //Introduce tu intento: 7
        //¡Correcto! Has adivinado el número en 3 intentos.
        Scanner scn = new Scanner(System.in);

        int numberToFind = (int)(Math.random()*10)+1;
        int numA = 0;
        int intentos = 0;

        System.out.print("\n¡Adivina el número entre 1 y 10!\n");
        do{
            intentos++;
            System.out.print("Introduce tu intento: ");
            numA = scn.nextInt();
            if (numA > numberToFind){
                System.out.println("El número es menor. Intenta de nuevo.");
            } else if (numA < numberToFind){
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.printf("¡Correcto! Has adivinado el número en %d intentos.", intentos);
            }
        }while(numA!=numberToFind);
    }
}

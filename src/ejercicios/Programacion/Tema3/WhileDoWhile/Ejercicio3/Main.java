package ejercicios.Programacion.Tema3.WhileDoWhile.Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3: Suma acumulativa con while

        // Escribe un programa que pida números al usuario y los vaya sumando.
        //El bucle while debe continuar mientras el usuario introduzca números
        //positivos. Cuando introduzca un número negativo o cero, el programa
        //debe terminar y mostrar la suma total.
        //
        //Ejemplo de salida por consola:

        //Introduce un número (0 o negativo para terminar): 5
        //Suma actual: 5
        //Introduce un número (0 o negativo para terminar): 10
        //Suma actual: 15
        //Introduce un número (0 o negativo para terminar): 3
        //Suma actual: 18
        //Introduce un número (0 o negativo para terminar): 0
        //Programa terminado. Suma total: 18
        Scanner scn = new Scanner(System.in);

        int numA = 0;
        int total = 0;

        while (numA > 0 || total==0){
            System.out.print("\nIntroduce un número (0 o negativo para terminar): ");
            numA = scn.nextInt();
            if (numA > 0){
                total+=numA;
                System.out.printf("Suma actual: %d  ", total);
            }
        }
        System.out.printf("Programa terminado. Suma total: %d  ", total);
    }
}

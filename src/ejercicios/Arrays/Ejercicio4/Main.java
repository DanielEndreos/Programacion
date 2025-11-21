package ejercicios.Arrays.Ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Crea un programa con un array de 7 números.
    Pide al usuario un número a buscar y usa un
    bucle for para recorrer el array. Si el número
    existe, muestra su posición. Si no existe, indica
    que no se encontró.

    Ejemplo de salida por consola:
        Array: [5, 12, 8, 3, 15, 9, 6]
        Introduce el número a buscar: 15
        El número 15 se encuentra en la posición 4

        Array: [5, 12, 8, 3, 15, 9, 6]
        Introduce el número a buscar: 20
        El número 20 no se encuentra en el array
     */

        Scanner scn = new Scanner(System.in);
        int[] numeros = {5,12,8,3,15,9,6};
        System.out.printf("Array: %s%n",Arrays.toString(numeros));
        System.out.print("Introduce el número a buscar: ");
        int numero = scn.nextInt();
        boolean existe = false;
        for (int i=0;i<numeros.length;i++){
            if (numero == numeros[i]){
                existe = true;
                System.out.printf("El número %d se encuentra en la posición %d", numero, i);
                break;
            }
        }
        if (!existe){
            System.out.printf("El número %d no encuentra en el array", numero);
        }
    }
}

package ejercicios.Programacion.Tema4.Arrays.Ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /* Crea un programa con un array de 10 palabras (pueden repetirse).
    Pide al usuario una palabra y usa un bucle for para contar cuántas
    veces aparece esa palabra en el array.

    Ejemplo de salida por consola:
    Array: ["gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"]
    Introduce la palabra a buscar: gato
    La palabra "gato" aparece 4 veces en el array
     */
    Scanner scn = new Scanner(System.in);

    String[] animales = {"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
    int cantidad = 0;

    System.out.print("Introduce la palabra a buscar: ");
    String busqueda = scn.next();

    for (String animal:animales){
        cantidad += animal.equalsIgnoreCase(busqueda)?1:0;
    }
        System.out.printf("La palabra '%s' aparece %d veces en el array ", busqueda, cantidad);

    }
}

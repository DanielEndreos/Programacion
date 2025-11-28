package ejercicios.Programacion.Tema4._0_ArraysUnidimensionales.Ejercicio2;

public class Main {
    public static void main(String[] args) {
    /*Escribe un programa que cree un array de 6 números enteros.
    Usa un bucle for para recorrer el array y mostrar cada número
    junto con su posición (índice).

    Ejemplo de salida por consola:
        Recorriendo el array:
        Posición 0: 10
        Posición 1: 20
        Posición 2: 30
        Posición 3: 40
        Posición 4: 50
        Posición 5: 60
     */

        int[] numeros = {10,20,30,40,50,60};
        System.out.println("Recorriendo el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posición %d: %d\n",i,numeros[i]);
        }

    }
}

package ejercicios.Programacion.Tema4.Arrays.Ejercicio7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Desarrolla un programa que cree un array de 6 números.
        Usa bucles for para encontrar el número mayor y el número menor del array,
        y muestra ambos resultados.

        Ejemplo de salida por consola:
        Array: [15, 8, 23, 4, 19, 12]
        El número mayor es: 23
        El número menor es: 4
         */
        int[] numeros = new int[6];
        int mayor = 0, menor = 0;
        for (int i=0; i<numeros.length;i++){
            numeros[i] = (int)(Math.random()*26);
        }
        for (int num : numeros ) {
            mayor = mayor>num?mayor:num;
            menor = menor!=0?(menor<num?menor:num):num;
        }
        System.out.printf("""
                Array: %s
                El número mayor es: %d
                El número menor es: %d
                """, Arrays.toString(numeros), mayor, menor);
    }
}

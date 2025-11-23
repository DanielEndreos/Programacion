package ejercicios.Programacion.Tema4.Arrays.Ejercicio5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Escribe un programa que defina un array de 10 números enteros.
        Usa un bucle for para contar cuántos números son mayores que 50
        y muestra el resultado.

        Array: [23, 67, 45, 89, 12, 56, 78, 34, 90, 43]
        Cantidad de números mayores que 50: 5
        */
        int[] numeros = {23, 67, 45, 89, 12, 56, 78, 34, 90, 43};
        int contaje = 0;
        for (int num : numeros){
            contaje+= num>50?1:0;
        };
        System.out.printf("""
                Array: %s
                Cantidad de números mayores que 50: %d
                """, Arrays.toString(numeros), contaje);
    }
}

package ejercicios.Programacion.Tema4.Arrays.Ejercicio6;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /*
        Crea un programa con un array de 8 números decimales.
        Recorre el array con un bucle for para calcular la suma
        de todos los elementos. Luego, calcula y muestra el promedio.

        Ejemplo de salida por consola:
        Array: [4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9]
        Suma total: 50.1
        Promedio: 6.2625
        */

        double[] numeros = {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};
        double suma = 0;
        for (double num : numeros){
            suma += num;
        }
        System.out.printf("""
                Array: %s
                Suma Total: %.1f
                Promedio: %.4f
                """, Arrays.toString(numeros), suma, suma/numeros.length);
    }
}

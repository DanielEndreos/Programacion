package ejercicios.Programacion.Notion.Tema4._0_ArraysUnidimensionales.Ejercicio9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Escribe un programa que cree un array de 7 números.
        Usa un bucle for para crear un nuevo array con los
        elementos en orden inverso. Muestra ambos arrays: el original y el invertido.

        Ejemplo de salida por consola:
        Array original: [2, 4, 6, 8, 10, 12, 14]
        Array invertido: [14, 12, 10, 8, 6, 4, 2]
        */
        int[] numeros = new int[7];
        int[] numInverso = new int[7];
        for (int i=0; i<numeros.length;i++){
            numeros[i] = (int)(Math.random()*26);
        }
        for (int i=numeros.length; i>0; i--){
            numInverso[i-1] = numeros[numeros.length-i];
        }
        System.out.printf("""
                Array original: %s
                Array invertido: %s
                """, Arrays.toString(numeros), Arrays.toString(numInverso));
    }

}

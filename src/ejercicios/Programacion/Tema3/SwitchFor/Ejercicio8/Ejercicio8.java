package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Ejercicio 8: Contar números pares e impares

        // Desarrolla un programa que pida un número N y use un bucle
        // for para contar cuántos números pares e impares hay desde 1
        // hasta N. Muestra ambos contadores.
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 10
        //Recorriendo números del 1 al 10...
        //Números pares encontrados: 5
        //Números impares encontrados: 5

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();
        System.out.printf("Recorriendo números del 1 al %s... ",num);
        int numpares = 0;

        for (int i = 1; i <=num; i++){
            if (i%2==0){
                numpares++;
            }
        };
        System.out.printf("%nNúmeros pares encontrados %d", numpares);
        System.out.printf("%nNúmeros impares encontrados %d", num-numpares);

    }
}

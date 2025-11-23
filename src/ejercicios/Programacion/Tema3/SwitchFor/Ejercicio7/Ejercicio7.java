package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Ejercicio 7: Suma de números con for

        // Crea un programa que pida un número N y use un bucle
        // for para calcular la suma de todos los números desde
        // 1 hasta N. Muestra el resultado final.
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 5
        //Sumando: 1 + 2 + 3 + 4 + 5
        //La suma de números del 1 al 5 es: 15

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();

        String textoSuma= "Sumando: ";
        int contaje = 0;

        for (int i = 1; i <=num; i++){
            textoSuma += i;
            contaje += i;
            if(i != num){
                textoSuma += " + ";
            }
        };
        System.out.println(textoSuma);
        System.out.printf("La suma de los números 1 al %d es: %d", num, contaje);


    }
}

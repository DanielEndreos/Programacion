package ejercicios.Programacion.Tema3.SwitchFor.Ejercicio9;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Ejercicio 9: Factorial con for

        // Escribe un programa que pida un número entero positivo y calcule
        // su factorial usando un bucle for. El factorial de N es:
        // N! = N × (N-1) × (N-2) × ... × 1

        //Introduce un número: 5
        //Calculando 5!
        //5 x 4 x 3 x 2 x 1
        //El factorial de 5 es: 120

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();
        System.out.printf("Calculando %d!", num);
        String text = "";
        BigInteger contaje = BigInteger.valueOf(1);

        for (int i = num; i > 0; i--){
            text += i;
            contaje= contaje.multiply(BigInteger.valueOf(i));
            if (i > 1){
                text += " x ";
            }
        };
        System.out.printf("%n%s", text);
        System.out.printf("%nEl factorial de %d es: %d", num, contaje);

    }
}

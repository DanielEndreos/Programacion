package ejercicios.Programacion.Notion.Tema3.SwitchFor.Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Ejercicio 6: Tabla de multiplicar con for

        // Escribe un programa que pida un número y use un bucle for
        // para mostrar su tabla de multiplicar del 1 al 10.
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 5
        //Tabla del 5:
        //5 x 1 = 5
        //5 x 2 = 10
        //5 x 3 = 15
        //5 x 4 = 20
        //5 x 5 = 25
        //5 x 6 = 30
        //5 x 7 = 35
        //5 x 8 = 40
        //5 x 9 = 45
        //5 x 10 = 50

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num= scn.nextInt();

        System.out.printf("Tabla del %d:%n", num);
        for (int i = 0; i <=10; i++){
            System.out.printf("%d x %d = %d%n",num, i, i*num);
        };



    }
}

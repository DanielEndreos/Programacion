package ejercicios.Programacion.Tema2.Ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 8: Operaciones combinadas

        // Desarrolla un programa que pida tres números al usuario      //
        // y calcule: la suma de los tres, el promedio, el resultado    //
        // de multiplicar el primero por el segundo y dividirlo entre   //
        // el tercero. Usa paréntesis para controlar la precedencia de  //
        // operadores.                                                  //

        Scanner scn = new Scanner(System.in);

        System.out.print("\nIntroduce el primer número: ");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numB = scn.nextInt();
        System.out.print("Introduce el tercer número: ");
        int numC = scn.nextInt();

        System.out.printf("\nSuma de los tres números: %d ", numA+numB+numC);
        System.out.printf("\nPromedio: %d ", (numA+numB+numC)/3);
        System.out.printf("\nResultado de (%d * %d) / %d: %.2f ", numA, numB, numC, (numA*numB)/(double)numC);


    }
}

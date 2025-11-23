package ejercicios.MPO.Tema1.SwitchAvanzado.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear una calculadora simple que realice operaciones según un operador.
        //Requisitos:
        // 1. Declara dos variables double num1 y double num2.
        // 2. Declara una variable char operador con valores posibles: '+','-','*','/'
        // 3. Usa un switch para realizar la operación correspondiente.
        // 4. Maneja el caso especial de división por cero.
        Scanner scn = new Scanner(System.in);

        double num1 = 10;
        double num2 = 5.5;
        char operador = '*';

        switch (operador) {
            case '+' -> {System.out.printf("El valor de la suma de %.1f + %.1f, es %.1f", num1, num2, num1 + num2);}
            case '-' -> {System.out.printf("El valor de la suma de %.1f - %.1f, es %.1f", num1, num2, num1 - num2);}
            case '*' -> {System.out.printf("El valor de la suma de %.1f * %.1f, es %.1f", num1, num2, num1 * num2);}
            case '/' -> {
                if (num2 != 0) {
                    System.out.printf("El valor de la suma de %.1f / %.1f, es %.1f", num1, num2, num1 / num2);
                } else {
                    System.out.println("Un número no puede divirse entre 0.");
                }
            }
        }
    }
}

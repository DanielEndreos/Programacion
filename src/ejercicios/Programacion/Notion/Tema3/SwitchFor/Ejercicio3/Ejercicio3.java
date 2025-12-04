package ejercicios.Programacion.Notion.Tema3.SwitchFor.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ejercicio 3: Calculadora básica con switch

        // Escribe un programa que pida dos números y una operación (+, -, *, /).   //
        // Usa un switch para realizar la operación correspondiente y mostrar el    //
        // resultado.                                                               //
        //                                                                          //
        //Ejemplo de salida por consola:

        //Introduce el primer número: 10
        //Introduce el segundo número: 5
        //Introduce la operación (+, -, *, /): *
        //Resultado: 10 * 5 = 50

        Scanner scn = new Scanner(System.in);

        System.out.print("\nIntroduce el primer número: ");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numB = scn.nextInt();
        System.out.print("Introduce la operación (+, -, *, /): ");
        String ope = scn.next();

        double resultado = 0;
        switch (ope){
            case "+" ->{resultado = numA+numB;}
            case "-" ->{resultado = numA-numB;}
            case "*" ->{resultado = numA*numB;}
            case "/" ->{resultado = (double)numA/numB;}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
        System.out.printf("Resultado: %d %s %d = %.1f", numA, ope, numB, resultado);


    }
}

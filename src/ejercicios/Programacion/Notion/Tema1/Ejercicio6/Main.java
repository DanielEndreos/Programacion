package ejercicios.Programacion.Notion.Tema1.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 6:  Operaciones aritméticas simples

        //    Escribe un programa que declare dos variables numéricas, realice       //
        //    las operaciones básicas (suma, resta, multiplicación y división)       //
        //    y muestre los resultados por consola.                                  //

        int numA= 10;
        int numB=  5;

        System.out.printf("\n\nNúmero 1: %d", numA);
        System.out.printf("\nNúmero 2: %d", numB);
        System.out.printf("\nSuma: %d", numA+numB);
        System.out.printf("\nResta: %d", numA-numB);
        System.out.printf("\nMultiplicación: %d", numA*numB);
        System.out.printf("\nDivisión: %.2f", (float)numA/numB);
    }
}

package ejercicios.Programacion.Tema2.Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 2: Comparación de números

        //  Escribe un programa que pida dos números al usuario     //
        //  y muestre el resultado de todas las comparaciones       //
        //  relacionales entre ellos (mayor que, menor que,         //
        //  igual, diferente, mayor o igual, menor o igual).        //

        Scanner scn = new Scanner(System.in);

        System.out.print("\n\nIntroduce el primer número:");
        int numA = scn.nextInt();
        System.out.print("Introduce el segundo número:");
        int numB = scn.nextInt();
        System.out.printf("¿.%d es mayor que .%d?: %s", numA, numB, (numA>numB));
        System.out.printf("\n¿.%d es menor que .%d?: %s", numA, numB, (numA<numB));
        System.out.printf("\n¿.%d es igual que .%d?: %s", numA, numB, (numA==numB));
        System.out.printf("\n¿.%d es diferente que .%d?: %s", numA, numB,(numA!=numB));
        System.out.printf("\n¿.%d es mayor o igual que .%d?: %s ", numA, numB, (numA>=numB));
        System.out.printf("\n¿.%d es menor o igual que .%d?: %s", numA, numB, (numA<=numB));

    }
}

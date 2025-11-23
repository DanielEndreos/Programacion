package ejercicios.Programacion.Tema2.Ejercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 4: Número par o impar

        // Desarrolla un programa que pida un número al usuario y   //
        // determine si es par o impar usando el operador módulo.   //
        // Muestra el resultado por consola.                        //
        Scanner scn = new Scanner(System.in);

        System.out.print("\nIntroduce un número:");
        int numA = scn.nextInt();
        int resto = numA%2;
        String parImpar = "";

        if (resto==0){
            parImpar = "par";
        }else{
            parImpar = "impar";
        };

        System.out.printf("El número %d es %s (resto al dividir entre 2: %d)", numA, parImpar, resto);


    }
}

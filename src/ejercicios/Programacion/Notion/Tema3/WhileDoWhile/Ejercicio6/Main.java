package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 6: Cuenta atrás con while

        // Escribe un programa que pida un número N y use un bucle while
        //para hacer una cuenta atrás desde N hasta 1, mostrando cada número.
        //Al llegar a 1, debe mostrar "¡Despegue!".
        //
        //Ejemplo de salida por consola:
        //Introduce un número: 5
        //Cuenta atrás:
        //5
        //4
        //3
        //2
        //1
        //¡Despegue!
        Scanner scn = new Scanner(System.in);

        System.out.print("\n\nIntroduce un número: ");
        int num = scn.nextInt();
        System.out.println("Cuenta atrás: ");
        while (num > 0) {
            System.out.println(num);
            num--;
        }
        System.out.println("¡Despegue!");


    }
}

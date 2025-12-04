package ejercicios.Programacion.Notion.Tema2.Ejercicio6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 6: Calculadora de descuento

        // Escribe un programa que pida el precio de un producto y el       //
        // porcentaje de descuento. Calcula el precio final después del     //
        // descuento usando operadores aritméticos y muestra todos los      //
        // pasos del cálculo.                                               //
        Scanner scn = new Scanner(System.in);
        System.out.print("\nIntroduce el precio del producto: ");
        double precio = scn.nextDouble();
        System.out.print("\nIntroduce el porcentaje de descuento: ");
        int descuento = scn.nextInt();
        System.out.printf("""
                Precio original: %.1f€
                Descuento (%d%%): %.1f€
                Precio final: %.1f€
                """, precio, descuento, precio*(descuento/100.0),((100-descuento)/100.0)*precio);

    }
}

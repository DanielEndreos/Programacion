package ejercicios.MPO.ThePower.Tema1.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Permítase introducir el valor con IVA de una compra con dos decimales (la
        compra no puede ser superior a 500€ ni inferior a 0€ y el valor del IVA de dicha
        compra (valor entero entre 0 y 25%.¿Cuánto costó la compra sin IVA?¿Cuánto fue
        el IVA? Muéstrese los resultados redondeados a dos decimales. Compra
        Valor de la compra (entre 0.00 y 500.00): 298,45
        IVA (entre 0 y 25%): 12
        Compra: 266,47 €
        IVA: 31,98 €
        */
        Scanner scn = new Scanner(System.in);
        double valorCompra = -1;
        int valorIVA = -1;

        do{
            try {
                System.out.print("Valor de la compra (entre 0.00 y 500.00): ");
                valorCompra = Math.round(scn.nextDouble()*100.0)/100.0;
            } catch (Exception e) {
                System.out.println("El valor introducido no es válido. Introduce un valor válido, recuerda ',' y valores entre 0 y 500.");
                scn.next();
            }
        }while(valorCompra <0 || valorCompra >500);

        do{
            try {
                System.out.print("IVA (entre 0 y 25%): ");
                valorIVA = scn.nextInt();
            } catch (Exception e) {
                System.out.println("El valor introducido no es válido. Introduce un valor válido, recuerda ',' y valores entre 0 y 25.");
                scn.next();
            }
        }while(valorCompra <0 || valorCompra >500);

        System.out.printf("""
                Compra: %.2f €
                IVA: %.2f €
                """, valorCompra - (valorCompra * (valorIVA/100.0)), valorCompra * (valorIVA/100.0) );
    }
}

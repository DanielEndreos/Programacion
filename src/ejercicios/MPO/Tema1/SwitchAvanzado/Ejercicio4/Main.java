package ejercicios.MPO.Tema1.SwitchAvanzado.Ejercicio4;

import enums.CateogriaPlato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Simular un sistema de pedidos de restaurante con diferentes categorías.
        //Requisitos:
        // 1. Crea un enum CateogriaPlato con: ENTRADA, PRINCIPAL, POSTRE, BEBIDA.
        // 2. Declara una variable del tipo enum.
        // 3. Usa un switch para mostrar 3 opciones disponibles de cada categoría.
        // 4. Agrupa categorías similares si es apropiado.
        Scanner scn = new Scanner(System.in);

        System.out.print("¿Que quieres saber del menú (Entrada / Principal / Bebida / Postre? ");
        String categoria = scn.next().toUpperCase();

        switch(CateogriaPlato.valueOf(categoria)){
            case ENTRADA -> {
                System.out.println("Croquetas de Jamón");
                System.out.println("Croquetas de Salmón");
                System.out.println("Croquetas de Bacalao");
            }
            case PRINCIPAL -> {
                System.out.println("Paella");
                System.out.println("Canelones");
                System.out.println("Arroz al Horno");
            }
            case BEBIDA -> {
                System.out.println("Coca-Cola");
                System.out.println("Pepsi");
                System.out.println("Agua");
            }
            case POSTRE -> {
                System.out.println("Crema Catalana");
                System.out.println("Helado de Coco");
                System.out.println("Brownie de Chocolate");
            }

        }


    }
}

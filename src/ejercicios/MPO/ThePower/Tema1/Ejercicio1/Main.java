package ejercicios.MPO.ThePower.Tema1.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("¿Cuantas bebidas vas a comprar?:");
        int nBebidas = scn.nextInt();
        System.out.println("¿Cuantos bocadillos vas a comprar?");
        int nBocadillos = scn.nextInt();

        System.out.println("¿Cuanto cuesta la bebida?");
        double precioBebida = scn.nextDouble();

        System.out.println("¿Cuanto cuesta el bocadillo?");
        double precioBocadillo = scn.nextDouble();

        System.out.println("¿Cuantas personas han realizado la compra?:");
        double nPersonas = scn.nextDouble();

        double costeBocadillos = nBocadillos*precioBocadillo;
        double costeBebida = nBebidas*precioBebida;
        double costeTotal = costeBebida+costeBocadillos;
        double costeIndividual = costeTotal/nPersonas;

        System.out.printf("El coste total de la compra por persona es de %.2f",costeIndividual);

    }
}

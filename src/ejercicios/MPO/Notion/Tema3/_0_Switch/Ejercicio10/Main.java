package ejercicios.MPO.Notion.Tema3._0_Switch.Ejercicio10;

import enums.EstadoPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Objetivo: Simular un sistema de seguimiento de pedidos con diferentes estados.
        //Requisitos:
        //1. Crea un enum EstadoPedido con: PENDIENTE, PROCESANDO, ENVIADO, EN_TRANSITO, ENTREGADO, CANCELADO.
        //2. Crea un métod.o obtenerEstadoActual() que devuelva aleatoriamente uno de estos estados.
        //3. En el main, usa un switch para mostrar un mensaje detallado del estado.
        //4. Indica el siguiente paso esperado para cada estado (excepto ENTREGADO y CANCELADO).

        switch (EstadoPedido.obtenerEstadoActual()){
            case PENDIENTE   -> {System.out.println("El producto se encuentra pendiente.");}
            case PROCESANDO  -> {System.out.println("El producto se encuentra procesando.");}
            case ENVIADO     -> {System.out.println("El producto se encuentra enviado.");}
            case EN_TRANSITO -> {System.out.println("El producto se encuentra en transito.");}
            case ENTREGADO   -> {System.out.println("El producto se encuentra entregado.");}
            case CANCELADO   -> {System.out.println("El producto se encuentra cancelado.");}
        }
    }
}

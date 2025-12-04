package ejercicios.Programacion.ThePower.Tema4.Ejercicio2;

import Metodos.CtrlMatriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
        y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
        seleccione la acción que quiere realizar:

        a. Imprimir array
        b. Mover a izquierda
        c. Mover a derecha
        d. Invertir
         */
        Scanner scn = new Scanner(System.in);
        int[] array = new int[10],
                tempArray = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random()*20)+1);
        }
        System.out.println("""
                    \nOpciones:
                    a. Imprimir array
                    b. Mover a izquierda
                    c. Mover a derecha
                    d. Invertir""");
        do{
            System.out.print("\nSelecciona una opción: ");
            String opcion = scn.next();
            switch (opcion){
                case "a" -> {
                    System.out.print("Valores: ");
                    for (int valor : array){
                        System.out.printf("%d ",valor);
                    }
                }
                case "b" -> {
                    int value = 0;
                    for (int i = 0; i < array.length ; i++) {
                        if (i == 0){
                            value = array[i];
                        } else if (i == array.length-1) {
                            array[i-1] = array[i];
                            array[i] = value;
                        } else{
                            array[i-1] = array[i];
                        }
                    }
                }
                case "c" -> {
                    int value = 0;
                    for (int i = array.length-1; i >= 0 ; i--) {
                        if (i == array.length-1){
                            value = array[i];
                            array[i] = array[i-1];
                        } else if (i == 0) {
                            array[i] = value;
                        } else{
                            array[i] = array[i-1];
                        }
                    }
                }
                case "d" -> {
                    for (int i = 0; i < array.length; i++) {
                        tempArray[(array.length-1)-i] = array[i];
                    }
                    array = tempArray.clone();
                }
            }
        }while(true);

    }
}

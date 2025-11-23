package ejercicios.Programacion.Tema3.IF.Ejercicio10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 10: Entrada a parque de atracciones

        // Crea un programa que pida la altura del usuario (en cm)      //
        // y determine si puede subir a una atracción. La altura        //
        // mínima es 120 cm y la máxima es 200 cm. Si está dentro       //
        // del rango, muestra "Puedes subir", si no, indica el motivo   //
        // (demasiado bajo o demasiado alto).                           //

        //Introduce tu altura en cm: 115
        //No puedes subir a la atracción. Altura mínima: 120 cm.
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu altura en cm: ");
        int altura = scn.nextInt();

        if (altura < 120)  {
            System.out.println("No puedes subir a la atracción. Altura mínima: 120 cm.");
        } else if (altura > 200){
            System.out.println("No puedes subir a la atracción. Altura máxima: 200 cm.");
        } else {
            System.out.println("Puedes subir.");
        };
    }
}

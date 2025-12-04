package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3: Aprobado o suspenso

        // Escribe un programa que pida la nota de un examen    //
        // (entre 0 y 10) y determine si el alumno ha aprobado  //
        // (nota mayor o igual a 5) o ha suspendido.            //

        //Introduce tu nota: 6.5
        //¡Enhorabuena! Has aprobado
        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double nota = scn.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.printf("""
            Has introducido una nota fuera de rango (0..10).
            Nota introducida: %.2f
            
            """, nota);
        } else {
            if (nota >= 5.0){
                System.out.println("¡Enhorabuena! Has aprobado.");
            } else {
                System.out.println("¡Qué lástima! Has suspendido.");
            }
        }

    }
}

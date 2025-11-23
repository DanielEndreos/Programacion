package ejercicios.Programacion.Tema3.WhileDoWhile.Ejercicio9;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 9: Combinando while, for y switch - Sistema de notas

        // Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
        // Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
        // Luego, usa un bucle for para mostrar todas las calificaciones y usa un switch para
        // convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.

        //¿Cuántos estudiantes hay?: 3
        //Introduce la nota del estudiante 1 (0-10): 8
        //Introduce la nota del estudiante 2 (0-10): 6
        //Introduce la nota del estudiante 3 (0-10): 9

        //--- REPORTE DE CALIFICACIONES ---
        //Estudiante 1: 8 puntos = Calificación B
        //Estudiante 2: 6 puntos = Calificación C
        //Estudiante 3: 9 puntos = Calificación A
        Scanner scn = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes hay?: ");
        int num= scn.nextInt();
        int i = 0;
        ArrayList<Integer> listadoNotas = new ArrayList<>();

        while(i < num){
            i++;
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", i);
            int nota= scn.nextInt();
            listadoNotas.add(nota);
        }

        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");
        for (int j = 0; j < listadoNotas.toArray().length; j++) {
            switch (listadoNotas.get(j)){
                case 0,1,2  -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"F");}
                case 3,4    -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"D");}
                case 5,6    -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"C");}
                case 7,8    -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"B");}
                case 9,10   -> {System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",j+1,listadoNotas.get(j),"A");}
            }
        }
    }
}

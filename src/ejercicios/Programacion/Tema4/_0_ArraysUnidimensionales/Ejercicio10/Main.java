package ejercicios.Programacion.Tema4._0_ArraysUnidimensionales.Ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Desarrolla un programa que pida al usuario cuántos estudiantes hay en una clase.
        Crea un array para almacenar sus calificaciones (0-10). Usa un bucle while para
        rellenar el array con las notas. Luego, usa un bucle for para:

        1. Mostrar todas las calificaciones
        2. Calcular el promedio de la clase
        3. Contar cuántos estudiantes aprobaron (nota ≥ 5)
        4. Encontrar la nota más alta y la más baja
        Ejemplo de salida por consola:
        ¿Cuántos estudiantes hay?: 5
        Introduce la nota del estudiante 1: 7.5
        Introduce la nota del estudiante 2: 4.0
        Introduce la nota del estudiante 3: 8.5
        Introduce la nota del estudiante 4: 6.0
        Introduce la nota del estudiante 5: 9.0

        --- REPORTE DE CALIFICACIONES ---
        Calificaciones: [7.5, 4.0, 8.5, 6.0, 9.0]
        Promedio de la clase: 7.0
        Estudiantes aprobados: 4
        Nota más alta: 9.0
        Nota más baja: 4.0
         */
        System.out.print("¿Cuántos estudiantes hay?: ");
        Scanner scn = new Scanner(System.in);
        int cantidadEstudiantes = scn.nextInt(), i = 0, estudAprobados = 0;
        double notaAlta = 0, notaBaja = 0, suma=0;
        double[] notas = new double[cantidadEstudiantes];

        while(i<cantidadEstudiantes){
            System.out.printf("Introduce la nota del estudiante %d: ", i+1);
            notas[i] = scn.nextDouble();
            suma += notas[i];
            notaAlta = notaAlta>notas[i]?notaAlta:notas[i];
            notaBaja = notaBaja!=0?(notaBaja<notas[i]?notaBaja:notas[i]):notas[i];
            estudAprobados += notas[i]>=5.0?1:0;
            i++;
        }

        System.out.printf("""
                --- REPORTE DE CALIFICACIONES ---
                Calificaciones: %s
                Promedio de la clase: %.1f
                Estudiantes aprobados: %d
                Nota más alta: %.1f
                Nota más baja: %.1f
                """, Arrays.toString(notas), suma/cantidadEstudiantes, estudAprobados, notaAlta, notaBaja );

    }
}

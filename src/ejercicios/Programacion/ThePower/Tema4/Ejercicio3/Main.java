package ejercicios.Programacion.ThePower.Tema4.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Desarrolla un programa en Java que permita registrar, calcular e informar
        las notas de varios alumnos utilizando arrays.

        a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
        b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
        nota inferior a 0 y superior a 10 volverá a pedirla
        c. Calcula y muestra:

        i. La nota media de la clase.
        ii. La nota más alta y la más baja.
        iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
        suspendido.
         */
        Scanner scn = new Scanner(System.in);
        int aprobados = 0;
        double sumaNotas = 0.0,
                notaAlta = 0.0,
                notaBaja = 0.0;
        double[] notasAlumnos= new double[10];

        for (int i = 0; i < notasAlumnos.length; i++) {
            do{
            System.out.printf("Introduce la nota del alumno %d: ", i+1);
            notasAlumnos[i] = scn.nextDouble();
            }while(notasAlumnos[i]<0.0 || notasAlumnos[i]>10.0);
         sumaNotas += notasAlumnos[i];
         if (i > 0){
             notaAlta = notaAlta > notasAlumnos[i]?notaAlta:notasAlumnos[i];
             notaBaja = notaBaja < notasAlumnos[i]?notaBaja:notasAlumnos[i];
         } else{
             notaBaja = notaAlta = notasAlumnos[i];
         }
         aprobados += notasAlumnos[i]>=5.0?1:0;
        }

        System.out.printf("""
                Nota media clase: %.1f
                Nota más alta: %.1f
                Nota más baja: %.1f
                Alumnos aprobados: %d
                Alumnos suspendidos: %d 
                """, (sumaNotas/notasAlumnos.length), notaAlta, notaBaja, aprobados, (notasAlumnos.length-aprobados));
    }
}

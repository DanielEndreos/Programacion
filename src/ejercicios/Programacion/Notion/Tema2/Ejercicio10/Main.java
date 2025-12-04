package ejercicios.Programacion.Notion.Tema2.Ejercicio10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 10: Calculadora de salario con condiciones

        // Crea un programa que pida el salario base por hora, las      //
        // horas trabajadas y si ha hecho horas extra (true/false).     //
        // Si ha hecho horas extra y trabajó más de 40 horas, las       //
        // horas que excedan de 40 se pagan al doble. Usa operadores    //
        // lógicos, relacionales y aritméticos para calcular el salario //
        // total.                                                       //
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce el salario por hora: ");
        double salarioBase = scn.nextDouble();
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = scn.nextInt();
        System.out.println("¿Has hecho horas extra? (true/false):");
        boolean horasExtraTrabajadas = scn.nextBoolean();

        int horasDobles = 0;
        int horasNormales = 0;

        if (!horasExtraTrabajadas && horasTrabajadas>40){
            System.out.printf("""
                    Algo no has hecho bien, has trabajado más de 40 horas (%dh) y dices
                    no haber hecho horas extra.
                    """, horasTrabajadas);
        } else if (horasExtraTrabajadas && horasTrabajadas<40){
            System.out.printf("""
                    Algo no has hecho bien, has trabajado menos de 40 horas (%dh) y dices
                    haber hecho horas extra.
                    """, horasTrabajadas);
        } else {
            if (horasExtraTrabajadas && horasTrabajadas>40){
                horasDobles = horasTrabajadas - 40;
                horasNormales = 40;
            } else {
                horasDobles = 0;
                horasNormales = horasTrabajadas;
            }
            System.out.printf("""
                Horas normales (máximo 40): %d
                Horas extra: %d
                ¿Se aplican horas extra? (>40 AND permitido): %s
                Salario por horas normales: %.1f
                Salario por horas extra (al doble): %.1f
                Salario total: %.1f    
                """, horasNormales,
                    horasDobles,
                    horasExtraTrabajadas,
                    horasNormales*salarioBase,
                    horasDobles*(salarioBase*2),
                    ((horasNormales*salarioBase) + (horasDobles*(salarioBase*2))));


        }

    }
}

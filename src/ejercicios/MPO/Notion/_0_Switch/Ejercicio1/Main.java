package ejercicios.MPO.Notion._0_Switch.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Crear un programa que convierta una calificación numérica (0-10)
        //en su equivalente alfabético usando un switch.
        //Requisitos:
        //Declara una variable double calificacion con un valor entre 0 y 10.
        //Usa un switch para convertir la calificación a una letra (A, B, C, D, F).
        //Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
        //Muestra un mensaje apropiado para cada calificación.

        Double calificacion = 10.0;

        switch(calificacion){
            case Double n when (n>= 0 && n <=3.9) -> {System.out.println("F");}
            case Double n when (n>= 4 && n <=4.9) -> {System.out.println("D");}
            case Double n when (n>= 5 && n <=6.9) -> {System.out.println("C");}
            case Double n when (n>= 7 && n <=8.9) -> {System.out.println("B");}
            case Double n when (n>= 9 && n <=10)  -> {System.out.println("A");}
            default -> throw new IllegalStateException("Unexpected value: " + calificacion);
        }

    }
}

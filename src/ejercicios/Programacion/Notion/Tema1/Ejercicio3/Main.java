package ejercicios.Programacion.Notion.Tema1.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3: Modificar variables

        //      Define cinco variables con diferentes tipos de datos (String,      //
        //      int, boolean, double, char) y muestra tanto su valor como su tipo. //
        String nombre = "Carlos";
        Integer edad = 30;
        Boolean estudiante = true;
        Double altura = 1.75;
        Character letra = 'c';

        System.out.printf("\n\nNombre: %s - Tipo: %s", nombre, nombre.getClass().getSimpleName());
        System.out.printf("\nEdad: %d - Tipo: %s", edad, edad.getClass().getSimpleName());
        System.out.printf("\n¿Es estudiante?: %s - Tipo: %s", estudiante, estudiante.getClass().getSimpleName());
        System.out.printf("\nAltura: %.2f - Tipo: %s", altura, altura.getClass().getSimpleName());
        System.out.printf("\nEdad: %s - Tipo: %s", letra, letra.getClass().getSimpleName());
    }
}

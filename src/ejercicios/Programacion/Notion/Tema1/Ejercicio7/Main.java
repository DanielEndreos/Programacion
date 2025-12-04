package ejercicios.Programacion.Notion.Tema1.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 7:  Presentación personal

        //    Crea un programa que almacene tu información personal (nombre,    //
        //    apellido, edad y ciudad) en variables y muestre un mensaje de     //
        //    presentación por consola.                                         //

        String nombre   = "Daniel";
        String apellido = "Meco";
        int    edad     = 35;
        String ciudad   = "Valencia";

        System.out.printf("""
        \n\n¡Hola! Me llamo %s %s.
        Tengo %d años y vivo en %s.""", nombre, apellido, edad, ciudad);

    }
}

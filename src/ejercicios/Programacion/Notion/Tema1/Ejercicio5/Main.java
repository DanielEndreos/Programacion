package ejercicios.Programacion.Notion.Tema1.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 5: Declaración y uso de constantes

        //    Crea un programa que use constantes para almacenar información       //
        //    que no debe cambiar (como el valor de PI o el nombre de una          //
        //    aplicación) y variables para información que puede cambiar.          //
        //    Muestra todos los valores.                                           //


        //Variables con información que NO puede cambiar
        final String APP = "MiApp";
        final String VERSION = "1.0.0";
        final double PIVALUE = Math.PI;
        String actualUser = "Laura";
        int nivel = 1;
        int puntuacion = 0;


        System.out.printf("\n\nAplicación: %s", APP);
        System.out.printf("\nVersión: %s", VERSION);
        System.out.printf("\nValor de PI: %.5f", PIVALUE);
        System.out.printf("\nUsuario Actual: %s", actualUser);
        System.out.printf("\nNivel: %d", nivel);
        System.out.printf("\nPuntuación: %d", puntuacion);

        //Variables con información que pueden cambiar
        actualUser = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.printf("\nUsuario actualizado: %s", actualUser);
        System.out.printf("\nNivel actualizado: %d", nivel);
        System.out.printf("\nPuntuación actualizada: %d", puntuacion);


    }
}

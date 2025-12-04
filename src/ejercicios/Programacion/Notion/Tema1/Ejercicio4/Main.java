package ejercicios.Programacion.Notion.Tema1.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 4: Variables con nombres descriptivos

        //    Crea un programa que simule la información de un libro usando        //
        //    variables con nombres descriptivos. Muestra toda la información      //
        //    del libro en la consola.                                             //

        String tituloLibro = "Don Quijote de la Mancha";
        String autorLibro  = "Miguel de Cervantes";
        int añoPublicacion = 1605;
        int numPaginas = 863;
        boolean disponible = true;

        System.out.printf("\n\nTítulo: %s", tituloLibro );
        System.out.printf("\nAutor: %s", autorLibro);
        System.out.printf("\nAño de publicación: %d", añoPublicacion);
        System.out.printf("\nNúmero de páginas: %d", numPaginas);
        System.out.printf("\n¿Disponible en biblioteca?: %s", disponible);
    }
}

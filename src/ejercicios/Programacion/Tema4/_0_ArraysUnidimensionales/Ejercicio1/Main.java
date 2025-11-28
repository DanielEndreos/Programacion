package ejercicios.Programacion.Tema4._0_ArraysUnidimensionales.Ejercicio1;

public class Main {

    public static void main(String[] args) {
    /*Crea un programa que defina un array llamado frutas con 5 nombres de frutas.
    Luego, muestra todos los elementos del array en la consola, uno por línea.

        Ejemplo de salida por consola:
        Frutas en el array:
        Manzana
        Plátano
        Naranja
        Fresa
        Uva

     */

        String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};

        System.out.println("Frutas en el array:");
        for (String fruta: frutas){
            System.out.println(fruta);
        };

}
}

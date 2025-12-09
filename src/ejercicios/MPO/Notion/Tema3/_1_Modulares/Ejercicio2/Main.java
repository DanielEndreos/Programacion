package ejercicios.MPO.Notion.Tema3._1_Modulares.Ejercicio2;

public class Main {
    static void main(String[] args) {
        /*
        Ejercicio 2: Búsqueda de Número en Array

        Objetivo: Crear un method que busque un número en un
        array y use break para salir del bucle cuando lo encuentre.

        Requisitos:
        1. Crea un method `int buscarNumero(int[] numeros, int objetivo)`.
        2. El method debe recorrer el array con un `for`.
        3. Cuando encuentre el número objetivo, usa `break` para salir del bucle.
        4. Devuelve el índice donde se encontró el número, o -1 si no se encontró.
        5. En el `main`, crea un array de enteros y prueba el method.
        */
        int[] numList = {20,25,20,21,2,3,7,34,46,42,12,24,67,94,123};
        System.out.println(buscarNumero(numList, 24));
        System.out.println(buscarNumero(numList, 2));
        System.out.println(buscarNumero(numList, 8));

    }

    public static int buscarNumero(int[] numeros, int objetivo){
        for (int i=0; i<numeros.length;i++){
            if (numeros[i]==objetivo){
                return i;
            }
        }
        return -1;
    }
}

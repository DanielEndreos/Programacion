package ejercicios.MPO.Notion._1_Modulares.Ejercicio3;

public class Main {
    static void main(String[] args) {
        /*
        Ejercicio 3: Filtrador de Números Pares
        Objetivo: Crear un method que muestre solo números pares de un array usando continue.
        Requisitos:
        1. Crea un method `void mostrarPares(int[] numeros)`.
        2. Recorre el array con un bucle `for`.
        3. Si el número es impar, usa `continue` para saltar a la siguiente iteración.
        4. Si el número es par, muéstralo en pantalla.
        5. En el `main`, crea un array con números del 1 al 20 y llama al method.
         */
        int[] numlist = {10,20,31,23,24,15,5215,6,5,54,25,23,32,325,4,53,6};
        System.out.print("Los números pares son: [");
        mostrarPares(numlist);
        System.out.print(" ]");

    }

    public static void mostrarPares(int[] numeros){
        for (int num:numeros){
            if (num%2!=0){
            continue;
            }
            System.out.printf(" %d",num);
        }
    }
}

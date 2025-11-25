package ejercicios.MPO.Tema1.Modulares.Ejercicio7;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 7: Generador de Secuencia de Fibonacci

        **Objetivo:** Crear un method que genere la secuencia de Fibonacci
        hasta un límite usando `break`.

        **Requisitos:**

        1. Crea un method `void generarFibonacci(int limite)`.
        2. Genera la secuencia de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13...).
        3. Usa un bucle `while(true)` infinito.
        4. Cuando el siguiente número supere el límite, usa `break` para salir.
        5. Muestra todos los números generados.
        6. En el `main`, prueba con diferentes límites como 100, 1000, 10000.

         */
        generarFibonacci(10000);
    }
    public static void generarFibonacci(int limite){
        int numA = 0;
        int numB = 0;
        int resultado = 0;
        while(true){
            if (numA == 0){
                System.out.print(numA);
                numB = 1;
                System.out.printf(" %d",numB);
            }
            resultado = numA+numB;
            System.out.printf(" %d",resultado);
            numA=numB;
            numB=resultado;

            if (resultado >= limite){
                break;
            }
        }
    }
}

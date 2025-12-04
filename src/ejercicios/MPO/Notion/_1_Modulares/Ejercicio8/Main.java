package ejercicios.MPO.Notion._1_Modulares.Ejercicio8;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 8: Validador de Edad con Múltiples Criterios

        **Objetivo:** Crear un method que valide edades en un array,
        saltando valores inválidos con `continue`.

        **Requisitos:**

        1. Crea un method `int contarEdadesValidas(int[] edades)`.
        2. Recorre el array de edades.
        3. Si la edad es negativa o mayor a 120, usa `continue` para ignorarla.
        4. Cuenta las edades válidas.
        5. Devuelve el contador de edades válidas.
        6. Crea otro method `void mostrarEdadesValidas(int[] edades)` que muestre solo las edades válidas.

         */
        int[] ageList = {
                -3, 5, 12, 30, 45, 67, 89, 23, 14, 9,
                110, 118, 0, 34, 56, 72, 95, 120, 8, 41,
                -1, 130, 140, 27, 60, 99, 101, 35, 50, 80
        };
        System.out.printf("Hay %d edades válidas.",contarEdadesValidas(ageList));
        mostrarEdadesValidas(ageList);
        mostrarEdadesInvalidas(ageList); //Extra
    }
    public static int contarEdadesValidas(int[] edades){
        int contador = 0;
        for (int edad: edades){
            if (edad>0 && edad<=120){
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarEdadesValidas(int[] edades){
        System.out.printf("%nEdades válidas: ");
        for (int edad: edades){
            if (edad>0 && edad<=120){
                System.out.printf(" %d",edad);;
            }
        }
    }

    public static void mostrarEdadesInvalidas(int[] edades){
        System.out.printf("%nEdades inválidas: ");
        for (int edad: edades){
            if (edad<0 || edad>120){
                System.out.printf(" %d",edad);;
            }
        }
    }
}

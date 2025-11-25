package ejercicios.MPO.Tema1.Modulares.Ejercicio9;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 9: Analizador de Texto con Múltiples Métodos

        **Objetivo:** Crear varios métodos modulares que analicen un texto y usen `return`,
        `break` y `continue`.

        **Requisitos:**

        1. Crea un method `int contarVocales(String texto)` que cuente vocales, usando `continue` para consonantes.
        2. Crea un method `boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas)` que use `return true` en cuanto encuentre una palabra prohibida.
        3. Crea un method `String primeraPalabraLarga(String texto, int longitudMinima)` que busque y devuelva la primera palabra que supere la longitud mínima usando `return`.
        4. En el `main`, prueba todos los métodos con diferentes textos.

         */
        String frase = "Este perro no come salchicha";
        String[] forgivenWords = {"salchicha", "perrito"};

        // Metodo 1
        System.out.print(contarVocales(frase));

        // Metodo 2
        if (contienePalabraProhibida(frase, forgivenWords)){
            System.out.println("\nLa frase contiene palabras prohibidas");
        } else{
            System.out.println("\nLa frase no contiene palabras prohibidas");
        }
        // Metodo 3
        System.out.println(primeraPalabraLarga(frase, 8));
    }

    static public int contarVocales(String texto){
        char[] chatTexto = texto.toCharArray();
        int contador = 0;
        for (char vocal:chatTexto){
            if ("aeiouAEIOU".indexOf(vocal)==-1){
                continue;
            }
            contador++;
        }
        return contador;
    }

    static public boolean contienePalabraProhibida(String texto, String[] palabrasProhibidas){
        texto.replace(".","");
        texto.replace(",","");
        String[] palabras = texto.split(" ");

        for (String word : palabras){
            for (String prohibido: palabrasProhibidas){
                if (word.equalsIgnoreCase(prohibido)){
                    return true;
                }
            }
        }
    return false;
    }

    static public String primeraPalabraLarga(String texto, int longitudMinima){
        texto.replace(".","");
        texto.replace(",","");
        String[] palabras = texto.split(" ");
        for (String word : palabras){
            if (word.length() >= longitudMinima) {
                return word;
            }
        }
        return "No hay ningúna palabra con una longitud superior a la longitud mínima";
    }
}

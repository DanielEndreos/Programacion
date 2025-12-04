package ejercicios.Programacion.Notion.Tema3.IF.Ejercicio12;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 12: Validador de contraseña
        // Crea un programa que pida al usuario crear una contraseña.           //
        // La contraseña debe cumplir estos requisitos: tener al menos          //
        // 8 caracteres de longitud, contener al menos un número, y NO          //
        // puede ser "12345678" o "password". El programa debe verificar        //
        // cada condición por separado usando operadores lógicos y mostrar      //
        // si la contraseña es válida o no, indicando qué requisitos no cumple. //
        //
        // Nota: Para este ejercicio, asume que tienes funciones auxiliares     //
        // como longitudCadena(texto), contienNumero(texto).                    //
        Scanner scn = new Scanner(System.in);
        String password = "";
        boolean passValida = false;

        do {
            System.out.print("\nIntroduce una contraseña: ");
            password = scn.nextLine();

            if (password.length() < 8) {
                System.out.printf("La contraseña tiene %d carácteres (mín = 8).\n", password.length());
            };

            if (password.equals("12345678") || password.toLowerCase(Locale.ROOT).equals("password")) {
                System.out.printf("La contraseña introducida es %s, esta contraseña no está permitida.\n", password);
            };

            if ( !(password.matches(".*\\d.*")) ) {
                System.out.printf("La contraseña introducida no contiene números, debe incluir mínimo un número decimal.\n", password);
            };

        } while (password.length() < 8 || password.equals("12345678") || password.toLowerCase(Locale.ROOT).equals("password") || !(password.matches(".*\\d.*")));

        passValida = true;

        //Realmente si hemos llegado aquí, se supone que hemos pasado todos los filtros,
        //por lo que las variables podrían ser directamente False o True
        System.out.printf("Longitud de la contraseña: %d\n", password.length() );
        System.out.printf("¿Tiene al menos 8 caracteres?: %s\n", password.length() >= 8 );
        System.out.printf("¿Contiene al menos un número?: %s\n", password.matches(".*\\d.*") );
        System.out.printf("¿Es una contraseña prohibida?: %s\n", (password.equals("12345678") || password.toLowerCase(Locale.ROOT).equals("password")) );
        System.out.printf("¿Es válida? (cumple todos los requisitos): %s\n", passValida);

    }
}

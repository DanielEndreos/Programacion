package ejercicios.MPO.Notion.Tema3._1_Modulares.Ejercicio5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 5: Sistema de Login con Intentos Limitados

        **Objetivo:** Crear un method que simule un sistema de login usando `break`
        cuando el login sea exitoso.

        **Requisitos:**

        1. Crea un method `boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta)`.
        2. El usuario tiene 3 intentos máximo.
        3. Usa un bucle `for` para los intentos.
        4. Simula el ingreso de usuario y contraseña (puedes usar valores hardcodeados diferentes en cada intento).
        5. Si las credenciales son correctas, usa `break` y devuelve `true`.
        6. Si se agotan los intentos, devuelve `false`.
         */
        String username = "Daniel";
        String password = "abcde2G8";
        System.out.printf("%s",intentarLogin(username,password)?"Usuario conectado":"Acceso denegado.");

    }
    public static boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta){
        Scanner scn = new Scanner(System.in);
        int intentos = 3;
        for (int i=1; i<=intentos; i++){
            System.out.print("Introduce tu usuario: ");
            String usuario = scn.next();

            System.out.print("Introduce tu contraseña: ");
            String password = scn.next();

            if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecta)){
                return true;
            } else {
                System.out.printf("Intento de conexión fallido, te quedan %d intentos.%n%n", intentos-i);
            }
        }
    return false;
    }
}

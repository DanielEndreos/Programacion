package ejercicios.MPO.Notion.Tema3._1_Modulares.Ejercicio1;

public class Main {
    static void main(String[] args) {
        /*
        Ejercicio 1: Validador de Contraseña

        Objetivo: Crear un métod o que valide una contraseña
        y use return para salir anticipadamente si no cumple los requisitos.

        Requisitos:
        1. Crea un métodó `boolean validarContrasena(String password)`.
        2. La contraseña debe tener al menos 8 caracteres. Si no cumple, usa `return false` inmediatamente.
        3. Debe contener al menos una letra mayúscula. Si no cumple, usa `return false`.
        4. Debe contener al menos un número. Si no cumple, usa `return false`.
        5. Si pasa todas las validaciones, devuelve `true`.
        6. En el `main`, prueba el métodó con diferentes contraseñas y muestra si son válidas o no.
         */
        String passwordText = "Prueba";
        System.out.printf("La contraseña '%s' %s%n",passwordText,validarContrasena(passwordText)==true?"es válida":"no es válida");
        passwordText = "abcDefgh";
        System.out.printf("La contraseña '%s' %s%n",passwordText,validarContrasena(passwordText)==true?"es válida":"no es válida");
        passwordText = "abcdefg8";
        System.out.printf("La contraseña '%s' %s%n",passwordText,validarContrasena(passwordText)==true?"es válida":"no es válida");
        passwordText = "abcDef8";
        System.out.printf("La contraseña '%s' %s%n",passwordText,validarContrasena(passwordText)==true?"es válida":"no es válida");
        passwordText = "abcDeDf8";
        System.out.printf("La contraseña '%s' %s%n",passwordText,validarContrasena(passwordText)==true?"es válida":"no es válida");

    }
    static public boolean validarContrasena(String password){
        boolean validPassword = password.length() >= 8;
        boolean mayusDetected = false;
        boolean digitDetected = false;
        char[] passCharArray = password.toCharArray();

        for (char letra: passCharArray){
            if (Character.isUpperCase(letra)){
                mayusDetected = true;
                break;
            }
        }
        for (char letra: passCharArray){
            if (Character.isDigit(letra)){
                digitDetected = true;
                break;
            }
        }

        if (validPassword && mayusDetected && digitDetected){
            return true;
        }else{
            return false;
        }
    }
}

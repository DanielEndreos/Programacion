package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio5;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Desarrolla un programa con un menú que se repita usando do-while.
        //El menú debe tener 4 opciones: 1=Saludar, 2=Despedirse, 3=Ver hora actual
        //(puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada
        //opción. El programa solo debe terminar cuando el usuario elija la opción 4.
        //
        //Ejemplo de salida por consola:
        //--- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 1
        //¡Hola! ¿Cómo estás?

        //--- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 3
        //La hora actual es: 10:30

        //--- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 4
        //¡Hasta luego!
        Scanner scn = new Scanner(System.in);

        System.out.println("""
                --- MENÚ ---
                  1. Saludar
                  2. Despedirse
                  3. Ver hora
                  4. Salir""");
        System.out.print("Elige una opción:  ");
        int opt= scn.nextInt();
        String txtopt = "";
        Date data = new Date();

        switch (opt){
            case 1 ->{System.out.print("¡Hola! ¿Cómo estás?");}
            case 2 ->{System.out.print("¡Hasta luego!");}
            case 3 ->{System.out.printf("La hora actual es: %s:%s",data.getHours(), data.getMinutes());}
            case 4 ->{System.out.print("¡Hasta luego!");}
            default -> {System.out.println("Operación no esperada/válida."); return;}
        }
    }
}

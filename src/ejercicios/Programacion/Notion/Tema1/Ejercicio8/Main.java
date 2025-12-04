package ejercicios.Programacion.Notion.Tema1.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 8:  Calculadora de área de un rectángulo

        //    Desarrolla un programa que calcule el área de un rectángulo.  //
        //    Declara variables para la base y la altura, y muestra el      //
        //    resultado del cálculo.                                        //

        int base = 5;
        int altura = 3;

        System.out.printf("""
                \n
                Base del rectángulo: %d
                Altura del rectángulo: %d
                El área del rectángulo es: %d
                
                """, base, altura, base*altura);
    }
}

package ejercicios.Programacion.Notion.Tema1.Ejercicio10;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 10:  Conversión de temperaturas

        //    Crea un programa que convierta una temperatura de grados      //
        //    Celsius a Fahrenheit. Usa una variable para la temperatura    //
        //    en Celsius y muestra el resultado de la conversión.           //
        //
        //La fórmula para convertir de Celsius a Fahrenheit es:             //
        //F = C × 9/5 + 32                                                  //

        double tempCelsius = 25.2;
        double tempFahren = tempCelsius * 9.0/5.0+ 32.0;
        System.out.printf("""
                \n
                Temperatura en Celsius: %.2f
                Temperatura en Fahrenheit: %.2f
                
                """, tempCelsius, tempFahren);

    }
}

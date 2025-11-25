package ejercicios.MPO.Tema1.Modulares.Ejercicio4;

public class Main {
    static void main(String[] args) {
        /*
        Ejercicio 4: Calculadora de Promedio con Validación

        Objetivo: Crear un method que calcule el promedio de notas,
        saltando notas inválidas con continue.

        Requisitos:
        1. Crea un method `double calcularPromedio(double[] notas)`.
        2. Recorre el array de notas.
        3. Si una nota es menor que 0 o mayor que 10, usa `continue` para ignorarla.
        4. Suma las notas válidas y cuenta cuántas hay.
        5. Devuelve el promedio de las notas válidas.
        6. En el `main`, prueba con un array que incluya algunas notas inválidas.
         */
        double[] notasList = {
                -3.2, -1.0, 0.5, 1.3, 2.7, 3.9, 5.0, 7.5, 10.0, 11.2,
                -4.8, -2.6, 4.4, 6.1, 8.9, 9.3, 12.0, -0.5, 2.0, 3.3,
                -3.9, 1.1, 6.7, 7.9, 10.8, -4.1, 5.6, 8.0, 9.9, 11.5
        };
        System.out.printf("El valor promedio de las notas válidas es: %.2f", calcularPromedio(notasList));
    }
    static public double calcularPromedio(double[] notas){
        double suma = 0.0;
        int qtyOk =0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<0||notas[i]>10){
                continue;
            }
            qtyOk += 1;
            suma+=notas[i];
        }

        if (qtyOk>0){
            return (suma/qtyOk);
        }else{
            return 0;
        }
    }
}

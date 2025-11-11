package ejercicios;

import enums.*;

import java.util.Scanner;

public class EjerciciosMPO {

    public void ejercicioMPO1 (Scanner scn){
        //Crear un programa que convierta una calificación numérica (0-10)
        //en su equivalente alfabético usando un switch.
        //Requisitos:
        //Declara una variable double calificacion con un valor entre 0 y 10.
        //Usa un switch para convertir la calificación a una letra (A, B, C, D, F).
        //Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
        //Muestra un mensaje apropiado para cada calificación.


    }

    public void ejercicioMPO2(Scanner scn){
        //Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.
        //Crea un enum Moneda con: DOLAR, LIBRA, YEN, PESO.
        //Declara una variable double euros con una cantidad.
        //Usa un switch con el enum para aplicar la tasa de conversión correspondiente.
        //Muestra el resultado de la conversión.

        System.out.print("Introduce una cantidad en €: ");
        double euros = scn.nextDouble();

        System.out.print("¿A que moneda quieres convertirlo?: ");
        String moneda = scn.next().toUpperCase();

        switch (Moneda.valueOf(moneda)){
            case YEN -> {System.out.printf("El cambio de %.1f€ a %s es %.1f¥.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case PESO ->{System.out.printf("El cambio de %.1f€ a %s es %.1f$ (peso).", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case DOLAR -> {System.out.printf("El cambio de %.1f€ a %s es %.1f$.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
            case LIBRA -> {System.out.printf("El cambio de %.1f€ a %s es %.1f£.", euros, moneda, euros*Moneda.valueOf(moneda).getValorMoneda());}
        }
    }

    public void ejercicioMPO3(Scanner scn){
        //Crear un programa que clasifique la temperatura en categorías usando rangos.
        //Requisitos:
        // 1. Declara una variable int temperatura en grados Celsius.
        // 2. Usa Switch(true) para clasificar la temperatura en: Helado(<0), Frío(0-15), Templado(16-25), Calor(26-35), Muy Caliente(>35).
        // 3. Muestra un mensaje descriptivo y una recomendación de vestimenta




    } //TODO

    public void ejercicioMPO4(Scanner scn){
        //Simular un sistema de pedidos de restaurante con diferentes categorías.
        //Requisitos:
        // 1. Crea un enum CateogriaPlato con: ENTRADA, PRINCIPAL, POSTRE, BEBIDA.
        // 2. Declara una variable del tipo enum.
        // 3. Usa un switch para mostrar 3 opciones disponibles de cada categoría.
        // 4. Agrupa categorías similares si es apropiado.

        System.out.print("¿Que quieres saber del menú (Entrada / Principal / Bebida / Postre? ");
        String categoria = scn.next().toUpperCase();

    switch(CateogriaPlato.valueOf(categoria)){
        case ENTRADA -> {
            System.out.println("Croquetas de Jamón");
            System.out.println("Croquetas de Salmón");
            System.out.println("Croquetas de Bacalao");
        }
        case PRINCIPAL -> {
            System.out.println("Paella");
            System.out.println("Canelones");
            System.out.println("Arroz al Horno");
        }
        case BEBIDA -> {
            System.out.println("Coca-Cola");
            System.out.println("Pepsi");
            System.out.println("Agua");
        }
        case POSTRE -> {
            System.out.println("Crema Catalana");
            System.out.println("Helado de Coco");
            System.out.println("Brownie de Chocolate");
        }

    }


    }

    public void ejercicioMPO5(Scanner scn) {
        //Crear una calculadora simple que realice operaciones según un operador.
        //Requisitos:
        // 1. Declara dos variables double num1 y double num2.
        // 2. Declara una variable char operador con valores posibles: '+','-','*','/'
        // 3. Usa un switch para realizar la operación correspondiente.
        // 4. Maneja el caso especial de división por cero.

        double num1 = 10;
        double num2 = 5.5;
        char operador = '*';

        switch (operador) {
            case '+' -> {System.out.printf("El valor de la suma de %.1f + %.1f, es %.1f", num1, num2, num1 + num2);}
            case '-' -> {System.out.printf("El valor de la suma de %.1f - %.1f, es %.1f", num1, num2, num1 - num2);}
            case '*' -> {System.out.printf("El valor de la suma de %.1f * %.1f, es %.1f", num1, num2, num1 * num2);}
            case '/' -> {
                if (num2 != 0) {
                    System.out.printf("El valor de la suma de %.1f / %.1f, es %.1f", num1, num2, num1 / num2);
                } else {
                    System.out.println("Un número no puede divirse entre 0.");
                }
            }
        }
    }

    public void ejercicioMPO6(Scanner scn){

        //Objetivo: Crear un programa que genere saludos diferentes según la hora del día.
        //Requisitos:
        //Crea un métod.o obtenerHoraActual() que devuelva un número entre 0 y 23.
        //En el main, llama al métod.o y usa switch(true) para clasificar en: Madrugada (0-5), Mañana (6-11), Tarde (12-19), Noche (20-23).
        //Muestra un saludo apropiado para cada período del día.

        int randomHour = obtenerHoraActual();
        System.out.println(randomHour);
        switch(randomHour){
            case 0,1,2,3,4,5 -> {System.out.println("Quien madruga dios le ayuda!");}
            case 6,7,8,9,10,11 -> {System.out.println("Buenos días!");}
            case 12,13,14,15,16,17 -> {System.out.println("Buenas tardes!");}
            case 18,19,20,21,22,23 -> {System.out.println("Buenas noches!");}
        }
    }

    private int obtenerHoraActual(){
        int hora = (int)(Math.random()*24);
        return hora;
    }

    public void ejercicioMPO7(Scanner scn){
        //Objetivo: Crear un sistema que determine el nivel del jugador según su puntuación.
        //Requisitos:
        //Declara una variable int puntuacion.
        //Usa switch(true) para clasificar en niveles: Principiante (0-100), Intermedio (101-500), Avanzado (501-1000), Experto (1001-5000), Maestro (>5000).
        //Muestra el nivel alcanzado y un mensaje motivacional.
        //Otorga una recompensa virtual diferente para cada nivel.
        System.out.print("Introduce los puntos: ");
        int puntuacion = scn.nextInt();
        switch (ClasificacionNivel.getNivel(puntuacion)){
            case Principiante -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Intermedio -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Avanzado -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Experto -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
            case Maestro -> {System.out.printf("Has alcanzado el nivel %s.", ClasificacionNivel.getNivel(puntuacion));}
        }

    }

    public void ejercicioMPO8(Scanner scn){
        // Objetivo: Crear un programa que identifique el tipo de archivo según su extensión.
        // Requisitos:
        // Declara una variable String extension (por ejemplo: "jpg", "pdf", "txt", "mp3").
        //Usa un switch para agrupar extensiones similares: Imágenes (jpg, png, gif),
        // Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
        // Muestra el tipo de archivo y el programa recomendado para abrirlo.

        String extension = "jpg";

        switch (extension){
            case "jpg","png","gif"   -> {System.out.println("El archivo es una imagen. Puedes utilizar el Visor de Imágenes de Windows.");}
            case "pdf", "doc", "txt" -> {System.out.println("El archivo es un documento. Puedes utilizar Microsoft Word.");}
            case "mp3", "wav"        -> {System.out.println("El archivo es un audio. Puedes utilizar Reproductor de Musica.");}
            case "mp4", "avi"        -> {System.out.println("El archivo es una pelicula. Puedes utilizar VLC.");}
        }

        System.out.printf("\nOpción con ENUM: El archivo es de tipo %s.", TipoFile.findByType(extension));

    }

    public void ejercicioMPO9(Scanner scn){
        //Crear un programa que calcule y clasifique el Índice de Masa Corporal (IMC).
        //Requisitos:
        //Declara variables double peso (en kg) y double altura (en metros).
        //Calcula el IMC: peso / (altura * altura).
        //Usa switch(true) para clasificar: Bajo peso (<18.5), Normal (18.5-24.9), Sobrepeso (25-29.9), Obesidad (>=30).
        //Muestra el IMC calculado y la clasificación correspondiente.



    }  // TODO SWITCH(TRUE)

    public void ejercicioMPO10(Scanner scn){
        //Objetivo: Simular un sistema de seguimiento de pedidos con diferentes estados.
        //Requisitos:
        //1. Crea un enum EstadoPedido con: PENDIENTE, PROCESANDO, ENVIADO, EN_TRANSITO, ENTREGADO, CANCELADO.
        //2. Crea un métod.o obtenerEstadoActual() que devuelva aleatoriamente uno de estos estados.
        //3. En el main, usa un switch para mostrar un mensaje detallado del estado.
        //4. Indica el siguiente paso esperado para cada estado (excepto ENTREGADO y CANCELADO).

        switch (EstadoPedido.obtenerEstadoActual()){
            case PENDIENTE   -> {System.out.println("El producto se encuentra pendiente.");}
            case PROCESANDO  -> {System.out.println("El producto se encuentra procesando.");}
            case ENVIADO     -> {System.out.println("El producto se encuentra enviado.");}
            case EN_TRANSITO -> {System.out.println("El producto se encuentra en transito.");}
            case ENTREGADO   -> {System.out.println("El producto se encuentra entregado.");}
            case CANCELADO   -> {System.out.println("El producto se encuentra cancelado.");}
        }

    }

}

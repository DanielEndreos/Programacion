package ejercicios.MPO.Notion.Tema3._0_Switch.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        //Crear un programa que calcule y clasifique el Índice de Masa Corporal (IMC).
        //Requisitos:
        //Declara variables double peso (en kg) y double altura (en metros).
        //Calcula el IMC: peso / (altura * altura).
        //Usa switch(true) para clasificar: Bajo peso (<18.5), Normal (18.5-24.9), Sobrepeso (25-29.9), Obesidad (>=30).
        //Muestra el IMC calculado y la clasificación correspondiente.

        double peso = 100, altura = 1.8;
        Double IMC = peso / (altura*altura);

        switch (IMC){
            case Double n when (n<18.5) -> {System.out.printf("Bajo peso: %.1f IMC", IMC);}
            case Double n when (n>=18.5 && n<=24.9) -> {System.out.printf("Normal: %.1f IMC", IMC);}
            case Double n when (n>=25.0 && n<=29.9)-> {System.out.printf("Sobrepeso: %.1f IMC", IMC);}
            case Double n when (n>=30.0 && n<=35.0)-> {System.out.printf("Obesidad: %.1f IMC", IMC);}
            default -> throw new IllegalStateException("Unexpected value: " + IMC);
        }
    }
}

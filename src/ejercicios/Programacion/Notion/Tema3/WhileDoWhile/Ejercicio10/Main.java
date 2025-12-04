package ejercicios.Programacion.Notion.Tema3.WhileDoWhile.Ejercicio10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 10: Cajero automático con do-while, switch y while

        // Desarrolla un programa que simule un cajero automático.
        // El saldo inicial es 1000€. Usa un bucle do-while para mostrar
        // un menú con opciones: 1=Consultar saldo, 2=Retirar dinero,
        // 3=Depositar dinero, 4=Salir. Usa switch para cada opción. Para
        // retirar dinero, usa un bucle while para validar que no se retire
        // más del saldo disponible (si intenta retirar más, debe volver a
        // pedir la cantidad). Para depositar, valida que sea una cantidad
        // positiva.

        //--- CAJERO AUTOMÁTICO ---
        //Saldo inicial: 1000€

        //--- MENÚ ---
        //. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 1
        //Tu saldo actual es: 1000€

        //--- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 2
        //¿Cuánto deseas retirar?: 1500
        //Fondos insuficientes. Tu saldo es: 1000€
        //¿Cuánto deseas retirar?: 300
        //Retiro exitoso. Has retirado: 300€
        //Nuevo saldo: 700€

        //--- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 3
        //¿Cuánto deseas depositar?: 200
        //Depósito exitoso. Has depositado: 200€
        //Nuevo saldo: 900€

        //--- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 4
        //Gracias por usar el cajero. ¡Hasta luego!
        Scanner scn = new Scanner(System.in);

        int saldoActual= 1000;
        int dinero = 0;
        int opcion = 0;

        System.out.printf("""
        --- CAJERO AUTOMÁTICO ---
        Saldo inicial: %d€
        """,saldoActual);

        do{
            System.out.print("""
        \n--- MENÚ ---
        1. Consultar saldo
        2. Retirar dinero
        3. Depositar dinero
        4. Salir
        """);
            System.out.print("Elige una opción: ");
            opcion = scn.nextInt();
            switch (opcion){
                case 1 -> {System.out.printf("Tu saldo actual es: %d€\n", saldoActual);}
                case 2 -> {
                    do{
                        System.out.print("¿Cuánto deseas retirar?: ");
                        dinero = scn.nextInt();
                        if (dinero > saldoActual){
                            System.out.printf("Fondos insuficientes. Tu saldo es: %d€\n",saldoActual);
                        }
                    }while(dinero > saldoActual);
                    saldoActual-=dinero;
                    System.out.printf("Retiro exitoso. Has retirado: %d€\n",dinero);
                    System.out.printf("Nuevo saldo: %d€\n",saldoActual);
                }
                case 3 -> {
                    do{
                        System.out.print("¿Cuánto deseas depositar?: ");
                        dinero = scn.nextInt();
                        if (dinero < 0){
                            System.out.print("No se puede ingresar valores negativos.");
                        }
                    }while(dinero < 0);
                    saldoActual+=dinero;
                    System.out.printf("Depósito exitoso. Has depositado: %d€\n",dinero);
                    System.out.printf("Nuevo saldo: %d€\n",saldoActual);
                }
            }
        }while(opcion != 4);
        System.out.print("Gracias por usar el cajero. ¡Hasta luego!");
    };
}

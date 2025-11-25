package ejercicios.MPO.Tema1.Modulares.Ejercicio10;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 10: Sistema de Procesamiento de Pedidos

        **Objetivo:** Crear un sistema modular de procesamiento de pedidos que use
        `return`, `break` y `continue`.

        **Requisitos:**

        1. Crea un method `boolean verificarStock(int cantidad, int stock)` que devuelva inmediatamente `false` si no hay suficiente stock.
        2. Crea un method `double calcularDescuento(double precio, int cantidad)` que aplique descuentos por cantidad.
        3. Crea un method `void procesarPedidos(String[] productos, int[] cantidades, double[] precios)`.
        4. En el procesamiento, usa `continue` para saltar productos con cantidad 0.
        5. Usa `break` si el total del pedido supera los 1000 euros (límite de procesamiento automático).
        6. En el `main`, simula el procesamiento de varios pedidos.
         */

        String[] prodlista = {"manzanas", "peras", "melocotones", "fresas"};
        int[] qtyLista = {10, 5, 20, 3};
        double[] priceLista = {1.4, 2.6, 3.6, 1.5};
        procesarPedidos(prodlista, qtyLista, priceLista);
    }

    static public boolean verificarStock(int cantidad, int stock){
        if (cantidad>stock){
            System.out.println("No hay suficiente cantidad en el stock");
            return false;
        }else{
            System.out.println("Hay cantidad suficiente.");
        }
        return true;
    }

    static public double calcularDescuento(double precio, int cantidad){
        if (cantidad > 100){
            return 30.0;
        } else if (cantidad > 50) {
            return 20.0;
        } else if (cantidad > 20){
            return 10.0;
        } else {
            return 0.0;
        }
    }

    static public void procesarPedidos(String[] productos, int[] cantidades, double[] precios){


    }
}

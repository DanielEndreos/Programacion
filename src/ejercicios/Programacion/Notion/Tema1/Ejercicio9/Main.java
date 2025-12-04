package ejercicios.Programacion.Notion.Tema1.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 9:  Información de un producto

        //    Escribe un programa que almacene la información de un producto    //
        //    (nombre, precio, código y disponibilidad) y muestre estos datos   //
        //    formateados por consola.                                          //

        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "AUR-2023";
        boolean disponibilidad = true;

        System.out.printf("""
                \n
                INFORMACIÓN DEL PRODUCTO
                --------------------------
                Nombre: %s
                Precio: %.2f€
                Código: %s
                Disponible: %s
                
                """, nombre, precio, codigo, disponibilidad);

    }
}

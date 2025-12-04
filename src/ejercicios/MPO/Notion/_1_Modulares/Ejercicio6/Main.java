package ejercicios.MPO.Notion._1_Modulares.Ejercicio6;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 6: Procesador de Lista de Tareas

        **Objetivo:** Crear un method que procese una lista de tareas y use
        `return` anticipadamente si encuentra una tarea prioritaria.

        **Requisitos:**

        1. Crea un method `String procesarTareas(String[] tareas)`.
        2. Recorre el array de tareas.
        3. Si encuentra una tarea que contiene la palabra "URGENTE", usa `return` inmediatamente devolviendo esa tarea.
        4. Si no hay tareas urgentes, devuelve "No hay tareas urgentes".
        5. En el `main`, prueba con diferentes arrays de tareas.
         */
        String[] tareasLista = {
                "Revisar correos",
                "Enviar informe semanal",
                "Comprar material urgente",
                "Actualizar software del PLC",
                "Llamar a proveedor",
                "Backup de la base de datos (urgente)",
                "Planificar mantenimiento",
                "Reunión con el cliente",
                "Documentar cambios",
                "Comprobar sensores de seguridad"
        };
        System.out.printf(procesarTareas(tareasLista));
    }
    public static String procesarTareas(String[] tareas){
        for (String item : tareas){
            if (item.toLowerCase().contains("urgente")){
                return item;
            }
        }
    return "No hay tareas urgentes";
    }
}

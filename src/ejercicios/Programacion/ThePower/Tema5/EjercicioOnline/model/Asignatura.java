package ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Asignatura {

    private int id;
    private double calificacion;

    public Asignatura(){}
    public Asignatura(int id){
        this.id = id;
    }

    public void mostrarDatos(){
        System.out.println("Mostrando los datos de la asignatura requerida");
        System.out.println("id = " + id);
        System.out.printf("calificación = %.2f\n", calificacion);
    }

}

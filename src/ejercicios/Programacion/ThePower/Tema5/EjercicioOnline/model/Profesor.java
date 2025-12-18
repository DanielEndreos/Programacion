package ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Profesor {

    public void ponerNotas(Alumno alumnos){
        alumnos.getAsignatura1().setCalificacion((Math.random()*10)+0.1);
        alumnos.getAsignatura2().setCalificacion((Math.random()*10)+0.1);
        alumnos.getAsignatura3().setCalificacion((Math.random()*10)+0.1);
    }

    public double calcularMedia(Alumno alumno){
        double media = alumno.getAsignatura1().getCalificacion() +
                       alumno.getAsignatura1().getCalificacion() +
                       alumno.getAsignatura1().getCalificacion();
        return (media)/3;
    }
//    public double calcularMedia(Alumno nombre){
//
//    }

}

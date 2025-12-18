package ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.controller;

import ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model.Alumno;
import ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model.Profesor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Array;
import java.util.ArrayList;

@Getter
@Setter
public class Colegio {
    private ArrayList<Alumno> listaAlumnos;
    private Profesor profesor;

    public Colegio(){
        this.listaAlumnos = new ArrayList<>();
    }

    public Colegio(Profesor profesor){
        this.listaAlumnos = new ArrayList<>();
        this.profesor=profesor;
    }

    public void matricularAlumno(Alumno alumno){
        this.listaAlumnos.add(alumno);
        System.out.println("Matriculado Correctamente.");
    }

    public void calificarAlumnos(){
        System.out.println("Procedemos a calificar...");
        for (Alumno alumno : listaAlumnos) {
            profesor.ponerNotas(alumno);
        }
    }

    public void mostrarResultados(){
        System.out.println("Vamos a ver la media de los alumnos:");
        double mediaTotal = 0;
        for (Alumno alumno : listaAlumnos) {
            double mediaAlumno = profesor.calcularMedia(alumno);
            System.out.printf("La media del alumno es %.2f\n",mediaAlumno);
            mediaTotal+=mediaAlumno/listaAlumnos.size();
        }
        System.out.printf("La media total de los alumnos es: %.2f\n",mediaTotal);
    }
}

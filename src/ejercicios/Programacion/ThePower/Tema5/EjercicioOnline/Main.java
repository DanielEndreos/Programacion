package ejercicios.Programacion.ThePower.Tema5.EjercicioOnline;

/*
Enunciado: Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
- Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.
 */

import ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.controller.Colegio;
import ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model.Alumno;
import ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model.Asignatura;
import ejercicios.Programacion.ThePower.Tema5.EjercicioOnline.model.Profesor;

public class Main {
    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura entornos = new Asignatura(3);



        //Opción A
        Alumno marcos = new Alumno(programacion, sistemas, entornos);
        Alumno noelia = new Alumno(programacion, sistemas, entornos);
        Alumno susan = new Alumno(programacion, sistemas, entornos);

        //Opción B
        Alumno celia = new Alumno(1,2,3);






//
//        Profesor profesor = new Profesor();
//
//        profesor.ponerNotas(marcos);
//        marcos.mostrarDatos();
//        System.out.printf("La media de marcos es: %.2f",profesor.calcularMedia(marcos));

//        Profesor profesor = new Profesor();
//        Colegio colegio = new Colegio(profesor);


//        colegio.matricularAlumno(new Alumno(1,2,3));
//        colegio.matricularAlumno(new Alumno(1,2,3));
//        colegio.matricularAlumno(new Alumno(1,2,3));
//        colegio.matricularAlumno(new Alumno(1,2,3));
//
//        colegio.calificarAlumnos();
//        colegio.mostrarResultados();
    }
}

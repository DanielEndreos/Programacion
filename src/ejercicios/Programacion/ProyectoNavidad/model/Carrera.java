package ejercicios.Programacion.ProyectoNavidad.model;

import java.util.ArrayList;

public class Carrera {

    private int kmCarrera;
    private ArrayList<Coche> listaCoches;

    // Declaración de constructores
    public Carrera(){}

    public Carrera(int kmCarrera, ArrayList<Coche> listaCoches){
        this.listaCoches = listaCoches;
        this.kmCarrera = kmCarrera;
    }

    public int getKmCarrera() {
        return kmCarrera;
    }
    public void setKmCarrera(int kmCarrera) {
        this.kmCarrera = kmCarrera;
    }

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }
    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }
}

package ejercicios.Programacion.ProyectoNavidad.controller;

import ejercicios.Programacion.ProyectoNavidad.model.Campeonato;
import ejercicios.Programacion.ProyectoNavidad.model.Carrera;
import ejercicios.Programacion.ProyectoNavidad.model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class CampeonatoController {

    private ArrayList<Coche> listaCoches;
    private ArrayList<Carrera> listaCarreras;

    public CampeonatoController(){
        listaCoches = new ArrayList<>();
        listaCarreras = new ArrayList<>();
    }

    public void addParticipantes(Scanner scn){
        System.out.print("¿Cuantos participantes tiene el campeonato? ");
        int nParticipantes = scn.nextInt();

        for (int i = 0; i < nParticipantes; i++) {
            System.out.printf("¿Como se llama el participante con dorsal %d? ", i+1);
            String nombre = scn.next();

            listaCoches.add(new Coche(nombre, i+1));
        }
    }

    public void addCarreras(Scanner scn){
        System.out.print("¿Cuantas carreras tiene el campeonato? ");
        int nCarreras = scn.nextInt();

        for (int i = 0; i < nCarreras; i++) {
            System.out.printf("¿Cuantas kms tiene la carrera #%d? ",i+1);
            int kms = scn.nextInt();

            listaCarreras.add(new Carrera(kms, listaCoches));
        }
    }









    // Getter and Setters

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }
    public void setListaCoches(ArrayList<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public ArrayList<Carrera> getListaCarreras() {
        return listaCarreras;
    }
    public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }
}

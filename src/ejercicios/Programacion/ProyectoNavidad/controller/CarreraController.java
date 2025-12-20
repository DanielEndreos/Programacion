package ejercicios.Programacion.ProyectoNavidad.controller;

import ejercicios.Programacion.ProyectoNavidad.model.Carrera;
import ejercicios.Programacion.ProyectoNavidad.model.Coche;

import java.util.ArrayList;

public class CarreraController {

    public void vuelta(Carrera carrera){

        for (int i = 0; i < carrera.getListaCoches().size(); i++) {

            int actualKm = carrera.getListaCoches().get(i).getKm();  //Cojo los Kms actuales
            int newKm = (int)((Math.random()*21)+30);

            carrera.getListaCoches().get(i).setKm( actualKm + newKm );
        }

    }

    public boolean checkWinner(Carrera carrera){
        for (Coche coche : carrera.getListaCoches()) {
            if (coche.getKm() >= carrera.getKmCarrera()){
                return true;
            }
        }
        return false;
    }

    public void orderList(Carrera carrera){

        for (int i = 0; i < carrera.getListaCoches().size(); i++) {

            for (int j = i+1; j < carrera.getListaCoches().size(); j++) {

                if (carrera.getListaCoches().get(i).getKm() < carrera.getListaCoches().get(j).getKm()){
                    Coche temp =  carrera.getListaCoches().remove(j);
                    carrera.getListaCoches().add(i, temp);
                }

            }

        }
    }

    public void calcularPuntos(){

    }

    public void mostrarPodio(){

    }


/*
    private ArrayList<Coche> listaParticipantes;
    private int kmCarrera = 150;

    public CarreraController(ArrayList<Coche> listaParticipantes){
        this.listaParticipantes = listaParticipantes;
    }

    public void inicioCarrera(){
        System.out.println("¡Arranca la Carrera!");
        int initVueltas=1;
        do{
            vuelta(initVueltas);
        }while(!checkWinner());
        imprimirResultados();
    }

    private int vuelta(int qtyVuelta){
        System.out.printf("\nVuelta #%d: ", qtyVuelta);    // VUELTA 1!

        for (int i = 0; i < listaParticipantes.size(); i++) {

            int kmActual = listaParticipantes.get(i).getKm();   //Cogemos el valor actual de Kms
            int kmVuelta = (int)((Math.random()*31)+20);        //Valor Aleatorio entre 20 y 50
            listaParticipantes.get(i).setKm(kmActual+kmVuelta); //Sumamos el valor nuevo de Kms con el Valor Random

        }
        qtyVuelta++;
        return qtyVuelta;
    }

    private boolean checkWinner(){

        listaParticipantes.sort(Comparator.comparingInt(Coche::getKm).reversed()); //Ordenamos coches por kms

        for (int i = 0; i < listaParticipantes.size(); i++) {
            if(listaParticipantes.get(i).getKm() >= kmCarrera){
                return true;
            }
        }
        return false;
    }
/*
    private void imprimirResultados(){
        for (int i = 0; i < listaParticipantes.size(); i++) {
            System.out.printf("\nPosición: %d, coche %s con %dKms",
                                i+1,
                                listaParticipantes.get(i).getModelo(),
                                listaParticipantes.get(i).getKm());

        }
    }
*/
}

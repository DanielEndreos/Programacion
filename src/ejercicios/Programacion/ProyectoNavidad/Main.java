package ejercicios.Programacion.ProyectoNavidad;

import ejercicios.Programacion.ProyectoNavidad.controller.CampeonatoController;
import ejercicios.Programacion.ProyectoNavidad.controller.CarreraController;
import ejercicios.Programacion.ProyectoNavidad.model.Campeonato;
import ejercicios.Programacion.ProyectoNavidad.model.Carrera;
import ejercicios.Programacion.ProyectoNavidad.model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        CampeonatoController campeonato = new CampeonatoController();

        campeonato.addParticipantes(scn);   //-> Creamos una array list con coches /participantes
        campeonato.addCarreras(scn);        //-> Creamos una array list con carreras

        CarreraController carreraController = new CarreraController(); // Simulador de Carreras


        campeonato.getListaCoches().forEach(a -> System.out.printf("%d - %s - %d %n", a.getDorsal(), a.getNombre(), a.getKm()));

        System.out.println("CORRIENDOOOOOO");

        for (Carrera carrera : campeonato.getListaCarreras()) {
            carreraController.vuelta(carrera);
        }

        campeonato.getListaCoches().forEach(a -> System.out.printf("%d - %s - %d %n", a.getDorsal(), a.getNombre(), a.getKm()));

        carreraController.orderList(campeonato.getListaCarreras().get(0));

        campeonato.getListaCoches().forEach(a -> System.out.printf("%d - %s - %d %n", a.getDorsal(), a.getNombre(), a.getKm()));

    }

    /*
    public static ArrayList<Coche> introducirDatosCoches(Scanner scn){

        //Declaración variables metodo
        int coches;
        ArrayList<Coche> lista = new ArrayList<>();

        //Consultamos cuantos coches participarán
        System.out.print("¿Cuantos coches participan? ");
        coches = scn.nextInt();

        //Iteramos para introducir los valores de los coches
        for (int i = 0; i < coches; i++) {

            // Declaración variables internas del for, solo las utilizaremos
            //   pare rellenar las nuevas instancias de Coche.

            String marca, modelo;

            System.out.printf("""
            
            Introduciendo Datos Participante %d:
            ------------------------------------------------\n""", i);

            System.out.print("Introduce la marca del coche: ");
            marca = scn.next();
            System.out.print("Introduce el modelo del coche: ");
            modelo = scn.next();

            lista.add(new Coche(marca, modelo));
        }
        return lista;
    }*/
    /*
        CarreraController carrera = new CarreraController(introducirDatosCoches(scn));
        carrera.inicioCarrera();
*/

}

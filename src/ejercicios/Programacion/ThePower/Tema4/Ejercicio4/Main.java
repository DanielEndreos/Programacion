package ejercicios.Programacion.ThePower.Tema4.Ejercicio4;

import Metodos.CtrlMatriz;

public class Main {


    public static void main(String[] args) {
        /*
        Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
        sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
        Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
        que un mismo equipo no puede jugar más de un partido
         */

        // Creamos las 10 selecciones
        String[] listaSelecciones = {"España","Brasil","Argentina","Francia","Alemania","Inglaterra","Italia","Portugal","Países Bajos","Uruguay"};

        String[][] matriz = new String[2][5];
        String[][] partidos = new String[5][2];

        // Creamos los dos bombos para los 5 equipos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int temporal = 0;
                do{
                    temporal = (int)(Math.random()*10);
                }while(checkExisteString(matriz, temporal, listaSelecciones));
                matriz[i][j] = listaSelecciones[temporal];
            }
        }

        // Mostramos los dos bombos
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Bombo %d\n", i+1);
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Equipo %d: %s\n", j+1,matriz[i][j]);
            }
            System.out.println("");
        }

        // Con los dos bombos, escogemos los equipos a jugar
        for (int i = 0; i < partidos.length; i++) {
            for (int j = 0; j < partidos[0].length; j++) {

                //Equipo Bombo 1
                String tempEquipo = "";
                do{
                    tempEquipo = matriz[j][(int)(Math.random()*5)] ;
                }while(checkExisteArray(partidos, tempEquipo));
                partidos[i][j] = tempEquipo;
            }
        }

        // Mostramos los equipos a participar
        for (int i = 0; i < partidos.length; i++) {
            System.out.printf("Partido %d: \n", i+1);
            for (int j = 0; j < partidos[0].length; j++) {
                System.out.printf(" - %s\n",partidos[i][j]);
            }
            System.out.println("");
        }

    }

    public static boolean checkExisteString (String[][] matrizToLook, int position, String[] equipos){

        for (String[] linea : matrizToLook ) {
            for (String value : linea) {
                if (value != null){
                    if (value.equals(equipos[position])){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkExisteArray (String[][] matrizToLook, String equipo){

        for (String[] linea : matrizToLook ) {
            for (String value : linea) {
                if (value != null){
                    if(value.equals(equipo)){
                        return true;
                    }
                }
            }
        }
        return false;
    }


}

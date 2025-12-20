package ejercicios.Programacion.ProyectoNavidad.model;

public class Coche {

    // Declaración de atributos de la clase Coche
    private String nombre;
    private int dorsal, puntos, km;

    // Declaración de constructores
    public Coche(){}

    public Coche(String nombre, int dorsal){
      this.nombre = nombre;
      this.dorsal = dorsal;
    };

    // Declaración Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
}

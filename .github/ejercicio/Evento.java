
import java.util.Random;

public class Evento {
    private String nombre;
    private String fecha;
    private Lugar lugar;

    public Evento(String nombre, String fecha, Lugar lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public boolean esGrande() {
        return lugar.getCapacidad() > 100;
    }

    public void cambiarLugar(Lugar nuevoLugar) {
        this.lugar = nuevoLugar;
    }

    public int asistentes() {
        Random rand = new Random();
        return rand.nextInt(lugar.getCapacidad() + 1);
    }

    @Override
    public String toString() {
        return "Evento [nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + "]";
    }
}

// Clase Lugar mínima para que compile
class Lugar {
    private String nombre;
    private int capacidad;

    public Lugar(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return nombre + " (capacidad: " + capacidad + ")";
    }
}
    


public class EstacionServicio {
    private double capacidadMaxima = 10000; 
    private double cantidadActual;

    public EstacionServicio(double capacidadMaxima , double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public double getCantidadActual() {
        return cantidadActual;
    }
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public boolean cargarCombustible(double cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            return true; 
        } else {
            return false; 
        }
    }
    public boolean reponerCombustible(double cantidad) {
        if (cantidadActual - cantidad >= 0) {
            cantidadActual -= cantidad;
            return true; 
        } else {
            return false; 
        }
    }
    public String toString() {
        return "CapacidadMaxima:" + capacidadMaxima + ", CantidadActual: " + cantidadActual;
    }
}

    


   
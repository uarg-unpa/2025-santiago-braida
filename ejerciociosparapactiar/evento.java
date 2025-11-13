public class evento {
    private String nombre;
    private String fecha;
    private lugar lugar;

    public evento(String nombre, String fecha, lugar lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    
}
    public String getNombre(){
        return nombre;
    }
    public String getFecha(){
        return fecha;
    }
    public lugar getLugar(){
        return lugar;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setLugar(lugar lugar){
        this.lugar = lugar;
    }
    public String toString(){
        return "Nombre: " + nombre + ", Fecha: " + fecha + ", Lugar: " + lugar;
    }
        
    }


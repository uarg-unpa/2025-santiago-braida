public class teatro {
    private String direccion;
    private String nombre;

    public teatro(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void CambiarElNombreDelTeatro(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public String toString() {
        return "Dirección: " + direccion + ", Nombre: " + nombre;
    }

    
}

public class obras {
    private String nombre;
    private int precio ;

    public obras(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void CambiarElNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public void CambiarElPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
    
        
    
}

public class Articulo {
    private double precio;
    private int codigo;
    private int stock;

    public Articulo(double precio, int codigo, int stock) {
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCodigo() {
        return codigo;
    }
    public int getStock() {
        return stock;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void descrementarStock(int cantidad) {
        if (cantidad <= stock) 
            stock -= cantidad;
        
    }
    public void incrementarStock(int cantidad) {
        stock += cantidad;
    }
    public String toString() {
        return "Código: " + codigo + ", Precio: " + precio + ", Stock: " + stock;
    }
    
}

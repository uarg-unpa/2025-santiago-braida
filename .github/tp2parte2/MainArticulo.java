
public class MainArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo(100.0, 12345, 10);
        
        System.out.println(articulo1.toString());
        
        articulo1.setPrecio(120.0);
        articulo1.setCodigo(54321);
        articulo1.setStock(15);
        
        System.out.println(articulo1.toString());
        
        articulo1.descrementarStock(5);
        System.out.println("Después de decrementar el stock en 5:");
        System.out.println(articulo1.toString());
        
        articulo1.incrementarStock(10);
        System.out.println("Después de incrementar el stock en 10:");
        System.out.println(articulo1.toString());
    }
}
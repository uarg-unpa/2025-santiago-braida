public class MainTeatro {
    public static void main(String[] args) {
        teatro teatro1 = new teatro("Calle Falsa 123", "Teatro Principal");
        obras obra1 = new obras("Moska", 50);
        
        System.out.println(teatro1.toString());
        System.out.println(obra1.toString());
        
        teatro1.CambiarElNombreDelTeatro("Gran Teatro");
        obra1.CambiarElNombre("Macbeth");
        obra1.CambiarElPrecio(60);
        
        System.out.println(teatro1.toString());
        System.out.println(obra1.toString());
    }
}

public class MainPilaInt {
    public static void main(String[] args) {
        PilaInt pila = new PilaInt();
        pila.meter(1);
        pila.meter(2);
        pila.meter(3);
        pila.meter(2);
        pila.meter(4);
        pila.meter(2);

        int accion = 2;
        System.out.println("dame el numero a buscar en la pila: " + accion);
        int cantidad = pila.contarAcciones(accion);
        System.out.println("El número de veces que aparece " + accion + " en la pila es: " + cantidad);
    }
    
}

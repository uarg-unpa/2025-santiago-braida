package tp2parte1;

public class Main {
    public static void main(String[] args) {
        // Crear hora válida
        Hora h1 = new Hora(13, 45, 30);
        System.out.println("Hora 1: " + h1.mostrarHora());
        System.out.println("En minutos: " + h1.devolverEnMinutos());

        // Crear hora inválida → se inicializa 00:00:00
        Hora h2 = new Hora(30, 70, 80);
        System.out.println("Hora 2: " + h2.mostrarHora());

        // Cambiar valores con setters
        h2.setHora(22);
        h2.setMinutos(10);
        h2.setSegundos(5);
        System.out.println("Hora 2 corregida: " + h2.mostrarHora());
    }
}



    


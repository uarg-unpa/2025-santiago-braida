public class Main {
    public static void main(String[] args) {
        EstacionServicio estacion = new EstacionServicio(5000, 0);

        System.out.println("Combustible actual: " + estacion.getCantidadActual() + " litros.");
        if (estacion.cargarCombustible(3000)) {
            System.out.println("Se cargaron 3000 litros. Combustible restante: " + estacion.getCantidadActual());
        } else {
            System.out.println("No se pudo cargar 3000 litros (cantidad insuficiente o inválida).");
        }

    
        if (estacion.reponerCombustible(6000)) {
            System.out.println("Se repusieron 6000 litros. Total actual: " + estacion.getCantidadActual());
        } else {
            System.out.println("Error al reponer combustible.");
        }

        
        if (estacion.cargarCombustible(10990)) {
            System.out.println("Se cargaron 10990 litros. Combustible restante: " + estacion.getCantidadActual());
        } else {
            System.out.println("No se pudo cargar 10990 litros (cantidad insuficiente o inválida).");
        }

    
        if (estacion.reponerCombustible(12000)) {
            System.out.println("Repuesto hasta capacidad máxima. Total actual: " + estacion.getCantidadActual());
        }

        System.out.println("Capacidad máxima: " + estacion.getCapacidadMaxima());
        System.out.println("Nivel final de combustible: " + estacion.getCantidadActual());
    }
}


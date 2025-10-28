import java.util.Scanner;

public class MainPunto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punto9 estacion = new Punto9();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ESTACIONAMIENTO ---");
            System.out.println("1. Llegada de auto");
            System.out.println("2. Salida de auto");
            System.out.println("3. Mostrar estado");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese patente del auto que llega: ");
                    String patente = sc.nextLine();
                    if (estacion.llegar(patente)) {
                        System.out.println("Auto agregado correctamente.");
                    } else {
                        System.out.println("No hay espacio, auto espera.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese patente del auto que sale: ");
                    String salirPatente = sc.nextLine();
                    int mov = estacion.salir(salirPatente);
                    if (mov == -1) {
                        System.out.println("Estacionamiento vacío.");
                    } else if (mov == -2) {
                        System.out.println("Auto no encontrado.");
                    } else {
                        System.out.println("Auto salió después de ser movido " + mov + " veces.");
                    }
                    break;

                case 3:
                    String[] estado = estacion.getEstado();
                    System.out.print("Estado estacionamiento: ");
                    for (int i = 0; i < estado.length; i++) {
                        System.out.print(estado[i] + " ");
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}


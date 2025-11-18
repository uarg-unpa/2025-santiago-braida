import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaInt pila = new PilaInt();
        int opcion;

        do {
            System.out.println("\n=== CONTROL DE NIVELES ===");
            System.out.println("1. Agregar nuevo nivel");
            System.out.println("2. Mostrar nivel en la cima");
            System.out.println("3. Contar apariciones de un valor");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nivel de energía: ");
                    int nivel = sc.nextInt();
                    pila.meter(nivel);
                    System.out.println("Nivel agregado con éxito.");
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        
                        PilaInt aux = new PilaInt();
                        int cima = pila.sacar();
                        System.out.println("Nivel en la cima: " + cima);
                        aux.meter(cima);
                        
                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 3:
                    if (!pila.estaVacia()) {
                        System.out.print("Ingrese valor a buscar: ");
                        int x = sc.nextInt();
                        int apariciones = pila.cuantasApariciones(x);
                        System.out.println("El valor " + x + " aparece " + apariciones + " veces en la pila.");
                    } else {
                        System.out.println("No hay elementos en la pila.");
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (opcion != 4);
        sc.close();
    }
}

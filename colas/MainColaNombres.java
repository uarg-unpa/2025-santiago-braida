import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
    ColaNombres cola = new ColaNombres();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú Cola de Nombres ---");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Mostrar nombre en el frente (peek)");
            System.out.println("4. Mostrar estado");
            System.out.println("5. Mostrar cola completa");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("Cola llena.");
                    } else {
                        System.out.print("Ingrese un nombre: ");
                        String nombre = sc.next();
                        cola.encolar(nombre);
                        System.out.println("Nombre '" + nombre + "' encolado.");
                    }
                    break;
                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("Cola vacía.");
                    } else {
                        String desencolado = cola.desencolar();
                        System.out.println("Nombre desencolado: " + desencolado);
                    }
                    break;
                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("Cola vacía.");
                    } else {
                        System.out.println("Nombre en el frente: " + cola.peek());
                    }
                    break;
                case 4:
                    System.out.println("¿Vacía? " + cola.estaVacia() + " | ¿Llena? " + cola.estaLlena());
                    break;
                case 5:
                    System.out.print("Cola: ");
                    cola.mostrarCola();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0) ;
        sc.close();
    }
}

                               

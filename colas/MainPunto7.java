import java.util.Scanner;

public class MainPunto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto7 pila = new punto7();
        punto77 cola = new punto77();
        punto7 aux = new punto7(); 

        int opcion;

        do {
            System.out.println("\n--- MENÚ PUNTO 7 ---");
            System.out.println("1. Insertar elemento en la pila");
            System.out.println("2. Pasar pares de la pila a la cola");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Mostrar cola");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número positivo: ");
                    int n = sc.nextInt();
                    pila.push(n);
                    break;

                case 2:
                    while (!pila.estaVacia()) {
                        int elem = pila.pop();
                        if (elem % 2 == 0) {
                            cola.insertar(elem);
                        }
                        aux.push(elem); 
                    }
                    // restaurar pila original
                    while (!aux.estaVacia()) {
                        pila.push(aux.pop());
                    }
                    System.out.println("Se pasaron los elementos pares a la cola.");
                    break;

                case 3:
                    System.out.print("Pila: ");
                    mostrarPila(pila, aux);
                    break;

                case 4:
                    System.out.print("Cola: ");
                    mostrarCola(cola, new punto77());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }

    
    public static void mostrarPila(punto7 pila, punto7 aux) {
        while (!pila.estaVacia()) {
            int elem = pila.pop();
            System.out.print(elem + " ");
            aux.push(elem);
        }
        System.out.println();
        
        while (!aux.estaVacia()) {
            pila.push(aux.pop());
        }
    }

    
    public static void mostrarCola(punto77 cola, punto77 aux) {
        while (!cola.estaVacia()) {
            int elem = cola.borrar();
            System.out.print(elem + " ");
            aux.insertar(elem);
        }
        System.out.println();
        
        while (!aux.estaVacia()) {
            cola.insertar(aux.borrar());
        }
    }
}


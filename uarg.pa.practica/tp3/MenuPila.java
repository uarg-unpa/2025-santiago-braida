import java.util.Scanner;

public class MenuPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Mostrar elemento en la cima");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: 
                    if (pila.estaLlena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: 
                    if (pila.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = pila.sacar();
                        if (elemento != -1) {
                            System.out.println("Elemento sacado: " + elemento);
                        }
                    }
                    break;

                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        // Mostrar el elemento en la cima sin sacar
                        System.out.println("Elemento en la cima: " + pila.elementos[pila.cima]);
                    }
                    break;

                case 4: 
                    System.out.println("¿Vacía? " + pila.estaVacia() + " | ¿Llena? " + pila.estaLlena());
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

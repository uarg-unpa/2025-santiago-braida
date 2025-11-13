
import java.util.Scanner;

public class MainPunto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto5 pila = new punto5();
        int opcion;
        char elemento;

        do {
            System.out.println("\n MENÚ PILA PUNTO 5");
            System.out.println("1. Meter  un elemento");
            System.out.println("2. Sacar  un elemento");
            System.out.println("3. Mostrar cantidad de elementos");
            System.out.println("4. Ver elemento en la cima");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch(opcion) {
                case 1:
                    if (!pila.estaLlena()) {
                        System.out.print("Ingrese un carácter: ");
                        elemento = sc.nextLine().charAt(0);
                        pila.meter(elemento);
                        System.out.println(" Elemento agregado.");
                    } else {
                        System.out.println(" La pila está llena.");
                    }
                    System.out.println("Hay " + pila.cantidadElementos() + " elementos.");
                    System.out.println("Faltan " + (pila.maximoElementos() - pila.cantidadElementos()) + " para el máximo.");
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        char sacado = pila.sacar();
                        System.out.println(" Se sacó el elemento: " + sacado);
                    } else {
                        System.out.println(" La pila está vacía.");
                    }
                    System.out.println("Hay " + pila.cantidadElementos() + " elementos.");
                    System.out.println("Faltan " + (pila.maximoElementos() - pila.cantidadElementos()) + " para el máximo.");
                    break;

                case 3:
                    System.out.println("Elementos en la pila: " + pila.cantidadElementos());
                    System.out.println("Faltan " + (pila.maximoElementos() - pila.cantidadElementos()) + " para llegar al máximo.");
                    break;

                case 4:
                    if (!pila.estaVacia()) {
                        System.out.println(" Elemento en la cima: " + pila.elementoCima());
                    } else {
                        System.out.println(" La pila está vacía, no hay cima.");
                    }
                    break;

                case 5:
                    System.out.println(" Saliendo del programa");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while(opcion != 5);

        sc.close();
    }
}


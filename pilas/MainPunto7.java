

import java.util.Scanner;

public class MainPunto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto7 pila = new punto7();
        punto7 copia = null;
        int opcion;
        char elemento;

        do {
            System.out.println("\n MENÚ PILA PUNTO 7 ");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Mostrar cantidad de elementos");
            System.out.println("4. Copiar pila");
            System.out.println("5. Mostrar pila original");
            System.out.println("6. Mostrar copia de la pila");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!pila.estaLlena()) {
                        System.out.print("Ingrese un carácter: ");
                        elemento = sc.next().charAt(0);
                        pila.meter(elemento);
                        System.out.println("Elemento agregado.");
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        System.out.println("Elemento sacado: " + pila.sacar());
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 3:
                    System.out.println("Cantidad de elementos: " + pila.cantidadElementos());
                    break;

                case 4:
                    copia = pila.copiarPila();
                    System.out.println("Pila copiada correctamente.");
                    break;

                case 5:
                    System.out.print("Pila original: ");
                    mostrarPila(pila);
                    break;

                case 6:
                    if (copia != null) {
                        System.out.print("Copia de la pila: ");
                        mostrarPila(copia);
                    } else {
                        System.out.println("Primero copie la pila .");
                    }
                    break;

                default:
                    System.out.println("Opción inválida, intente otra vez.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }


    public static void mostrarPila(punto7 pila) {
        punto7 aux = new punto7();

        while (!pila.estaVacia()) {
            char e = pila.sacar();
            System.out.print(e + " ");
            aux.meter(e);
        }

        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
        System.out.println();
}
}


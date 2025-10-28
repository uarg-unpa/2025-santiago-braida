import java.util.Scanner;

public class MainPunto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto3 punto3 = new punto3();
        int opcion;

        do {
            System.out.println("\n MENÚ ");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un valor a meter: ");
                    char valor = sc.next().charAt(0); // lee un solo carácter
                    if (punto3.meter()) {
                        System.out.println("Elemento metido correctamente.");
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;

                case 2:
                    char sacado = punto3.sacar();
                    if (sacado != '\0') { // '\0' representa vacío
                        System.out.println("Elemento sacado: " + sacado);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 3:
                    if (punto3.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("Elementos en la pila:");
                         punto3.mostrar();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}


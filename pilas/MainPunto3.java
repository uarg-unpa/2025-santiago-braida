
import java.util.Scanner;

public class MainPunto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto3 pila = new punto3();
        int opcion;
        String palabra;

        do {
            System.out.println("========= MENÚ =========");
            System.out.println("1. Ingresar palabra y mostrar en forma inversa");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpia el buffer

            switch(opcion) {
                case 1:
                    System.out.print("Ingrese una palabra: ");
                    palabra = sc.nextLine();

                    // Meter cada letra en la pila
                    for(int i = 0; i < palabra.length(); i++) {
                        pila.meter(palabra.charAt(i));
                    }

                    System.out.print("Palabra invertida: ");
                    while(!pila.estaVacia()) {
                        System.out.print(pila.sacar());
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while(opcion != 2);

        sc.close();
    }
}


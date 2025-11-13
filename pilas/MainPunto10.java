
import java.util.Scanner;

public class MainPunto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto10 pila = new punto10();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PILA DE AUTOS ---");
            System.out.println("1. Ingresar auto");
            System.out.println("2. Mostrar autos");
            System.out.println("3. Sacar auto por patente");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (!pila.estaLlena()) {
                        System.out.print("Patente (número): ");
                        int patente = sc.nextInt();
                        System.out.print("Marca (una letra): ");
                        char marca = sc.next().charAt(0);
                        System.out.print("Modelo (una letra): ");
                        char modelo = sc.next().charAt(0);
                        Auto nuevo = new Auto(patente, marca, modelo);
                        pila.apilar(nuevo);
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        System.out.println("\nAutos en la pila:");
                        for (int i = pila.cantidadAutos() - 1; i >= 0; i--) {
                            Auto a = pila.verAuto(i);
                            a.mostrarAuto();
                        }
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 3:
                    if (!pila.estaVacia()) {
                        System.out.print("Ingrese la patente a sacar: ");
                        int pat = sc.nextInt();
                        Auto sacado = pila.sacarPorPatente(pat);
                        if (sacado != null) {
                            System.out.println("Auto encontrado y sacado:");
                             sacado.mostrarAuto();
                        } else {
                            System.out.println("No se encontró esa patente.");
                        }
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        sc.close();
}
}


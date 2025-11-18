
import java.util.Scanner;

public class MainPunto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto8 p8 = new punto8 ();  
        int opcion;

        do {
            System.out.println("\n MENÚ punto8 ");
            System.out.println("1. Ingresar cadena");
            System.out.println("2. Verificar si es palíndromo");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una cadena: ");
                    p8.setCadena(sc.nextLine()); 
                    System.out.println("Cadena cargada correctamente.");
                    break;

                case 2:
                    if (p8.getCadena() == null || p8.getCadena().isEmpty()) {
                        System.out.println("Primero debe ingresar una cadena.");
                    } else if (p8.esPalindromo()) {
                        System.out.println(" La cadena es un palíndromo.");
                    } else {
                        System.out.println(" La cadena NO es un palíndromo.");
                    }
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


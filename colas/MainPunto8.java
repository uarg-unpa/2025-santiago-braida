import java.util.Scanner;

public class MainPunto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto8 pila = new punto8();
        punto88 cola = new punto88();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PUNTO 8 ---");
            System.out.println("1. Ingresar cadena");
            System.out.println("2. Verificar si es palíndromo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cadena: ");
                    String cadena = sc.nextLine();

                    
                    while (!pila.estaVacia()) pila.pop();
                    while (!cola.estaVacia()) cola.borrar();

                    
                    for (int i = 0; i < cadena.length(); i++) {
                        char c = cadena.charAt(i);
                        pila.push(c);
                        cola.insertar(c);
                    }
                    System.out.println("Cadena ingresada correctamente.");
                    break;

                case 2:
                    boolean esPalindromo = true;
                    punto8 auxPila = new punto8();
                    punto88 auxCola = new punto88();

                    while (!pila.estaVacia() && esPalindromo) {
                        char p = (char) pila.pop();
                        char q = cola.borrar();
                        if (p != q) {
                            esPalindromo = false;
                        }
                        auxPila.push(p);
                        auxCola.insertar(q);
                    }

                    
                    while (!auxPila.estaVacia()) pila.push(auxPila.pop());
                    while (!auxCola.estaVacia()) cola.insertar(auxCola.borrar());

                    if (esPalindromo) {
                        System.out.println("La cadena es un palíndromo.");
                    } else {
                        System.out.println("La cadena NO es un palíndromo.");
                    }
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion !=2);

        sc.close();
    }
}


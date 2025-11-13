
import java.util.Scanner;

public class MainPunto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        punto6 pila = new punto6();
        int opcion, n;
        char x = 0;
        punto6 aux = new punto6();
        pila.meter('A');
        pila.meter('B');
        pila.meter('C');
        pila.meter('D');
        pila.meter('E'); 

        do {
            System.out.println("\nMENÚ PUNTO 6 ");
            System.out.println("1. a) Segundo elemento, eliminando los dos de arriba");
            System.out.println("2. b) Segundo elemento, sin modificar la pila");
            System.out.println("3. c) N-ésimo elemento, eliminando N");
            System.out.println("4. d) N-ésimo elemento, sin modificar");
            System.out.println("5. e) Fondo de la pila, dejando vacía");
            System.out.println("6. f) Fondo de la pila, sin modificar");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    if (pila.cantidadElementos() >= 2) {
                        char cima2 = pila.sacar();
                        x = cima2;
                        System.out.println(" Segundo elemento (eliminando 2): " + x);
                    } else {
                        System.out.println(" La pila tiene menos de 2 elementos.");
                    }
                    break;
                case 2:
                    if (pila.cantidadElementos() >= 2) {
                        char cima1 = pila.sacar();
                        aux.meter(cima1);
                        char cima2 = pila.sacar();
                        aux.meter(cima2);
                        x = cima2;

                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }

                        System.out.println(" Segundo elemento: " + x);
                    } else {
                        System.out.println(" La pila tiene menos de 2 elementos.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese N: ");
                    n = sc.nextInt();
                    if (n <= pila.cantidadElementos() && n > 0) {
                        for (int i = 0; i < n; i++) {
                            x = pila.sacar();
                        }
                        System.out.println(" N-ésimo elemento (eliminando N): " + x);
                    } else {
                        System.out.println(" Valor de N no válido.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese N: ");
                    n = sc.nextInt();
                    if (n <= pila.cantidadElementos() && n > 0) {
                        for (int i = 0; i < n; i++) {
                            x = pila.sacar();
                            aux.meter(x);
                        
                        System.out.println(" N-ésimo elemento : " + x);

                        
                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }
                    } 
                }

                
                     else {
                        System.out.println(" Valor de N no válido.");
                    }
                    break;
                case 5:
                    if (!pila.estaVacia()) {
                        while (!pila.estaVacia()) {
                            x = pila.sacar();
                        }
                        System.out.println(" Fondo (dejando vacía): " + x);
                    } else {
                        System.out.println(" La pila está vacía.");
                    }
                    break;
                case 6:
                    if (!pila.estaVacia()) {
                        while (!pila.estaVacia()) {
                            x = pila.sacar();
                            aux.meter(x);
                        }
                        
                        System.out.println(" Fondo  " + x);

                    
                        while (!aux.estaVacia()) {
                            pila.meter(aux.sacar());
                        }
                    } else {
                        System.out.println(" La pila está vacía.");
                    }
                    break;

                case 7:
                    System.out.println(" Saliendo del programa");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while(opcion != 7);

        sc.close();
    }
}
    



import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ punto9");
            System.out.println("1. Verificar expresión");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch {
                 case:
                    punto9 pila = new punto9();
                    System.out.print("Ingrese una expresión: ");
                    String expresion = sc.nextLine();

                    boolean correcta = true;

                    for (int i = 0; i < expresion.length(); i++) {
                        char c = expresion.charAt(i);

                        if (c == '(' || c == '[' || c == '{') {
                            pila.meter(c);
                        } else if (c == ')' || c == ']' || c == '}') {
                            if (pila.estaVacia()) {
                                correcta = false;
                                break;
                            }

                            char tope = pila.sacar();

                            if ((c == ')' && tope != '(') ||
                                (c == ']' && tope != '[') ||
                                (c == '}' && tope != '{')) {
                                correcta = false;
                                break;
                            }
                        }
                    }

                    if (!pila.estaVacia()) {
                        correcta = false;
                    }

                    if (correcta) {
                        System.out.println(" Expresión correcta");
                    } else {
                        System.out.println(" Expresión incorrecta");
                    }
                    break;

                case2:
                    system.out.println("Saliendo del programa...");
                
                    break;


                 
            }

     while (opcion != 2);
          sc.close();
        }
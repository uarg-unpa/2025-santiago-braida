import java.util.Scanner;

public class mainauto {
    public static void main(String[] args) {
    auto mycar = new auto("fiesta", "fort", 100);
     Scanner sc = new Scanner(System.in);
        int opcion;

         do {
             System.out.println("1. Mostrar datos del auto");
             System.out.println("2. Acelerar");
             System.out.println("3. Frenar");
             System.out.println("4. Salir");
             opcion = sc.nextInt();

              switch (opcion) {
                            case 1:
                                System.out.println(mycar);
                            break;
                            case 2:
                                System.out.println("¿Cuánto querés acelerar?");
                                                                                                                                                                                                                            int cantidad = sc.nextInt();
                                                                                                                                                                                                                                                mycar.acelerar(cantidad);
                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                    case 3:
                                                                                                                                                                                                                                                                                                        System.out.println("¿Cuánto querés frenar?");
                                                                                                                                                                                                                                                                                                                            int cantidad2 = sc.nextInt();
                                                                                                                                                                                                                                                                                                                                                mycar.frenar(cantidad2);
                                                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                                                                    case 4:
                                                                                                                                                                                                                                                                                                                                                                                                        System.out.println("Adiós");
                                                                                                                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                                                                                                                                            default:
                                                                                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("Opción inválida");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    } while (opcion != 4); // ✅ ← Te faltaba esto

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            sc.close(); // ✅ Cerrar el Scanner
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }

    


    
        

    


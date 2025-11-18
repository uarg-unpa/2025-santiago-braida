import java.util.Scanner;

public class MainElector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Elector[] electores = new Elector[5];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE ELECTORES =====");
            System.out.println("1. Cargar un nuevo elector");
            System.out.println("2. Mostrar electores cargados");
            System.out.println("3. Modificar datos de un elector");
            System.out.println("4. Salir");
            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    if (contador < electores.length) {
                        System.out.println("\n--- Carga del elector " + (contador + 1) + " ---");
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = sc.nextLine();
                        System.out.print("Matrícula: ");
                        int matricula = sc.nextInt();
                        System.out.print("Clase: ");
                        int clase = sc.nextInt();
                        sc.nextLine();

                        // Cargar domicilio (objeto)
                        System.out.print("Calle: ");
                        System.out.print("Número: ");
                        int numero = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ciudad: ");
                        String ciudad = sc.nextLine();

                        Domicilio domicilio = new Domicilio(ciudad, numero);

                        electores[contador] = new Elector(nombre, apellido, matricula, clase, domicilio);
                        contador++;
                    } else {
                        System.out.println("Ya cargaste los 5 electores permitidos.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Electores ---");
                    if (contador == 0) {
                        System.out.println("No hay electores cargados.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + electores[i]);
                        }
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("No hay electores para modificar.");
                        break;
                    }

                    System.out.print("Ingrese el número de elector a modificar (1-" + contador + "): ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    if (num > 0 && num <= contador) {
                        Elector e = electores[num - 1];
                        System.out.println("Elector actual: " + e);

                        System.out.println("¿Qué dato desea modificar?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Matrícula");
                        System.out.println("4. Clase");
                        System.out.println("5. Domicilio");
                        System.out.print("Opción: ");
                        int campo = sc.nextInt();
                        sc.nextLine();

                        switch (campo) {
                            case 1:
                                System.out.print("Nuevo nombre: ");
                                e.setNombre(sc.nextLine());
                                break;
                            case 2:
                                System.out.print("Nuevo apellido: ");
                                e.setApellido(sc.nextLine());
                                break;
                            case 3:
                                System.out.print("Nueva matrícula: ");
                                e.setMatricula(sc.nextInt());
                                sc.nextLine();
                                break;
                            case 4:
                                System.out.print("Nueva clase: ");
                                e.setClase(sc.nextInt());
                                sc.nextLine();
                                break;
                            case 5:
                                System.out.println("Nuevo domicilio:");
                                System.out.print("Calle: ");
                                System.out.print("Número: ");
                                int nuevoNumero = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Ciudad: ");
                                String nuevaCiudad = sc.nextLine();
                                e.setDomicilioDomicilio(new Domicilio(nuevaCiudad, nuevoNumero));
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }

                        System.out.println("Elector modificado correctamente.");
                    } else {
                        System.out.println("Número de elector inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

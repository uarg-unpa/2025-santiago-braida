import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = sc.nextInt();
        System.out.print("Ingrese el valor de C: ");
        int C = sc.nextInt();

        int aux = C;
        C = B;
        B = A;
        A = aux;

        System.out.println("Después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        sc.close();
    }
}
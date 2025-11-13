import java.util.Scanner;

public class Punto4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el primer número: ");
      int nr1 = sc.nextInt();
      System.out.print("Ingrese el segundo número: ");
      int nr2 = sc.nextInt();
      System.out.print("Ingrese el tercer número: ");
      int nr3 = sc.nextInt();

      if (nr1 > nr2 && nr1 > nr3) {
         System.out.println("El mayor es: " + nr1);
      } else if (nr2 > nr1 && nr2 > nr3) {
         System.out.println("El mayor es: " + nr2);
      } else {
         System.out.println("El mayor es: " + nr3);
      }

      sc.close();
   }
}




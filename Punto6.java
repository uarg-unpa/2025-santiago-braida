import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        int producto = 1;
        int cont = 1;
        while (cont <= 3) {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            suma = suma + num;
            producto = producto * num;
            cont = cont + 1;
        }
        System.out.println("suma de los enteros: " + suma);
        System.out.println("producto de los enteros: " + producto);
        sc.close();
    }
}
import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("Ingrese un día de la semana (l,m,i,j,v,s,d):");
        dia = sc.nextLine();

        switch (dia) {
            case "l":
            case "m":
            case "i":
            case "j":
            case "v":
            case "s":
            case "d":
                System.out.println("HOY TENGO RESOLUCIÓN");
                break;
            default:
                System.out.println("LA LETRA INGRESADA NO CORRESPONDE A UN DÍA VÁLIDO");
        }
        sc.close();
    }
}

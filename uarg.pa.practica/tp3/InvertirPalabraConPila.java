import java.util.Scanner;
import java.util.Stack;

public class InvertirPalabraConPila {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();

        
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }


        String palabraInvertida = "";

        while (!estaVacia(pila)) {
            palabraInvertida += pila.pop();
        }

        System.out.println("Palabra invertida: " + palabraInvertida);
        entrada.close();
    }

    public static boolean estaVacia(Stack<Character> pila) {
        return pila.isEmpty();
    }
}

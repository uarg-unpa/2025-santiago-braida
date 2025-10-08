public class ColaCaracteres {
    private final int MAX = 10;
    private char[] elementos;
    private int finalCola; // posición donde se inserta el próximo elemento

    public ColaCaracteres() {
        elementos = new char[MAX];
        finalCola = 0;
    }

    public boolean estaVacia() {
        return finalCola == 0;
    }

    public boolean estaLlena() {
        return finalCola == MAX;
    }

    // Encolar: agrega al final
    public boolean encolar(char c) {
        if (estaLlena()) return false;
        elementos[finalCola++] = c;
        return true;
    }

    // Desencolar: elimina el primero y desplaza
    public char desencolar() {
        if (estaVacia()) return '\0';
        char frente = elementos[0];
        for (int i = 1; i < finalCola; i++) {
            elementos[i - 1] = elementos[i];
        }
        finalCola--;
        return frente;
    }

    // Peek: retorna el frente de forma segura
    public char peek() {
        if (estaVacia()) return '\0';
        return elementos[0];
    }

    // Mostrar todos los elementos (opcional)
    public void mostrarCola() {
        for (int i = 0; i < finalCola; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

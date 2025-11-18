public class punto88 {
    private final int max = 100;
    private char[] elementos;
    private int frente, ultimo;

    public punto88() {
        elementos = new char[max];
        frente = 0;
        ultimo = 0;
    }

    public boolean estaVacia() {
        return frente == ultimo;
    }

    public boolean estaLlena() {
        return (ultimo + 1) % max == frente;
    }

    private int siguiente(int indice) {
        return (indice + 1) % max;
    }

    public void insertar(char c) {
        if (!estaLlena()) {
            ultimo = siguiente(ultimo);
            elementos[ultimo] = c;
        }
    }

    public char borrar() {
        if (!estaVacia()) {
            frente = siguiente(frente);
            return elementos[frente];
        }
        return '\0';
    }
}


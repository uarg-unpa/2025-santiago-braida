public class ColaCircul {
    private final int maxcola = 10;
    private int[] elementos;
    private int frente, ultimo;

    public ColaCircul() {
        elementos = new int[maxcola];
        frente = 0;
        ultimo = 0;
    }

    public boolean estaVacia() {
        return (ultimo == frente);
    }

    public boolean estaLlena() {
        int sigUltimo = siguiente(ultimo);
        return (sigUltimo == frente);
    }

    private int siguiente(int subind) {
        if (subind == maxcola - 1)
            return 0;
        else
            return ++subind;
    }

    public void insertar(int elem) {
        if (!estaLlena()) {
            ultimo = siguiente(ultimo);
            elementos[ultimo] = elem;
        }
    }

    public int borrar() {
        if (!estaVacia()) {
            frente = siguiente(frente);
            return elementos[frente];
        }
        return -1; // indica que la cola estaba vacía
    }

    public int contar() {
        int i = frente;
        int count = 0;
        while (i != ultimo) {
            i = siguiente(i);
            count++;
        }
        return count;
    }
}
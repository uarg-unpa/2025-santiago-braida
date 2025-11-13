public class punto77 {
    private final int maxcola = 10;
    private int[] elementos;
    private int frente, ultimo;

    public punto77() {
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
        return -1; 
    }

    public int contar() {
    if (ultimo >= frente) {
        return ultimo - frente;
    } else {
        return (maxcola - frente) + ultimo;
    }
}
}


public class punto6 {
    private final int maxPilas = 100;
    private char[] elementos;
    private int cima;

    public punto6() {
        elementos = new char[maxPilas];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == maxPilas - 1);
    }

    public void meter(char e) {
        cima++;
        elementos[cima] = e;
    }

    public char sacar() {
        char aux = elementos[cima];
        cima--;
        return aux;
    }

    public int cantidadElementos() {
        return cima + 1;
    }

    public int maximoElementos() {
        return maxPilas;
    }
}


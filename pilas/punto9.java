

public class punto9 {
    private final int maxPilas = 100;
    private char[] elementos;
    private int cima;

    
    public punto9() {
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
        cima = cima + 1;
        elementos[cima] = e;
    }

    public char sacar() {
        char aux = elementos[cima];
        cima = cima - 1;
        return aux;
    }
}

public class punto8 {
    private final int max = 100;
    private char[] elementos;
    private int cima;

    public punto8() {
        elementos = new char[max];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == max - 1;
    }

    public void push(char c) {
        if (!estaLlena()) {
            elementos[++cima] = c;
        }
    }

    public char pop() {
        if (!estaVacia()) {
            return elementos[cima--];
        }
         return '\0';
    }
}


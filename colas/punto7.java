public class punto7 {
    private final int max = 100;
    private int[] elementos;
    private int cima;

    public punto7() {
        elementos = new int[max];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == max - 1;
    }

    public void push(int elem) {
        if (!estaLlena()) {
            elementos[++cima] = elem;
        }
    }

    public int pop() {
        if (!estaVacia()) {
            return elementos[cima--];
        }
        return -1; 
    }

    public int peek() {
        if (!estaVacia()) return elementos[cima];
        return -1;
    }

    public int contar() {
        return cima + 1;
    }
}

    


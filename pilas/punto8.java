

public class punto8 {
    private final int maxPila = 100;
    private char[] elementos;
    private int cima;

    public punto8() {
        elementos = new char[maxPila];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }
    public boolean estaLlena() {
        return cima == maxPila - 1;
    }

    
    public void meter(char e) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = e;
        }
    }

    
    public char sacar() {
        if (!estaVacia()) {
            char aux = elementos[cima];
            cima--;
            return aux;
        } else {
            return 0;
        }
    }

    
    public void vaciar() {
        cima = -1;
    }

    public Object pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    public void push(Object pop) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    
}

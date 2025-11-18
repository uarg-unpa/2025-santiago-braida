

public class punto7 {
    private final int maxPilas = 100;
    private char[] elementos;
    private int cima;

    public punto7() {
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
    public punto7 copiarPila() {
        punto7 aux = new punto7();   
        punto7 copia = new punto7();  

        
        while (!this.estaVacia()) {
            aux.meter(this.sacar());
        }

        
        while (!aux.estaVacia()) {
            char e = aux.sacar();
            this.meter(e);
            copia.meter(e);
        }

        return copia;
    }

    public void push(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    public int pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }
}

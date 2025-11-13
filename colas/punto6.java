public class punto6 {
    private final int maxcola = 10;
    private int[] elementos;
    private int frente, ultimo;

    public punto6() {
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
        ultimo = siguiente(ultimo);
        elementos[ultimo] = elem;
    }

    public int borrar() {
        frente = siguiente(frente);
        return elementos[frente];
    }

    public int contar() {
    if (ultimo >= frente) {
        return ultimo - frente;
    } else {
        return (maxcola - frente) + ultimo;
    }
}
    public boolean esIdentica(punto6 otra) {
        if (this.contar() != otra.contar()) return false;

        punto6 aux1 = new punto6();
        punto6 aux2 = new punto6();
        boolean iguales = true;

        while (!this.estaVacia()) {
            int elem1 = this.borrar();
            int elem2 = otra.borrar();

            if (elem1 != elem2) {
                iguales = false;
            }

            aux1.insertar(elem1);
            aux2.insertar(elem2);
        }

        
        while (!aux1.estaVacia()) {
            this.insertar(aux1.borrar());
        }
        while (!aux2.estaVacia()) {
            otra.insertar(aux2.borrar());
        }

        return iguales;
    }
}


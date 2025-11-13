

public class punto10 {
    private Auto[] elementos;
    private int tope;

    public punto10() {
        elementos = new Auto[10];
        tope = 0;
    }

    public boolean estaVacia() {
        return tope == 0;
    }

    public boolean estaLlena() {
        return tope == elementos.length;
    }

    public void apilar(Auto a) {
        if (!estaLlena()) {
            elementos[tope] = a;
            tope++;
        }
    }

    public Auto desapilar() {
        if (!estaVacia()) {
            tope--;
            return elementos[tope];
        }
        return null;
    }

    public Auto sacarPorPatente(int patente) {
        punto10 aux = new punto10();
        Auto encontrado = null;

        while (!estaVacia()) {
            Auto actual = desapilar();
            if (actual.getPatente() == patente) {
                encontrado = actual;
            } else {
                aux.apilar(actual);
            }
        }

        
        while (!aux.estaVacia()) {
            apilar(aux.desapilar());
        }

        return encontrado;
    }

    public int cantidadAutos() {
        return tope;
    }

    public Auto verAuto(int pos) {
        return elementos[pos];


}
}


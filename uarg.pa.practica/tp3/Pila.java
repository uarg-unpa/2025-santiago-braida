public class Pila {
    private char[] elementos;
    private int tope;
    private int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        elementos = new char[capacidad];
        tope = -1; 
    }

    public boolean estaVacia() {
        return tope == -1;
    }


    public boolean estaLlena() {
        return tope == capacidad - 1;
    }

                                                                                                                   
    public void apilar(char elemento) {
        if (!estaLlena()) {
            tope++;
            elementos[tope] = elemento;
        } else {
            System.out.println("Pila llena. No se puede apilar.");
        }
    }

    
    public char desapilar() {
        if (!estaVacia()) {
            char elemento = elementos[tope];
            tope--;
            return elemento;
        } else {
            System.out.println("Pila vacía. No se puede desapilar.");
            return '\0';  
        }
    }

    
    public char elementoCima() {
        if (!estaVacia()) {
            return elementos[tope];
        } else {
            System.out.println("Pila vacía. No hay cima.");
            return '\0';
        }
    }
}


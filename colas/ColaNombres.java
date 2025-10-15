
public class ColaNombres {
    private final int MAX = 8;
    private String[] elementos;
    private int frente, finalCola, cantidad;

    public ColaNombres() {
        elementos = new String[MAX];
        frente = 0;
        finalCola = 0;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == MAX;
    }

    
    public boolean encolar(String nombre) {
        if (estaLlena()) return false;
        elementos[finalCola] = nombre;
        finalCola = (finalCola + 1) % MAX;
        cantidad++;
        return true;
    }

    
    public String desencolar() {
        if (estaVacia()) return null;
        String nombre = elementos[frente];
        frente = (frente + 1) % MAX;
        cantidad--;
        return nombre;
    }

    
    public String peek() {
        if (estaVacia()) return null;
        return elementos[frente];
    }

    
    public void mostrarCola() {
        int idx = frente;
        for (int i = 0; i < cantidad; i++) {
            System.out.print(elementos[idx] + " ");
            idx = (idx + 1) % MAX;
        }
        System.out.println();
    }
}

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1;// Crear el array
        // Completar: inicializar cima
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
    // Devolver true si cima indica que la pila está vacía
    return cima == -1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        // Completar: devolver true si cima está en el límite del array
            // Devuelve true si la cima está en el último índice del array
            return cima == MAX - 1;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
        if (estaLlena()) {
            System.out.println("Error: pila llena");
            return;
        }
        cima++;
        elementos[cima] = elem;
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        if (estaVacia()) { 
                    System.out.println("Error: pila vacía");
                    return -1; // Valor de error, puedes ajustar según tu lógica
        }

        // Guardar el elemento de la cima
        int elem = elementos[cima];
        cima--;
        return elem;
    }
}
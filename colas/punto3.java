public class punto3 {
    private int [] Elementos;
    private int Cantidad ;

    public punto3(int maximo){
        Elementos = new int [maximo];
        Cantidad = 0;
    }
    public boolean estaVacia() {
        return Cantidad == 0;
    }
    public boolean estaLlena() {
        return Cantidad == Elementos.length;
    }
    public boolean meter(int valor) {
        if (estaLlena()){
            return false;
        }else{
            Elementos[Cantidad] = valor;
            Cantidad++;
            return true;
        }
        }
        public int sacar() {
            if (!estaVacia()) {
                Cantidad--;
                return Elementos[Cantidad];
            } else {
                return -1;
            }
        }
        public int getCantidad(int i){
            return Cantidad;
        }
        public int getElementos(int i){
            return Elementos[i];
        }

        }

public class Punto9 {
    private final int capacidad = 10;
    private String[] autos;
    private int cima;

    public Punto9() {
        autos = new String[capacidad];
        cima = -1;
    }

    public boolean estaVacio() {
        return cima == -1;
    }

    public boolean estaLleno() {
        return cima == capacidad - 1;
    }

    public boolean llegar(String patente) {
        if (!estaLleno()) {
            cima++;
            autos[cima] = patente;
            return true;
        } else {
            return false;
        }
    }

    public int salir(String patente) {
        if (estaVacio()) {
            return -1; // estacionamiento vacío
        }

        Punto9 aux = new Punto9();
        int movimientos = 0;
        boolean encontrado = false;

        while (!estaVacio() && !encontrado) {
            if (autos[cima].equals(patente)) {
                cima--; // auto encontrado y retirado
                encontrado = true;
            } else {
                aux.llegar(autos[cima]);
                cima--;
                movimientos++;
            }
        }

        // regresar los autos movidos al estacionamiento original
        while (!aux.estaVacio()) {
            cima++;
            autos[cima] = aux.autos[aux.cima];
            aux.cima--;
        }

        if (encontrado) {
            return movimientos; // cantidad de veces movido
        } else {
            return -2; // auto no encontrado
        }
    }

    public int getCantidad() {
        return cima + 1;
    }

    public String[] getEstado() {
        String[] copia = new String[cima + 1];
        int i = 0;
        while (i <= cima) {
            copia[i] = autos[i];
            i++;
        }
        return copia;
    }
}


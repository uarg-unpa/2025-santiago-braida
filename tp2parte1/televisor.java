package tp2parte1;

public class televisor {
    private boolean encendido;
    private int canalActual;
    private int canalAnterior;
    private int volumen;
    private final int CANAL_MIN = 1;
    private final int CANAL_MAX = 99;
    private final int VOLUMEN_MIN = 0;
    private final int VOLUMEN_MAX = 100;

    public televisor() {
        this.encendido = false;
        this.canalActual = CANAL_MIN;
        this.canalAnterior = CANAL_MIN;
        this.volumen = 10;
    }

    
    public boolean isEncendido() {
        return encendido;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public int getCanalAnterior() {
        return canalAnterior;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setCanalActual(int canal) {
        if (canal >= CANAL_MIN && canal <= CANAL_MAX) {
            canalAnterior = canalActual;
            canalActual = canal;
        }
    }

    public void setVolumen(int volumen) {
        if (volumen >= VOLUMEN_MIN && volumen <= VOLUMEN_MAX) {
            this.volumen = volumen;
        }
    }

    
    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void subirCanal() {
        if (encendido && canalActual < CANAL_MAX) {
            canalAnterior = canalActual;
            canalActual++;
        }
    }

    public void bajarCanal() {
        if (encendido && canalActual > CANAL_MIN) {
            canalAnterior = canalActual;
            canalActual--;
        }
    }

    public void subirVolumen() {
        if (encendido && volumen < VOLUMEN_MAX) {
            volumen++;
        }
    }

    public void bajarVolumen() {
        if (encendido && volumen > VOLUMEN_MIN) {
            volumen--;
        }
    }

    public void volverCanalAnterior() {
        if (encendido) {
            int temp = canalActual;
            canalActual = canalAnterior;
            canalAnterior = temp;
        }
    }

    
}

package tp2parte1;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    
    


    public Hora(int hora, int minutos, int segundos) {
        if (validarHora(hora, minutos, segundos)) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    
    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    
    
    public int devolverEnMinutos() {
        return (this.hora * 60) + this.minutos + (this.segundos >= 30 ? 1 : 0);
    }

    
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", this.hora, this.minutos, this.segundos);
    }

    
    private boolean validarHora(int hora, int minutos, int segundos) {
        boolean horaValida = (hora >= 0 && hora < 24);
        boolean minutosValidos = (minutos >= 0 && minutos < 60);
        boolean segundosValidos = (segundos >= 0 && segundos < 60);
        return horaValida && minutosValidos && segundosValidos;
    }
}




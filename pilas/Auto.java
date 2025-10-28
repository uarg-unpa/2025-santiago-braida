

public class Auto {
    private int patente;
    private char marca;
    private char modelo;

    public Auto(int patente, char marca, char modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
}

    public int getPatente() {
        return patente;
    }

    public char getMarca() {
        return marca;
    }

    public char getModelo() {
        return modelo;
    }
    public void setMarca(char marca) {
        this.marca = marca;
    }
    public void setModelo(char modelo) {
        this.modelo = modelo;
    }
    public void setPatente(int patente) {
        this.patente = patente;
    }
    public String toString() {
        return "Patente: " + patente + " Marca: " + marca + " Modelo: " + modelo;
    }
}



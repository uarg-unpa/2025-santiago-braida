package Auto;

public class Auto {
    private String marca;
    private int modelo;
    private int anio;
    private int velocidadMax;

    public Auto(String marca, int modelo, int anio, int velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMax = velocidadMax;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public boolean esMasRapidoQue(Auto otro) {
        if (this.velocidadMax > otro.getVelocidadMax()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esAutoClasico(){
        if (this.anio < 2000){
            return true;
        } else {
            return false;
        }
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad Máxima: " + velocidadMax + " km/h");
    }
    
}

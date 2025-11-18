
public class Domicilio {
    private int numero;
    private String calle;

    public Domicilio(int numero, String calle) {
        this.numero = numero;
        this.calle = calle;
    }
    public int getNumero() {
        return numero;
    }
    public String getCalle() {
        return calle;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String toString(){
        return "calle: " + calle + ", número: " + numero;
    }


}

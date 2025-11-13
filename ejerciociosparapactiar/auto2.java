public class auto2 {
    private String marca;
    private String modelo;
    private int motor;

    public auto2(String marca, String modelo, int motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getMotor(){
        return motor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMotor(int motor){
        this.motor = motor;
    }
    

    
}

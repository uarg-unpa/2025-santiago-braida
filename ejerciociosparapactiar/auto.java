public class auto{
    private String Modelo;
    private String Marca;
    private int Velocidad;

    public auto(String Modelo,String Marca,int Velocidaad){
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Velocidad = Velocidaad;
    }
    public String getModelo(){
        return Modelo;
    }
    public String getMarca(){
        return Marca;
    }
    public int getVelocidad(){
        return Velocidad;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public void setVelocidad(int Velocidaad){
        this.Velocidad = Velocidaad;
    }
    public void acelerar(int cantidad){
        this.Velocidad += cantidad;
    }
    public void frenar(int cantidad){
        this.Velocidad -= cantidad;
    }
    public String toString(){
        return "Modelo: " + Modelo + ", Marca: " + Marca + ", Velocidad: " + Velocidad ;
    }
} 
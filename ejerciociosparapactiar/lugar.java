public class lugar {
    private String Direccion;
    private int Capacidad;

    public lugar(String Direccion, int Capacidad) {
        this.Direccion = Direccion;
        this.Capacidad = Capacidad;
    }
    public String getDireccion(){
        return Direccion;

    }
    public int getCapacidad(){
        return Capacidad;
    }
    public void setDireccion(String Direccion ){
        this.Direccion = Direccion;
    }
    public void setCapacidad(int Capacidad){
        this.Capacidad = Capacidad;
    }
    public boolean esGrande(){
            return Capacidad > 100;
        }
        public void cambiarLugar(String nuevaDireccion){
            this.Direccion = nuevaDireccion;
        }
        public int estimarAsistencia(){
            return 100;

        }
        public String toString(){
            return "Direccion: " + Direccion + ", Capacidad: " + Capacidad;
        }

       
        


    
}

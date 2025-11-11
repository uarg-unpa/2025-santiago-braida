package empresa;

public class empresa {
    private String nombre;
    private int legajo;
    private int sueldo;

    public empresa(String nombre, int legajo, int sueldo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getLegajo() {
        return legajo;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public boolean ganaMasQue(empresa e ){
        if (this.sueldo > e.getSueldo()){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Nombre: " + nombre + ", Legajo: " + legajo + ", Sueldo: " + sueldo;
    }
    
}

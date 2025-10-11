
public class Elector {
    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private Domicilio domicilio;

    public Elector(String nombre, String apellido, int matricula, int clase, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.clase = clase;
        this.domicilio = domicilio;

    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getClase() {
        return clase;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setClase(int clase) {
        this.clase = clase;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    public String toString(){
        return "Elector: " + nombre + " " + apellido + ", Matrícula: " + matricula + ", Clase: " + clase + ", Domicilio: [" + domicilio + "]";
    }
}





    


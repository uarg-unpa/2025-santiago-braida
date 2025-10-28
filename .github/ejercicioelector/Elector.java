public class Elector {
    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private Domicilio domicilioDomicilio;

    public Elector(String nombre, String apellido, int matricula, int clase, Domicilio domicilioDomicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.clase = clase;
        this.domicilioDomicilio = domicilioDomicilio;
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

    public Domicilio getDomicilioDomicilio() {
        return domicilioDomicilio;
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

    public void setDomicilioDomicilio(Domicilio domicilioDomicilio) {
        this.domicilioDomicilio = domicilioDomicilio;
    }

    public String toString() {
        return "Elector: " + nombre + " " + apellido +
               ", Matrícula: " + matricula +
               ", Clase: " + clase +
               ", Domicilio: [" + domicilioDomicilio + "]";
    }
}

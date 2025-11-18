

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }


    public Persona(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getDni() {
        return dni;
    }  
    public char getSexo() {
        return sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    
    private char comprobarSexo(char sexo){
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'H';
        }
    }
    
    public String toString() {
        return "Nombre: " + nombre + 
               ", Edad: " + edad + 
               ", DNI: " + dni + 
               ", Sexo: " + sexo + 
               ", Peso: " + peso + 
               ", Altura: " + altura;
    }
}





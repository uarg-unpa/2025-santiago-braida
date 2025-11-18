public class Domicilio {
    private String calle;
    private int numero;

    public Domicilio(String calle, int numero) {
        if (calle != null && !calle.trim().isEmpty()) {
            this.calle = calle;
        } else {
            this.calle = "";
        }

        if (numero > 0) {
            this.numero = numero;
        } else {
            this.numero = 0;
        }
    }

    public boolean esCompleto() {
        return (calle != null && !calle.isEmpty() && numero > 0);
    }

    @Override
    public String toString() {
        return calle + " " + numero;
    }
}

// Se recomienda mover la clase Persona a un archivo separado Persona.java
class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private Domicilio domicilio; // ¡Aquí el atributo complejo! Inicialícenlo en constructores

    // Constructor con nombre (solo asigna nombre, el resto por defecto de Java)
    public Persona(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
        this.domicilio = new Domicilio("", 0); // Inicializa el objeto complejo con valores por defecto
    }

    // Constructor completo
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }

        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }

        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        } else {
            this.dni = "";
        }

        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = 'H'; // Valor por defecto
        }

        if (peso >= 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
        }

        if (altura >= 0) {
            this.altura = altura;
        } else {
            this.altura = 0;
        }

        if (domicilio != null) {
            this.domicilio = domicilio; // Asigna el objeto complejo
        } else {
            this.domicilio = new Domicilio("", 0);
        }
    }

    // Método esMayorDeEdad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método privado para validar sexo
    private boolean comprobarSexo(char sexo) {
        return sexo == 'H' || sexo == 'M';
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni +
               ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", domicilio=" + domicilio + "]";
    }

    public String infoDomicilio() {
        return "Domicilio de " + nombre + ": " + domicilio + ". ¿Completo? " + domicilio.esCompleto();
    }

    public void setNombre(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }

    public void setDni(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDni'");
    }

    public void setEdad(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEdad'");
    }

    public void setSexo(char c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSexo'");
    }

    public void setPeso(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPeso'");
    }

    public void setAltura(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAltura'");
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    public String getDni() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDni'");
    }

    public String getEdad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEdad'");
    }

    public String getSexo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSexo'");
    }

    public String getPeso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPeso'");
    }

    public String getAltura() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAltura'");
    }
}
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private Domicilio domicilio; // ¡Aquí el atributo complejo! Inicialícenlo en constructores

    // Constructor con nombre (solo asigna nombre, el resto por defecto de Java)
    public Persona(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
        this.domicilio = new Domicilio("", 0); // Inicializa el objeto complejo con valores por defecto
    }

    // Constructor completo
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }

        if (edad >= 0) {
            this.edad = edad;
        }

        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        }

        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        }

        if (peso >= 0) {
            this.peso = peso;
        }

        if (altura >= 0) {
            this.altura = altura;
        }

        this.domicilio = domicilio; // Asigna el objeto complejo
    }

    // Método esMayorDeEdad
    public boolean esMayorDeEdad() {
        return edad >= 18; //avanzado pero lo dejo para que sus cerebros se activen 
    }

    // Método privado para validar sexo
    private boolean comprobarSexo(char sexo) {
        //completar
    }

    // toString
    
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni +
               ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", domicilio=" + domicilio + "]";
    }

   
    public String infoDomicilio() {
        return "Domicilio de " + nombre + ": " + domicilio + ". ¿Completo? " + domicilio.esCompleto();
    }
}

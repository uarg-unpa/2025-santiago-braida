public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona ("Ana", 25, "12345678", 'M', 65.0, 1.70, null);
        Persona p2 = new Persona ("Luis");
        Persona p3 = new Persona (null);

        
        System.out.println(p1);
        System.out.println("¿Es mayor de edad? " + (p1.esMayorDeEdad() ? "Sí" : "No"));

        System.out.println(p2);
        System.out.println("¿Es mayor de edad? " + (p2.esMayorDeEdad() ? "Sí" : "No"));

        System.out.println(p3);
        System.out.println("¿Es mayor de edad? " + (p3.esMayorDeEdad() ? "Sí" : "No"));

        // Test setters y getters
        p3.setNombre("Carlos");
        p3.setEdad(20);
        p3.setDni("87654321");
        p3.setSexo('X'); // Debe corregirse a 'H'
        p3.setPeso(70.5);
        p3.setAltura(1.80);

        System.out.println("\nDatos modificados de p3:");
        System.out.println(p3);
        System.out.println("Nombre: " + p3.getNombre());
        System.out.println("Edad: " + p3.getEdad());
        System.out.println("DNI: " + p3.getDni());
        System.out.println("Sexo: " + p3.getSexo());
        System.out.println("Peso: " + p3.getPeso());
        System.out.println("Altura: " + p3.getAltura());
    }
}


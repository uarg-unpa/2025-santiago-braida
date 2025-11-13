package empresa;

public class Main {
    public static void main(String[] args) {
        empresa emp1 = new empresa("Juan Perez", 1234, 50000);
        empresa emp2 = new empresa("Ana Gomez", 5678, 60000);
        empresa emp3 = new empresa("Carlos Perez", 1234, 40000);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        if (emp1.ganaMasQue(emp2)) {
            System.out.println(emp1.getNombre() + " gana más que " + emp2.getNombre());
        } else {
            System.out.println(emp2.getNombre() + " gana más que " + emp1.getNombre());
        }
    }
    
}

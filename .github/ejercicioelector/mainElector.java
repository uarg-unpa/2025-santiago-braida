public class mainElector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elector 1");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Matrícula: ");
        int matricula1 = sc.nextInt();
        System.out.print("Clase: ");
        int clase1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Domicilio: ");
        String domicilio1 = sc.nextLine();
        Elector ele1 = new Elector(nombre1, apellido1, matricula1, clase1, domicilio1);

        System.out.println("Elector 2");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido2 = sc.nextLine();
        System.out.print("Matrícula: ");
        int matricula2 = sc.nextInt();
        System.out.print("Clase: ");
        int clase2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Domicilio: ");
        String domicilio2 = sc.nextLine();
        Elector ele2 = new Elector (nombre2, apellido2, matricula2, clase2, domicilio2);

        System.out.println("Elector 3");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido3 = sc.nextLine();
        System.out.print("Matrícula: ");
        int matricula3 = sc.nextInt();
        System.out.print("Clase: ");
        int clase3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Domicilio: ");
        String domicilio3 = sc.nextLine();
        Elector ele3 = new Elector(nombre3, apellido3, matricula3, clase3, domicilio3);

        System.out.println("Elector 4");
        System.out.print("Nombre: ");
        String nombre4 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido4 = sc.nextLine();
        System.out.print("Matrícula: ");
        int matricula4 = sc.nextInt();
        System.out.print("Clase: ");
        int clase4 = sc.nextInt();
        sc.nextLine();
        System.out.print("Domicilio: ");
        String domicilio4 = sc.nextLine();
        Elector ele4 = new Elector(nombre4, apellido4, matricula4, clase4, domicilio4);

        System.out.println("Elector 5");
        System.out.print("Nombre: ");
        String nombre5 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido5 = sc.nextLine();
        System.out.print("Matrícula: ");
        int matricula5 = sc.nextInt();
        System.out.print("Clase: ");
        int clase5 = sc.nextInt();
        sc.nextLine();
        System.out.print("Domicilio: ");
        String domicilio5 = sc.nextLine();
        Elector ele5 = new Elector(nombre5, apellido5, matricula5, clase5, domicilio5);

        System.out.println("\nElectores ingresados:");
        System.out.println(ele1);
        System.out.println(ele2);
        System.out.println(ele3);
        System.out.println(ele4);
        System.out.println(ele5);

        ele1.setNombre("Marta");
        ele2.setMatricula(23493749);
        ele3.setDomicilio("Libertad 1099");

        System.out.println("\nElectores modificados:");
        System.out.println(ele1);
        System.out.println(ele2);
        System.out.println(ele3);
        System.out.println(ele4);
        System.out.println(ele5);

        sc.close();
    }
}





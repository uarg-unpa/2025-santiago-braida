public class MainEmpleado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado ("Juan", 30, "87654321", 'H', 80.0, 1.80, "E123", 30000.0);
        System.out.println(e1);
        e1.setCasado(true);
        e1.setNumeroHijos(2);
        System.out.println(e1);
        System.out.println("Sueldo Bruto: " + e1.CalcularSueldoBruto());
        System.out.println("Retenciones: " + e1.CalcularRetenciones());
        e1.CalcularHorasExtra(5);
        System.out.println("Horas Extra: " + e1.getHorasExtra());
        System.out.println("Retenciones después de horas extra: " + e1.CalcularRetenciones());

        

    }


    
}


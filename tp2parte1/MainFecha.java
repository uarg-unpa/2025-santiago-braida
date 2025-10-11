package tp2parte1;

public class MainFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(5, 9, 2022);
        Fecha f2 = new Fecha(12, 3, 2025);

        
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        System.out.println(f2.getDia() + "/" + f2.getMes() + "/" + f2.getAnio());

    
        Fecha mayor = (f1.getAnio() >= f2.getAnio()) ? f1 : f2;
        System.out.println("La fecha de mayor año es: " + mayor.getDia() + "/" + mayor.getMes() + "/" + mayor.getAnio());
    }
}

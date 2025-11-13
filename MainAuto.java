package Auto;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", 2020, 2019, 180);
        Auto auto2 = new Auto("Ford", 2018, 1995, 160);
        Auto auto3 = new Auto("Honda", 2021, 2020, 250);

        auto1.mostrarInfo();
        System.out.println();
        auto2.mostrarInfo();
        System.out.println();
        auto3.mostrarInfo();
        System.out.println();

        if (auto1.esMasRapidoQue(auto2)) {
            System.out.println(auto1.getMarca() + " es más rápido que " + auto2.getMarca());
        } else {
            System.out.println(auto1.getMarca() + " no es más rápido que " + auto2.getMarca());
        }
        if (auto3.esMasRapidoQue(auto1)) {
            System.out.println(auto3.getMarca() + " es más rápido que " + auto1.getMarca());
        } else {
            System.out.println(auto3.getMarca() + " no es más rápido que " + auto1.getMarca());
        }

        if (auto1.esAutoClasico()) {
            System.out.println(auto1.getMarca() + " es un auto clásico.");
        } else {
            System.out.println(auto1.getMarca() + " no es un auto clásico.");
        }

        if (auto2.esAutoClasico()) {
            System.out.println(auto2.getMarca() + " es un auto clásico.");
        } else {
            System.out.println(auto2.getMarca() + " no es un auto clásico.");
        }
        if (auto3.esAutoClasico()) {
            System.out.println(auto3.getMarca() + " es un auto clásico.");
        } else {
            System.out.println(auto3.getMarca() + " no es un auto clásico.");
        }
    }
}

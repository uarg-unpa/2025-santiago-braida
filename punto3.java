public class punto3.java {
    public static void main(string[]args) {
        Scarnner = new Scarnner(System .in);
        
        System.out.print("ingrese el valor de A: ");
                 int A = sc.nextInt();
        System.out.print("ingrese el valor de B: ");
                 int B = sc.nextInt();
        System.out.print("ingrese el valor de C: ");
                 int C = sc.nextInt();

        int aux = C;
        C = B;
        B = A;
        A = aux;
        System.out.println("Despues del intercambio: ")
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        
        sc.close();
     



    }
}
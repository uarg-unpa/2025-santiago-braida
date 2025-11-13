public class punto5{

   	
	private final int maxcola=10;
	private int[] elementos;
	private int frente, ultimo;
	
	public punto5(){
		elementos = new int[maxcola];
		frente=0;
		ultimo=0;
	}
	
	public boolean estaVacia(){
		return (ultimo == frente);
	}
   
	public boolean estaLlena(){
		int sigUltimo=siguiente(ultimo);
		return (sigUltimo == frente);
	}
	
	private int siguiente(int subind){
		if (subind == maxcola -1)
			return 0;
		else
			return ++subind;
	}
	
	public void insertar(int elem){		
		ultimo =siguiente(ultimo);
		elementos[ultimo]=elem;		
	}
	
	public int borrar(){
		frente =siguiente(frente);
		return elementos[frente];
	}
    public void eliminarRepetidos() {
    if (estaVacia()) return;

    punto5 aux = new punto5();   
    punto5 aux2 = new punto5();

    while (!estaVacia()) {
        int actual = borrar();
        boolean repetido = false;


        while (!aux.estaVacia()) {
            int valor = aux.borrar();
            if (valor == actual) {
                repetido = true; 
            }
            aux2.insertar(valor); 
        }

        
        while (!aux2.estaVacia()) {
            aux.insertar(aux2.borrar());
        }

        
        if (!repetido) {
            aux.insertar(actual);
        }
    }

    
    while (!aux.estaVacia()) {
        insertar(aux.borrar());
    }
}

}   
    
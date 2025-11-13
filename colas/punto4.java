public class punto4{
private final int maxcola=10;
	private int[] elementos;
	private int frente, ultimo;
	
	public punto4(){
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
    public int contar() {
    if (ultimo >= frente) {
        return ultimo - frente;
    } else {
        return (maxcola - frente) + ultimo;
    }
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
}   

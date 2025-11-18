public class PilaInt {
	
	final int maxpila=30;
	int [] elementos;
	int cima;
	
	public PilaInt() {
		elementos = new int[maxpila];
		cima = -1;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
	
	public void meter(int e) {     
		   cima = cima+1;	
         elementos[cima]=e;           			
	}
	
	public int sacar() {		      
		int aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}
	public int cuantasApariciones(int x ){
		int  contador = 0;
		PilaInt pilaAux = new PilaInt();
		while (!this.estaVacia()) {
			int elemento = this.sacar();
			if (elemento == x) {
				contador++;
			}
			pilaAux.meter(elemento);
		}
		while (!pilaAux.estaVacia()) {
			this.meter(pilaAux.sacar());
		}
		return contador;
	}
}

   

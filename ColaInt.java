package colanueva;
public class ColaInt {
   
   private final int maxcola=5;
   private int elementos[];
   private int ultimo;
   
   public ColaInt() {
      elementos=new int[maxcola];
      ultimo = -1;   
   }
   
   public boolean estaVacia() {
      return (ultimo==-1);
   }
   
   public boolean estaLlena() {
      return (ultimo==maxcola-1);
   }
   
   public void insertar(int elem) {      
      if (!this.estaLlena()){
         ultimo++;
         elementos[ultimo]=elem;         
      }
   }
   
   public int borrar() {
      int aux = elementos[0];
      for (int i=0; i<ultimo; i++) 
         elementos[i] = elementos[i+1];
      ultimo--;     
      return aux;
   }
   public ColaInt filtrarLlamadas(int palabraClave) {
    ColaInt resultado = new ColaInt();  
    ColaInt aux = new ColaInt();        

    while (!this.estaVacia()) {
        int valor = this.borrar();

        
        if (valor == palabraClave) {
            resultado.insertar(valor);
        }

        
        aux.insertar(valor);
    }


    while (!aux.estaVacia()) {
        this.insertar(aux.borrar());
    }

    return resultado;
}

}

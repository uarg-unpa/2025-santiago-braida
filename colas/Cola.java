public class Cola{
// Devuelve el elemento en el frente sin borrarlo
public int getFrente() {
    if (!estaVacia()) {
        return elementos[frente];
    } else {
        System.out.println("cola vacía");
        return -1;
    }
}
  private final int maxcola=5;
   private int frente, ultimo;
 private int []elementos;
public Cola()
{
 frente=0;
 ultimo=0;
elementos=new int[maxcola];
}

public boolean estaVacia()
{
    return (frente == ultimo);

}
public boolean estaLlena()
{
    return ((ultimo + 1) % maxcola == frente);
}
public void insertar(int numero)
{
    if (!estaLlena())
    {
        elementos[ultimo] = numero;
        ultimo = (ultimo + 1) % maxcola;
    }
    else
        System.out.println("cola llena");
}
public int borrar()
{
    int aux = -1;
    if (!estaVacia())
    {
        aux = elementos[frente];
        frente = (frente + 1) % maxcola;
    }
    else 
        System.out.println("cola vacia");
    return aux;
}
}

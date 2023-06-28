package grafo;
public class Nodo {
	private Object elemento;
	private Nodo siguiente;
	
	public Nodo() {
		elemento = null;
		siguiente = null;
	}
	
	public Nodo(Object pElemento){
		this.elemento = pElemento;
		siguiente = null;
	}

	
	//Métodos setters and getters
	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object pElemento) {
		this.elemento = pElemento;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}

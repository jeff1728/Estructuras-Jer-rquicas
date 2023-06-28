package busqueda_profundidad;

public class PreOrden {
	 public void preOrdenRecorrido(Nodo raiz) {
	        if (raiz == null) {
	            return;
	        }
	        
	        System.out.println(raiz.valor);
	        
	        preOrdenRecorrido(raiz.izquierda); 
	        preOrdenRecorrido(raiz.derecha); 
	   
}
	 
	 
	
	 public Nodo preOrdenBusqueda(Nodo raiz, int punto) {
	        if (raiz == null) {
	            return null;
	        }
	        
	        if (raiz.valor == punto) {
	            return raiz; // Se encontró el elemento en el nodo actual
	        }
	        
	        // Buscar en el subárbol izquierdo
	        Nodo izquierdaResultado = preOrdenBusqueda(raiz.izquierda, punto);
	        if (izquierdaResultado != null) {
	            return izquierdaResultado;
	        }
	        
	        // Buscar en el subárbol derecho
	        Nodo derechaResultado = preOrdenBusqueda(raiz.derecha, punto);
	        if (derechaResultado != null) {
	            return derechaResultado;
	        }
	        
	        return null; // No se encontró el elemento en el árbol
	    }
}

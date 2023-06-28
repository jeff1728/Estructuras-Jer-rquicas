package busqueda_profundidad;

public class PostOrden {
	 public void postOrdenRecorrido(Nodo inicio) {
	        if (inicio == null) {
	            return;
	        }
	        
	        postOrdenRecorrido(inicio.izquierda);
	        postOrdenRecorrido(inicio.derecha); 
	        System.out.println(inicio.valor); 
	    }
	 
	 
	 
	 public Nodo postOrdenBusqueda(Nodo inicio, int punto) {
	        if (inicio == null) {
	            return null;
	        }
	        
	        if (inicio.valor == punto) {
	            return inicio; // Se encontró el elemento en el nodo actual
	        }
	        
	        // Buscar en el subárbol izquierdo
	        Nodo izquierdaResultado = postOrdenBusqueda(inicio.izquierda, punto);
	        if (izquierdaResultado != null) {
	            return izquierdaResultado;
	        }
	        
	        // Buscar en el subárbol derecho
	        Nodo derechaResultado = postOrdenBusqueda(inicio.derecha, punto);
	        if (derechaResultado != null) {
	            return derechaResultado;
	        }
	        
	        return null; // No se encontró el elemento en el árbol
	    }
}

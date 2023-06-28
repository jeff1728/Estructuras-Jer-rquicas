package busqueda_amplitud;

public class BusquedaAmplitud {
	public Nodo amplitudBusqueda(Nodo raiz, int punto) {
        if (raiz == null) {
            return null;
        }

        if (raiz.valor == punto) {
            return raiz; 
        }

        Nodo izquierdaResultado = amplitudBusqueda(raiz.izquierda, punto); 
        if (izquierdaResultado != null) {
            return izquierdaResultado;
        }

        Nodo derecharesultado = amplitudBusqueda(raiz.derecha, punto); 
        if (derecharesultado != null) {
            return derecharesultado;
        }

        return null; 
    }
}

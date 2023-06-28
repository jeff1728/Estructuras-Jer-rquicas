package busqueda_amplitud;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo raiz = new Nodo(4);
        raiz.izquierda = new Nodo(2);
        raiz.derecha = new Nodo(5);
        raiz.izquierda.izquierda = new Nodo(1);
        raiz.izquierda.derecha = new Nodo(3);

         BusquedaAmplitud busqueda= new BusquedaAmplitud();
        Nodo resultado = busqueda.amplitudBusqueda(raiz, 3);

        if (resultado != null) {
            System.out.println("elemento encontrado: " + resultado.valor);
        } else {
            System.out.println("elemento no encontrado");
        }
	}

}

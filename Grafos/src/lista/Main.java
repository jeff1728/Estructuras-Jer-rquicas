package lista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grafo g = new Grafo(3);
        g.nuevoVertice();
        g.nuevoVertice();
        g.nuevoVertice();
        g.nuevoArco(0, 1);
        g.nuevoArco(1, 2);
        g.nuevoArco(2, 0);

        // Imprimir el grafo
        g.mostrar();

        // Borrar un arco y un vértice
        g.quitarArco(1, 2);
        g.quitarVertice(0);

        // Imprimir el grafo actualizado
        g.mostrar();
	}

}

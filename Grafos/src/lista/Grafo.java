package lista;

public class Grafo {//grafoadya
	    private int[][] listaAdya;
	    private int numVertices;

	    public Grafo(int tamano) {
	        this.numVertices = 0;
	        this.listaAdya = new int[tamano][tamano];
	    }

	    public void nuevoVertice() {
	        if (numVertices == listaAdya.length) {
	            // Ampliar el tamaño del arreglo si se alcanza su capacidad máxima
	            int nTamano = listaAdya.length * 2;
	            int[][] nuevoArreglo = new int[nTamano][nTamano];
	            for (int i = 0; i < listaAdya.length; i++) {
	                for (int j = 0; j < listaAdya.length; j++) {
	                    nuevoArreglo[i][j] = listaAdya[i][j];
	                }
	            }
	            listaAdya = nuevoArreglo;
	        }
	        numVertices++;
	    }

	    public void nuevoArco(int recurso, int destino) {
	        if (recurso >= 0 && recurso < numVertices && destino >= 0 && destino < numVertices) {
	            listaAdya[recurso][destino] = 1;
	        }
	    }

	    public void quitarArco(int recurso, int destino) {
	        if (recurso >= 0 && recurso < numVertices && destino >= 0 && destino < numVertices) {
	            listaAdya[recurso][destino] = 0;
	        }
	    }

	    public void quitarVertice(int vertice) {
	        if (vertice >= 0 && vertice < numVertices) {
	            for (int i = 0; i < numVertices; i++) {
	                listaAdya[vertice][i] = 0;
	                listaAdya[i][vertice] = 0;
	            }
	            numVertices--;
	        }
	    }

	    public void mostrar() {
	        System.out.println("lista adyacencia:");
	        for (int i = 0; i < numVertices; i++) {
	            System.out.print(i + ": ");
	            for (int j = 0; j < numVertices; j++) {
	                if (listaAdya[i][j] == 1) {
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.println();
	        }
	    }

	  

}

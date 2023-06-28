package grafo;
public class Vertice {
	String nombre;
	int numVertice;
	public Vertice(String x)
	{
		nombre = x;
		numVertice = -1;
	}
	public String nomVertice() // devuelve identificador del vértice
	{
		return nombre;
	}
	public boolean equals(Vertice n) // true, si dos vértices son iguales
	{
		return nombre.equals(n.nombre);
	}
	public void asigVert(int n) // establece el número de vértices
	{
		numVertice = n;
	}
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumVertice() {
		return numVertice;
	}
	public void setNumVertice(int numVertice) {
		this.numVertice = numVertice;
	}
	
	//toString
	public String toString() // características del vértice
	{
		return nombre + " (" + numVertice + ")";
	}
}

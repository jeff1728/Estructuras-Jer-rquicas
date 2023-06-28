package grafo;
public class Matriz {
	int numV;
	static int MaxVerts = 20; 
	Vertice [] verts;
	int [][] matAd;
	
	public Matriz()
	{
		this(MaxVerts);
	}
	public Matriz(int mx)
	{
		matAd = new int [mx][mx];
		verts = new Vertice[mx];
		for (int i = 0; i < mx; i++)
			for (int j = 0; i < mx; i++)
				matAd[i][j] = 0;
		numV = 0;
	}
	
	
	public void ingresarVertice (String nom){
		boolean esta = numVertice(nom) >= 0;
		if (!esta) 
		{
			Vertice v = new Vertice(nom); 
			v.asigVert(numV);
			verts[numV++] = v;
		}
	} 
	public int numVertice(String vs){
		Vertice v = new Vertice(vs);
		boolean encontrado = false;
		int i = 0;
		for (; (i < numV) && !encontrado;)
		{
			encontrado = verts[i].equals(v);
			if (!encontrado) i++ ; 
		}
		return (i < numV) ? i : -1 ;
	}
	public void nuevoArco(String a, String b)throws Exception{
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0) throw new Exception ("no se encontró el vértice");
		matAd[va][vb] = 1;
	}
	
	
	public boolean adyacente(String a, String b)throws Exception{
		int va, vb;
		va = numVertice(a);
		vb = numVertice(b);
		if (va < 0 || vb < 0) throw new Exception ("no se encontró el vértice");
		return matAd[va][vb] == 1;
	}
	
	public boolean adyacente(int va, int vb)throws Exception
	{
		if (va < 0 || vb < 0) throw new Exception ("no se encontró el vértice");
		return matAd[va][vb] == 1;
	}
}

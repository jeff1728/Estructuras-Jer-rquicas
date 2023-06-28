package busqueda_profundidad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo raiz = new Nodo(1);
        raiz.izquierda = new Nodo(2);
        raiz.derecha = new Nodo(3);
        raiz.izquierda.izquierda = new Nodo(4);
        raiz.izquierda.derecha = new Nodo(5);
        
        PreOrden p = new PreOrden();
       p.preOrdenRecorrido(raiz);
       
      
       Nodo resultado = p.preOrdenBusqueda(raiz, 5);
       if (resultado != null) {
           System.out.println("elemento encontrado: " + resultado.valor);
       } else {
           System.out.println("elemento no encontrado");
       }
       
       //--------------PostOrden-------------------------------
       Nodo root = new Nodo(1);
       root.izquierda = new Nodo(2);
       root.derecha = new Nodo(3);
       root.izquierda.izquierda = new Nodo(4);
       root.izquierda.derecha = new Nodo(5);
       
       PostOrden t = new PostOrden();
       t.postOrdenRecorrido(root);
       
       //------------Busqueda--------------------
       Nodo r = t.postOrdenBusqueda(root, 4);
       if (r != null) {
           System.out.println("elemento encontrado: " + r.valor);
       } else {
           System.out.println("elemento no encontrado");
       }
	}

}

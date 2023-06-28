package grafo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner leer=new Scanner(System.in);
		Matriz grafo=new Matriz();
		String nVertice;
		int opcion;
		do {
			System.out.println("opcion 1.- añadir vertice"
					+ "opcion 2.- añadir arcos"
					+ "opcion 3.- comprobar adyacencia"
					+ "opcion 4.- Salir"
					+ "elejir una opcion");
			opcion=leer.nextInt();
			leer.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("Añadir vértice");
		         System.out.print("Escriba el nombre del nuevo vertice: ");
		         nVertice = leer.nextLine();
		         
		         grafo.ingresarVertice(nVertice);
			
				break;
			case 2:
				String arcoA;
				String arcoB;
				 System.out.println("Ingrese los nombres de dos arcos: ");
                 
                 System.out.print("Arco número 1: ");
                 arcoA = leer.nextLine();
                 
                 System.out.print("Arco número 2: ");
                 arcoB = leer.nextLine();
                 
                 grafo.nuevoArco(arcoA, arcoB);
				break;
			case 3:
                 System.out.println("Ingrese los vértices para comprobar su adyacencia");

                 System.out.print("Arco 1: ");
                 arcoA = leer.nextLine();
                 
                 System.out.print("Arco 2: ");
                 arcoB = leer.nextLine();
                 
                 if (grafo.adyacente(arcoA, arcoB)) {
                 	System.out.println( arcoA + " y " + arcoB + " son adyacentes");
                 }else {
                 	System.out.println( arcoA +" y " + arcoB + "no son adyacentes");
                 }
				break;
			case 4:
				System.out.println("ha salido del menu");
				
				break;
				default: 
					System.out.println("opcion no disponible");
			}
			
		}while(opcion!=4);
		}

}

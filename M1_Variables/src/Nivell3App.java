
public class Nivell3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte [] array = {1,2,3,4,5,6,7,8,9,10}; //declaració de l'array
		byte aux = 0; //variable auxiliar
		
		for (int i=0;i<10;i++) { //loop per rotar l'array en direcció contra-horari
			if (i==0) {
				aux = array[i];}
				if(i<9) {
					array[i] = array[i+1];
				}
				else
				{array[i] = aux;}
				System.out.println(array[i]);} //impressió. Totes les variables de l'array han quedat desplaçades una posició en ordre descendent
	}
}

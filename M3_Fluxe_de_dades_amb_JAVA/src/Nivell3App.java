import java.util.Scanner;
public class Nivell3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //scanner per rebre les repeticions del Fibonacci de l'usuari
		int n1 = 0; //variable per l'anterior número de la cadena
		int n2 = 0; //variable per l'antepenúltim nombre de la cadena
		int resultat = 0; //resultat de la suma de les dues variables anteriors per determinar el valor actual
		
		System.out.println("Introdueixi les repeticions del Fibonacci");
		int repet = scan.nextInt(); //variable per l'input de l'usuari
		scan.close();
		
		for (int i=1;i<=repet;i++) { //bucle per mostrar la cadena el nombre de cops indicat
			if (i==2) { //en el segon nombre cal posar n2 a 1 o el resultat seria 0 infinitament
				n2 = 1;
			}
			
			resultat = n1+n2; //suma els dos nombres anteriors per saber l'actual
			n2 = n1; //mou una posició el valor d'n1 en preparació de la següent repetició
			n1 = resultat; //mou una posició el valor del resultat en preparació de la següent repetició
			System.out.println(resultat); //imprimeix el resultat actual
		}
	}

}

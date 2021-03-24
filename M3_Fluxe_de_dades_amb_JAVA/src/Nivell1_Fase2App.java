import java.util.Arrays;
import java.util.Scanner;

public class Nivell1_Fase2App {

	public static void main(String[] args) {
		
		
		//Fins a la línia 20 és igual que la fase 1
		String ciutat1,ciutat2, ciutat3, ciutat4, ciutat5, ciutat6; //inicialització dels Strings
		Scanner scan = new Scanner(System.in); //creació de l'Scanner per rebre l'input
		ciutat1 = scan.nextLine(); //introduir manualment "Berlin"
		ciutat2 = scan.nextLine(); //introduir manualment "Madrid"
		ciutat3 = scan.nextLine(); //introduir manualment "Lisboa"
		ciutat4 = scan.nextLine(); //introduir manualment "Barcelona"
		ciutat5 = scan.nextLine(); //introduir manualment "Roma"
		ciutat6 = scan.nextLine(); //introduir manualment "Napoles"
		scan.close(); //cal tancar l'Scanner

		//Fase 2 a partir d'aquí
		String [] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6}; //inicialitza l'array amb els valors de les variables de les ciutats
		Arrays.sort(arrayCiutats); //crida la funció per ordenar l'arrayCiutats
		for (String ordre:arrayCiutats) { //imprimeix l'array reordenat
		System.out.println(ordre); //impresió
		}
	}

}

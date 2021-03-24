import java.util.Arrays;
import java.util.Scanner;

public class Nivell1_Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fins a la línia 24 parteix de les fases anteriors
				String ciutat1,ciutat2, ciutat3, ciutat4, ciutat5, ciutat6; //inicialització dels Strings
				Scanner scan = new Scanner(System.in); //creació de l'Scanner per rebre l'input
				ciutat1 = scan.nextLine(); //introduir manualment "Berlin"
				ciutat2 = scan.nextLine(); //introduir manualment "Madrid"
				ciutat3 = scan.nextLine(); //introduir manualment "Lisboa"
				ciutat4 = scan.nextLine(); //introduir manualment "Barcelona"
				ciutat5 = scan.nextLine(); //introduir manualment "Roma"
				ciutat6 = scan.nextLine(); //introduir manualment "Napoles"
				scan.close(); //cal tancar l'Scanner

				//Fase 2
				String [] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6}; //inicialitza l'array amb els valors de les variables de les ciutats
				Arrays.sort(arrayCiutats); //crida la funció per ordenar l'arrayCiutats
				
				//Fase 3
				String [] arrayCiutatsModificades = new String[6]; //declaració d'un array amb 6 espais per les ciutats modificades
				int i = 0; //per iterar en el bucle forloop següent
				for (String bucle:arrayCiutats) { //forloop que inicialitza l'arrayCiutatsModificades amb les substitucions pertinents i les imprimeix
							arrayCiutatsModificades[i]=bucle.replace('a', '4');
							System.out.println(arrayCiutatsModificades[i]);
							i++;
							
					}
			
	}

}

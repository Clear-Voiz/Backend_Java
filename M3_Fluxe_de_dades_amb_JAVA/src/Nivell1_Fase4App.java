import java.util.Arrays;
import java.util.Scanner;

public class Nivell1_Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fins a la l�nia 32 el codi �s pr�cticament id�ntic al implementat anteriorment
		String ciutat1,ciutat2, ciutat3, ciutat4, ciutat5, ciutat6; //inicialitzaci� dels Strings
		Scanner scan = new Scanner(System.in); //creaci� de l'Scanner per rebre l'input
		ciutat1 = scan.nextLine(); //introduir manualment "Berlin"
		ciutat2 = scan.nextLine(); //introduir manualment "Madrid"
		ciutat3 = scan.nextLine(); //introduir manualment "Lisboa"
		ciutat4 = scan.nextLine(); //introduir manualment "Barcelona"
		ciutat5 = scan.nextLine(); //introduir manualment "Roma"
		ciutat6 = scan.nextLine(); //introduir manualment "Napoles"
		scan.close(); //cal tancar l'Scanner

		//Fase 2 a partir d'aqu�
		String [] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
	
		Arrays.sort(arrayCiutats);
		
		//Fase 3 en aquest apartat
		
		String [] arrayCiutatsModificades = new String[6]; //declaraci� d'un array amb 6 espais per les ciutats modificades
		int i = 0; //per iterar en el bucle forloop seg�ent
		for (String bucle:arrayCiutats) { //forloop que inicialitza l'arrayCiutatsModificades amb les substitucions pertinents
					arrayCiutatsModificades[i]=bucle.replace('a', '4');
					i++;
					
		}
		//Nou codi espec�fic fase 4
		char [] Aciutat1 = new char [arrayCiutatsModificades[0].length()]; //declaraci� dels arrays per allotjar els chars dels Strings de l'arrayCiutatsModificades amb un espai equivalent a la llargada de l'string en forma de chars que allotjar�
		char [] Aciutat2 = new char [arrayCiutatsModificades[1].length()];
		char [] Aciutat3 = new char [arrayCiutatsModificades[2].length()];
		char [] Aciutat4 = new char [arrayCiutatsModificades[3].length()];
		char [] Aciutat5 = new char [arrayCiutatsModificades[4].length()];
		char [] Aciutat6 = new char [arrayCiutatsModificades[5].length()];
		
		for (int j=0;j<=arrayCiutatsModificades[0].length()-1;j++) { //s'emplenen els arrays amb els chars de l'anterior array
			Aciutat1[j]=arrayCiutatsModificades[0].charAt(j);
		}
		for (int j=0;j<=arrayCiutatsModificades[1].length()-1;j++) {
			Aciutat2[j]=arrayCiutatsModificades[1].charAt(j);
		}
		for (int j=0;j<=arrayCiutatsModificades[2].length()-1;j++) {
			Aciutat3[j]=arrayCiutatsModificades[2].charAt(j);
		}
		for (int j=0;j<=arrayCiutatsModificades[3].length()-1;j++) {
			Aciutat4[j]=arrayCiutatsModificades[3].charAt(j);
		}
		
		for (int j=0;j<=arrayCiutatsModificades[4].length()-1;j++) {
			Aciutat5[j]=arrayCiutatsModificades[4].charAt(j);
		}
		
		for (int j=0;j<=arrayCiutatsModificades[5].length()-1;j++) {
			Aciutat6[j]=arrayCiutatsModificades[5].charAt(j);
		}
		
		//mostrar les ciutats al rev�s
		for (int j=Aciutat1.length-1;j>=0;j--) {
			System.out.print(Aciutat1[j]);
			if (j==0) {
				System.out.println("");
			}
		}
		for (int j=Aciutat2.length-1;j>=0;j--) {
			System.out.print(Aciutat2[j]);
			if (j==0) {
				System.out.println("");
			}
		}
		for (int j=Aciutat3.length-1;j>=0;j--) {
			System.out.print(Aciutat3[j]);
			if (j==0) {
				System.out.println("");
			}
		}
		for (int j=Aciutat4.length-1;j>=0;j--) {
			System.out.print(Aciutat4[j]);
			if (j==0) {
				System.out.println("");
			}
		}
		for (int j=Aciutat5.length-1;j>=0;j--) {
			System.out.print(Aciutat5[j]);
			if (j==0) {
				System.out.println("");
			}
		}
		
		for (int j=Aciutat6.length-1;j>=0;j--) {
			System.out.print(Aciutat6[j]);
			if (j==0) {
				System.out.println("");
			}
		}
		//recordatori de ciutats a introduir: Berlin Madrid Lisboa Barcelona Roma Napoles
	}

}

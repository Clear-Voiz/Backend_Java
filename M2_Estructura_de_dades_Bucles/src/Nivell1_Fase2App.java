import java.util.List;
import java.util.ArrayList;

public class Nivell1_Fase2App {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<Character>(); //creaci� de la llista nom
		nom.add('J');
		nom.add('o');
		nom.add('r');
		nom.add('d');
		nom.add('i');
		nom.add('3'); //afegit per comprovar qu� passa en cas d'incloure un n�mero
		
		for (char anomenat:nom) { //loop foreach que imprimeix el nom amb l'aclaraci�
			System.out.print(anomenat+" ");
		if (anomenat >= 48 && anomenat <=57) //del 48 al 57 s�n les claus num�riques que fan refer�ncia als nombres del 0 al 9 en ASCII. D'aquesta manera puc escursar el codi (he tingut una suposici� per� no sabia si funcionaria, veig que s� :p)
		{
			System.out.println("els noms de persona no contenen n�meros!");
		}
		else 
			if (Character.toLowerCase(anomenat) == 'a' || Character.toLowerCase(anomenat) == 'i' || Character.toLowerCase(anomenat) == 'u' || //si el valor �s una vocal imprimeix aix� ho declara
					Character.toLowerCase(anomenat) == 'e' || Character.toLowerCase(anomenat) == 'o') {
				System.out.println("VOCAL ");
			}
			else
			{System.out.println("CONSONANT");} //en qualsevol altre cas imprimeix CONSONANT
		}

}}

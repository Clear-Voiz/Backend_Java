import java.util.List;
import java.util.ArrayList;

public class Nivell1_Fase2App {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<Character>(); //creació de la llista nom
		nom.add('J');
		nom.add('o');
		nom.add('r');
		nom.add('d');
		nom.add('i');
		nom.add('3'); //afegit per comprovar què passa en cas d'incloure un número
		
		for (char anomenat:nom) { //loop foreach que imprimeix el nom amb l'aclaració
			System.out.print(anomenat+" ");
		if (anomenat >= 48 && anomenat <=57) //del 48 al 57 són les claus numèriques que fan referència als nombres del 0 al 9 en ASCII. D'aquesta manera puc escursar el codi (he tingut una suposició però no sabia si funcionaria, veig que sí :p)
		{
			System.out.println("els noms de persona no contenen números!");
		}
		else 
			if (Character.toLowerCase(anomenat) == 'a' || Character.toLowerCase(anomenat) == 'i' || Character.toLowerCase(anomenat) == 'u' || //si el valor és una vocal imprimeix així ho declara
					Character.toLowerCase(anomenat) == 'e' || Character.toLowerCase(anomenat) == 'o') {
				System.out.println("VOCAL ");
			}
			else
			{System.out.println("CONSONANT");} //en qualsevol altre cas imprimeix CONSONANT
		}

}}

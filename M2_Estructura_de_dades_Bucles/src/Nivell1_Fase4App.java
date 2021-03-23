import java.util.ArrayList;
import java.util.List;

public class Nivell1_Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> nom = new ArrayList<Character>(); //llista amb el meu nom que passaré a HashMap
		nom.add('J');
		nom.add('o');
		nom.add('r');
		nom.add('d');
		nom.add('i');
		
		List<Character> cognom = new ArrayList<Character>(); //llista amb el meu nom que passaré a HashMap
		cognom.add('A');
		cognom.add('r');
		cognom.add('a');
		cognom.add('g');
		cognom.add('o');
		cognom.add('n');
		
		//comença la fusió
		List<Character> FullName = new ArrayList<Character>(); //Llista per allotjat el resultat. Es podria fer directament utilitzant la llista nom, però he optat per fer-ho com en l'anunciat
		FullName.addAll(nom); //importa la llista nom
		FullName.add(' '); //afegeix l'espai buit al final del nom
		FullName.addAll(cognom); //importa la llista cognom al final de la llista FullName
		System.out.print(FullName); //imprimeix el resultat
		


	}

}

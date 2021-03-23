import java.util.ArrayList;
import java.util.*;

public class Nivell1_Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> nom = new ArrayList<Character>(); //llista amb el meu nom que passaré a HashMap
		nom.add('J');
		nom.add('o');
		nom.add('r');
		nom.add('d');
		nom.add('i');
		nom.add('J'); //He afegit dues 'J' més per demostrar que el valor d'aquesta clau augmenta a més repeticions d'una lletra
		nom.add('J');
		
		HashMap<Character, Integer> name = new HashMap<Character, Integer>(); //Creació del HashMap
		
		for (char anomenat:nom) { //forloop per implementar el HashMap
			int i = 1;
			if (name.containsKey(anomenat)) //si la clau actual ja existeix la incrementa en 1
			{
				i = name.get(anomenat)+1;
				name.put(anomenat, i);
			}
			else
			{name.put(anomenat,1);}
			
		}
		System.out.println(name); //impressió dels resultats
	}

}

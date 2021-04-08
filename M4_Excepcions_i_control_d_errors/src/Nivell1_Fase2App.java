import java.util.*;
public class Nivell1_Fase2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //variables pels bitllets
		int b5 = 5;
		int b10 = 10;
		int b20 = 20;
		int b50 = 50;
		int b100 = 100;
		int b200 = 200; //creia que tant aquest bitllet com el de 500 estaven obsolets, per� els he incl�s tal i com especifica l'anunciat
		int b500 = 500;
		
		//creaci� dels arrays pels plats i els preus
		String [] plats = new String[10];
		int [] preus = new int [10];
		HashMap<String,Integer> menu = new HashMap<String,Integer>(); //HashMap pel men�
		menu.put("Sopa de miso", 3);
		menu.put("Kappa sushi x4 peces", 5);
		menu.put("Karage", 6);
		menu.put("Takoyaki x8 peces", 7);
		menu.put("Ramen de soja", 10);
		menu.put("Sashimi de salm�", 4);
		menu.put("Tenpura de verdures", 2);
		menu.put("Arr�s amb curry", 9);
		menu.put("Gelat de t� Matcha", 3);
		menu.put("Mochi de sakura x2", 4);
		int contador = 0;
		
		List<String> ordre = new ArrayList<String>(); //array pels plats que es demanin
		
		System.out.println("Carta de la casa");
		
		for (Map.Entry<String, Integer> entry:menu.entrySet()) { //loop per passar els valors del Hashmap als arrays espec�fics
			
			plats[contador] = entry.getKey();
			preus[contador] = entry.getValue();
			
			System.out.println(plats[contador] + " " + preus[contador] + "�"); //mostra el men� complet
			contador++;
			
		}
		
		Scanner scan = new Scanner(System.in);
		byte seguir = 1; //variable que actua com a boolean per saber si continuar demanant
		
		while(seguir == 1) { //loop per prendre nota al client

			System.out.println("Qu� voldr� prendre? (introdueixi el nom del plat)");
			ordre.add(scan.nextLine());

			System.out.println("Alguna cosa m�s?(1:S� / 0:No");
			seguir = scan.nextByte();
			scan.nextLine();
			
		}
		scan.close();
	}

}

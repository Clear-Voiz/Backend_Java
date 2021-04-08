import java.util.*;

public class Nivell1_Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //variables pels bitllets
		int b5 = 0;
		int b10 = 0;
		int b20 = 0;
		int b50 = 0;
		int b100 = 0;
		int b200 = 0; //creia que tant aquest bitllet com el de 500 estaven obsolets, però els he inclòs tal i com especifica l'anunciat
		int b500 = 0;
		int total = 0;
		
		//creació dels arrays pels plats i els preus
		String [] plats = new String[10];
		int [] preus = new int [10];
		
		//HashMap pel menú
		HashMap<String,Integer> menu = new HashMap<String,Integer>(); 
		menu.put("Sopa de miso", 3);
		menu.put("Kappa sushi x4 peces", 5);
		menu.put("Karage", 6);
		menu.put("Takoyaki x8 peces", 7);
		menu.put("Ramen de soja", 10);
		menu.put("Sashimi de salmó", 4);
		menu.put("Tenpura de verdures", 2);
		menu.put("Arròs amb curry", 9);
		menu.put("Gelat de tè Matcha", 3);
		menu.put("Mochi de sakura x2", 4);
		int contador = 0;
		
		List<String> ordre = new ArrayList<String>(); //array pels plats que es demanin
		
		System.out.println("Carta de la casa");
		
		for (Map.Entry<String, Integer> entry:menu.entrySet()) { //loop per passar els valors del Hashmap als arrays específics
			
			plats[contador] = entry.getKey();
			preus[contador] = entry.getValue();
			
			System.out.println(plats[contador] + " " + preus[contador] + "€");//mostra el menú complet
			contador++;
			
		}
		
		Scanner scan = new Scanner(System.in);
		byte seguir = 1; //variable que actua com a boolean en el loop while
		
		
		while(seguir == 1) {//loop per prendre nota al client

			System.out.println("Què voldrà prendre? (introdueixi el nom del plat)"); 
			ordre.add(scan.nextLine());
			System.out.println("Alguna cosa més?(1:Sí / 0:No");
			byte intro = scan.nextByte(); //
			if ((intro >1) || (intro <0)) {
				while (intro >1) { //mentre l'input no sigui ni 1 ni 0 seguirà insistint 
					System.out.println("Error. El número indicat no correspón.");
					System.out.println("Alguna cosa més?(1:Sí / 0:No)");
					intro = scan.nextByte();
				}
			}
			if (intro == 0) { //si no vol res més atura el bucle
				seguir = 0;
			}
			else
				if (intro == 1) { //en cas contrari continua
			seguir = 1;
		}
			scan.nextLine(); //neteja l'scan per evitar errors
					
				}
		scan.close();
		
		for (String comanda:ordre) { //comprova si les comandes existeixen i suma els seus valors 
			boolean existeix = false; //variable per comprovar si cada item de la llista existeix
			for (int i=0;i<plats.length;i++) {

				if (plats[i].equalsIgnoreCase(comanda)) {
					total += preus[i];	
					existeix = true;
				}
				
			}
			if (existeix == false) {//en cas que no existeixi
				System.out.println("El producte " + comanda + " no es troba a la nostra carta");
			}
		}
		System.out.println("Total a pagar: " + total + "€"); //mostra el compte
		
		//el següent codi dictamina quina quantitat de bitllets de cada tipus calen per pagar
		if(total>=500) {
			b500 = total/500;
			total = total%500;
		}
		if(total>=200) {
			b200 = total/200;
			total = total%200;
		}
		if(total>=100) {
			b100 = total/100;
			total = total%100;
		}
		if(total>=50) {
			b50 = total/50;
			total = total%50;
		}
		if(total>=20) {
			b20 = total/20;
			total = total%20;
		}
		if(total>=10) {
			b10 = total/10;
			total = total%10;
		}
		if(total>=5) {
			b5 = total/5;
			total = total%5;
		}
		if(total>0) { //en cas que encara sobrés total per pagar i fos més petit que 5 (el bitlle més petit), s'afegiria un bitllet més de 5 al ser el més petit possible i se'ns hauria de tornar canvi
			b5 += 1;
			total = 0;
		}
		//per últim imprimeix el nombre de bitllets de cada que calen per pagar l'import total
		System.out.print("Caldran: " + b500 + " bitllets de 500, " + b200 + " bitllets de 200, " + + b100 + " bitllets de 100, " + b50 + " bitllets de 50, " + b20 + " bitllets de 20, " + b10 + " bitllets de 10, " + b5 + " bitllets de 5.");
	}

}

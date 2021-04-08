import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Nivell3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		menu.put("Sushi", 5);
		menu.put("Karage", 6);
		menu.put("Takoyaki", 7);
		menu.put("Ramen", 10);
		menu.put("Sashimi de salmó", 4);
		menu.put("Tenpura", 2);
		menu.put("Arròs amb curry", 9);
		menu.put("Gelat de tè Matcha", 3);
		menu.put("Mochi", 4);
		int contador = 0;
		
		//array pels plats que es demanin
		List<String> ordre = new ArrayList<String>();
		
		System.out.println("Carta de la casa");
		
		for (Map.Entry<String, Integer> entry:menu.entrySet()) { //loop per passar els valors del Hashmap als arrays específics
			
			plats[contador] = entry.getKey();
			preus[contador] = entry.getValue();
			
			System.out.println(plats[contador] + " " + preus[contador] + "€"); //mostra el menú complet
			contador++;
			
		}
		
		Scanner scan = new Scanner(System.in);
		byte seguir = 1; //variable que actua com a boolean en el loop while
	
		
		while(seguir == 1) { //inici búcle de la comanda
			
			String temporal; //variable per guardar el plat introduït temporalment
			boolean existeix = false; //es verifica si existeix cada vegada
			System.out.println("Què voldrà prendre? (introdueixi el nom del plat)");
		
				temporal = scan.nextLine();

				for (int i=0;i<plats.length;i++) { //si l'string intrduït coincideix amb un valor de l'array plats informa que existeix i el suma a la List i el seu preu a la variable "total"

					if (plats[i].equalsIgnoreCase(temporal)) {
						total += preus[i];	
						existeix = true;
						ordre.add(temporal);
					}
					
				}
				try {
				if (existeix == false) { //si el plat no existeix llança una excepció
					throw new PlatForaDeLimitsNivell3("El plat indicat no es troba en el nostre menú");
				}
				} catch(PlatForaDeLimitsNivell3 e) {
					System.err.println(e.getMessage());
				}
			System.out.println("Alguna cosa més?(1:Sí / 0:No");
			byte intro = 7; //si aquesta variable és igual a 1 la variable "seguir" s'igualarà també a 1 i continuarà demanant més plats. Si és igual a 0 s'aturarà
			try{
				if (scan.hasNextByte()) {
					intro = scan.nextByte(); //emmagatzema la decisió
				}
				else
				{
					throw new InputErroniNivell3("Tipus d'input erroni. Torni a intentar-ho");
					
				}
				
			} catch (InputErroniNivell3 e) { //en cas que s'introdueixi un valor que no sigui byte s'encetarà un bucle while que seguirà demanant que es corregeixi amb un valor vàlid
				intro = 7;
				System.err.println(e.getMessage());
				while(intro == 7) {
					System.out.println("Alguna cosa més?(1:Sí / 0:No)");
					scan.nextLine();
					try {
						if (scan.hasNextByte()) {//comprova si l'input actual és un byte. En cas afirmatiu l'iguala a la variable
							intro = scan.nextByte();
						}
						else
						{
							//en cas contrari llança un error personalitzat
							throw new InputErroniNivell3("Tipus d'input erroni. Torni a intentar-ho"); 
							}
					
					} catch (InputErroniNivell3 ex) {
						System.err.println(ex.getMessage());
					}
				}
				
			}
			
			try {
				if ((intro >1) || (intro <0)) { //comrpova si s'ha introduït un byte diferent d'1 o 0
					throw new DecisioInadmissibleNivell3("Opció invàlida.");
					
				}
			} catch (DecisioInadmissibleNivell3 e) {
				boolean show = true; //per indicar si venim d'un posterior error d'invàlid input. Amaga el primer missatge d'error del bucle per no mostrar-ne dos de diferents
				while ((intro >1)|| (intro <0)) { //mentre l'input no sigui ni 1 ni 0 seguirà insistint
					if ((intro >1)|| (intro <0)) {
						if (show == true) {
							System.err.println(e.getMessage()); //opció invàlida
						}
						System.out.println("Alguna cosa més?(1:Sí / 0:No)");
						scan.nextLine();

					}
					try {
					if (scan.hasNextByte()) { //si s'introdueix un byte l'accepta i torna a comprovar la condició del bucle
						intro = scan.nextByte();
						show = true; //si és més gran que 1 o més petit que 0 tornarà a mostrar "opció invàlida"
					}
					else
					{
						throw new InputErroniNivell3("Tipus d'input erroni. Torni a intentar-ho"); //si s'introdueix quelcom que no sigui un byte mostra aquest error
					}
					} catch(InputErroniNivell3 ex) {
						System.err.println(ex.getMessage()); //Tipus d'input erroni. Torni a intentar-ho
						show = false;
					} 
				}
			}
				
			if (intro == 0) { //si l'input és 0 surt del bucle
				seguir = 0;
			}
			else
				if (intro == 1) { //si l'input és 1 ontinua demanant
			seguir = 1;
		}
			scan.nextLine();//neteja l'scan per evitar que s'avanci o es barregin les línies d'introducció d'input
			
		}
		scan.close();
		
		
		System.out.println("Total a pagar: " + total + "€");
		
		//codi per mostrar els bitllets necessaris per pagar
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
		
		System.out.print("Caldran: " + b500 + " bitllets de 500, " + b200 + " bitllets de 200, " + + b100 + " bitllets de 100, " + b50 + " bitllets de 50, " + b20 + " bitllets de 20, " + b10 + " bitllets de 10, " + b5 + " bitllets de 5.");
	}

}

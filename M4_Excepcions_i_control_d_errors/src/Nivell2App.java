import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Nivell2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables pels bitllets
				int b5 = 0;
				int b10 = 0;
				int b20 = 0;
				int b50 = 0;
				int b100 = 0;
				int b200 = 0; //creia que tant aquest bitllet com el de 500 estaven obsolets, per� els he incl�s tal i com especifica l'anunciat
				int b500 = 0;
				int total = 0;
				
				//creaci� dels arrays pels plats i els preus
				String [] plats = new String[10];
				int [] preus = new int [10];
				
				//HashMap pel men�
				HashMap<String,Integer> menu = new HashMap<String,Integer>(); 
				menu.put("Sopa de miso", 3);
				menu.put("Sushi", 5);
				menu.put("Karage", 6);
				menu.put("Takoyaki", 7);
				menu.put("Ramen", 10);
				menu.put("Sashimi de salm�", 4);
				menu.put("Tenpura", 2);
				menu.put("Arr�s amb curry", 9);
				menu.put("Gelat de t� Matcha", 3);
				menu.put("Mochi", 4);
				int contador = 0;
				
				//array pels plats que es demanin
				List<String> ordre = new ArrayList<String>();
				
				System.out.println("Carta de la casa");
				
				for (Map.Entry<String, Integer> entry:menu.entrySet()) { //loop per passar els valors del Hashmap als arrays espec�fics
					
					plats[contador] = entry.getKey();
					preus[contador] = entry.getValue();
					
					System.out.println(plats[contador] + " " + preus[contador] + "�"); //mostra el men� complet
					contador++;
					
				}
				
				Scanner scan = new Scanner(System.in);
				byte seguir = 1; //variable que actua com a boolean en el loop while
			
				
				while(seguir == 1) { //inici b�cle de la comanda
					
					String temporal; //variable per guardar el plat introdu�t temporalment
					boolean existeix = false; //es verifica si existeix cada vegada
					System.out.println("Qu� voldr� prendre? (introdueixi el nom del plat)");
				
						temporal = scan.nextLine();
	
						for (int i=0;i<plats.length;i++) { //si l'string intrdu�t coincideix amb un valor de l'array plats informa que existeix i el suma a la List i el seu preu a la variable "total"

							if (plats[i].equalsIgnoreCase(temporal)) {
								total += preus[i];	
								existeix = true;
								ordre.add(temporal);
							}
							
						}
						try {
						if (existeix == false) { //si el plat no existeix llan�a una excepci�
							throw new ArrayIndexOutOfBoundsException("El plat indicat no es troba en el nostre men�");
						}
						} catch(Exception e) {
							System.out.println("El plat indicat no es troba en el nostre men�");
						}
					System.out.println("Alguna cosa m�s?(1:S� / 0:No");
					byte intro = 7; //si aquesta variable �s igual a 1 la variable "seguir" s'igualar� tamb� a 1 i continuar� demanant m�s plats. Si �s igual a 0 s'aturar�
					try{
						intro = scan.nextByte(); //emmagatzema la decisi�
					} catch (InputMismatchException e) { //en cas que s'introdueixi un valor que no sigui byte s'encetar� un bucle while que seguir� demanant que es corregeixi amb un valor v�lid
						intro = 7;
						while(intro == 7) {
							System.out.println("Tipus d'input erroni. Torni a intentar-ho");
							System.out.println("Alguna cosa m�s?(1:S� / 0:No)");
							scan.nextLine();
							try {
							intro = scan.nextByte();
							} catch (InputMismatchException ex) {
								
							}
						}
						
					}
					
					if ((intro >1) || (intro <0)) {
						while ((intro >1)|| (intro <0)) { //mentre l'input no sigui ni 1 ni 0 seguir� insistint 
							System.out.println("Error. El n�mero indicat no corresp�n.");
							System.out.println("Alguna cosa m�s?(1:S� / 0:No)");
							intro = scan.nextByte();
						}
					}
					if (intro == 0) { //si l'input �s 0 surt del bucle
						seguir = 0;
					}
					else
						if (intro == 1) { //si l'input �s 1 ontinua demanant
					seguir = 1;
				}
					scan.nextLine();//neteja l'scan per evitar que s'avanci o es barregin les l�nies d'introducci� d'input
					
				}
				scan.close();
				
				
				System.out.println("Total a pagar: " + total + "�");
				
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
				if(total>0) { //en cas que encar� sobr�s total per pagar i fos m�s petit que 5 (el bitlle m�s petit), s'afegiria un bitllet m�s de 5 al ser el m�s petit possible i se'ns hauria de tornar canvi
					b5 += 1;
					total = 0;
				}
				
				System.out.print("Caldran: " + b500 + " bitllets de 500, " + b200 + " bitllets de 200, " + + b100 + " bitllets de 100, " + b50 + " bitllets de 50, " + b20 + " bitllets de 20, " + b10 + " bitllets de 10, " + b5 + " bitllets de 5.");
	}

}

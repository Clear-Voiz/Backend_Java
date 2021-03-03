
public class Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short Any = 1948;
		boolean traspas = false;
		short aniv = 1996;
		String veritat = "L'any de naixement és de traspàs.";
		String fals = "L'any de naixement no és de traspàs.";
		
		for(int i=Any;i<=aniv;i+=4) { //bucle que mostra els anys fins arribar al meu naixement
			System.out.println(i);
			if (i == aniv) {
				traspas = true;
			}
			
		}
		if(traspas == true) {
			System.out.println(veritat);} //confirma que l'any de naixement és de traspàs
			else
			{System.out.println(aniv); //imprimeix l'aniversari ja que en cas de no ser de traspàs quedaria exclòs del bucle
				System.out.println(fals);} //confirma que l'any de naixement NO és de traspàs
	}
}

public class Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short Any = 1948;
		boolean traspas = false;
		short aniv = 1996;
		String veritat = "L'any de naixement �s de trasp�s.";
		String fals = "L'any de naixement no �s de trasp�s.";
		
		for(int i=Any;i<=aniv;i+=4) { //bucle que mostra els anys fins arribar al meu naixement
			System.out.println(i);
			if (i == aniv) {
				traspas = true;
			}
			
		}
		if(traspas == true) {
			System.out.println(veritat);} //confirma que l'any de naixement �s de trasp�s
			else
			{System.out.println(aniv); //imprimeix l'aniversari ja que en cas de no ser de trasp�s quedaria excl�s del bucle
				System.out.println(fals);} //confirma que l'any de naixement NO �s de trasp�s
	}
}
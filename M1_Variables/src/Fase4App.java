
public class Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables pel nom complet
		String nom, cognom1, cognom2; 
		nom = "Jordi";
		cognom1 = "Aragon";
		cognom2 = "Capellera";
		
		//variables per la data de naixement
		int dia, mes, any;
		dia = 9;
		mes = 3;
		any = 1996;
		
		//variables per determinar els anys de trasp�s
		short Any = 1948;
		boolean traspas = false;
		short aniv = 1996;
		
		String anomenat="El meu nom �s " + nom + " " + cognom1 + " " + cognom2;
		String nascut="Vaig n�ixer el " + dia + "/" + mes + "/" + any;
		
		String veritat = "El meu any de naixement �s de trasp�s.";
		String fals = "El meu any de naixement no �s de trasp�s.";
		
		System.out.println(anomenat);
		System.out.println(nascut);
		
		
		
		for(int i=Any;i<=aniv;i+=4) { //bucle que mostra els anys fins arribar al meu naixement
			if (i == aniv) {
				traspas = true;
			}
			
		}
		if(traspas == true) {
			System.out.println(veritat);} //confirma que l'any de naixement �s de trasp�s
			else
			{System.out.println(fals);} //confirma que l'any de naixement NO �s de trasp�s
	}
		

}

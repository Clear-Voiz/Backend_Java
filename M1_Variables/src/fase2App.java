
public class fase2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final short ANY = 1948; // Any de traspàs
		byte traspas = 4; //freqüència any de traspàs
		final short ANI = 1996; // Any de naixament 1996
		int resultat = (ANI-ANY)/traspas; //nombre d'anys de traspàs entre 1948 i 1996
				System.out.println("Des de 1948 fins 1996 han tingut lloc " + resultat + " anys de traspàs");
				
	}

}

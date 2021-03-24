import java.util.Scanner;
public class Nivell1_Fase1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ciutat1,ciutat2, ciutat3, ciutat4, ciutat5, ciutat6; //inicialització dels Strings
		Scanner scan = new Scanner(System.in); //creació de l'Scanner per rebre l'input
		ciutat1 = scan.nextLine(); //introduir manualment "Berlin"
		ciutat2 = scan.nextLine(); //introduir manualment "Madrid"
		ciutat3 = scan.nextLine(); //introduir manualment "Lisboa"
		ciutat4 = scan.nextLine(); //introduir manualment "Barcelona"
		ciutat5 = scan.nextLine(); //introduir manualment "Roma"
		ciutat6 = scan.nextLine(); //introduir manualment "Napoles"
		scan.close(); //cal tancar l'Scanner
		
		System.out.print(ciutat1 + ", "); //impressió de les variables
		System.out.print(ciutat2 + ", ");
		System.out.print(ciutat3 + ", ");
		System.out.print(ciutat4 + ", ");
		System.out.print(ciutat5 + ", ");
		System.out.println(ciutat6);
		
	}

}

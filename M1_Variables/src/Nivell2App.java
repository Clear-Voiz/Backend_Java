
public class Nivell2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double decim = 4.7286; //double inicial
		int enter = (int)decim; //variable int inicialitzada amb la variable double
		float flot = (float)decim; //variable float inicialitzada amb la variable double
		String text = "" + decim; //"variable" String inicialitzada amb la variable double
		System.out.println("casted int = " + enter);
		System.out.println("casted float = " + flot);
		System.out.println("casted string = " + text);
	}

}

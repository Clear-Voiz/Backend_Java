import java.util.Scanner;
public class Nivell2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //Scanner per obtenir l'input de l'usuari
		int [][] dossier = new int [5][3]; //array bidimensional (5 alumnes x 3 notes per alumne)
		for(int i=0;i<5;i++) { //el primer loop recorre la dimensió de l'array pertinent al nombre d'alumnes
			System.out.println("Introdueixi les tres notes de l'alumne " + (i+1));
			for (int j=0;j<3;j++) { //el segon loop recull i emmagatzema les tres notes de cada alumne
				dossier[i][j] = scan.nextInt();
				if (dossier[i][j] >10 || dossier[i][j] <0) //en cas que la nota sigui superior a 10 o inferior a 0 el loop do while impedeix continuar i exigeix un nou valor
				do
				{System.out.println("Error, introdueixi un valor entre 0 i 10 ");
				dossier[i][j] = scan.nextInt();}
			while (dossier[i][j] >10 || dossier[i][j] <0);
			}
		}
		scan.close();
		for(int i=0;i<5;i++) { //loop per calcular i mostrar la mitjana i si s'ha aprovat o suspès
			int mitjana = 0;
			for (int j=0;j<3;j++) {
				mitjana += dossier[i][j]; //suma de les tres notes
			}
			System.out.print("La mitjana de l'alumne " +(i+1) + " és igual a " + (mitjana/3) + ":"); //mostre la variable mitjana partida per 3 per mostrar el resultat
			if ((mitjana/3)>=5) { //si és superior o igual a 5 està aprovat
				System.out.println(" APROVAT");
			}
			else
			{
				System.out.println(" SUSPÈS"); //en qualsevol altre cas està suspès
			}
		}
		
	}

}

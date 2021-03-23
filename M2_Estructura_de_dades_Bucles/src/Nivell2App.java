import java.util.Scanner;
public class Nivell2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in); //amb l'scanner es demana introduir un nombre
int quant = scan.nextInt();
scan.close();

int j = 0;
for (int i=1;i<=quant;i++) { //loop for des de l'1 fins al nombre introduït
	j = 1;
	while(j<=i) { //aquest loop while imprimeix tots els numeros entre l'1 i la posició actual dins del loop for
		System.out.print(j + " ");
		j+=1;
	}
	System.out.println("");
}

j=0; //reciclem la variable j
System.out.println(""); //deixem un espai per separar la segona part d'aquest nivell
for (int i=quant;i>=0;i-=2) { //loop for que crea la piràmide del mateix tamany que el nombre introduït en l'apartat anterior
	for(int k=0;k<=j;k++){
		if (k>0) {System.out.print(" ");} //aquest primer if omet crear un espai a la primera línia del loop
	}
			j+=1; //amb cada repetició cal un espai més
			for (int q=i;q>0;q--){ //aquesta secció imprimeix els asteriscs corresponents a cada línia
				System.out.print("*");
			}
			if (i==0){
				System.out.print("*");
			}
			System.out.println("");

}
	}

}
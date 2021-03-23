
public class Nivell3App {

	public static void main(String[] args) throws InterruptedException {

int hour,minutes,seconds; //s'inicien les variables necessàries
hour = 0;
minutes = 0;
seconds = 0;

while(true) { //com que ha de ser un loop infinit s'utilitza el loop while
	
	if(seconds>=60) //cada seixanta segons la variable segons torna a zero i incrementa la minuts
	{seconds = 0;
	minutes +=1;}
	if(minutes>=60)
	{minutes = 0;
	hour += 1;}
	
	if (hour <10) { //Per major realisme en cas que les hores no siguin de dos xifres imprimeix un zero abans de la variable hores
		System.out.print("0"+ hour);
	}
	else
	{
		System.out.print(hour); //sinó simplement imprimeix la variable hores
	}
	System.out.print(":");//separació d'unitats
	if (minutes <10) {//igual que la línia 20 però amb els minuts
		System.out.print("0"+ minutes);
	}
	else
	{
		System.out.print(minutes);
	}
	System.out.print(":");
	if (seconds <10) { //igual que la línia 20 però amb els segons
		System.out.println("0"+ seconds);
	}
	else
	{
		System.out.println(seconds);
	}
	

	
	Thread.sleep(1000); //congela el programa durant 1000 milisegons
	seconds+=1;

}
	}

}

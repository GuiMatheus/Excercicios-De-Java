package Family28;

import java.util.Scanner;

public class Decisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int parOuImpar;
		
		Scanner veja = new Scanner(System.in);
		
		System.out.println("\nDigite o n�mero: ");
		parOuImpar = veja.nextInt();
				
	if(parOuImpar %2 == 0)	{
		System.out.println("\nTeu n�mero � Par! " + Math.sqrt(parOuImpar) + " � sua raiz quadrada");
	}
	else {
		System.out.println("\nTeu n�mero � Impar! " + Math.pow(parOuImpar,2) + " � sua elevan��o ao quadrado");
	}
	if ( parOuImpar > 0 ) {
		
		System.out.println("\nVosso n�mer Positivo �!");
		
	}
	else if (parOuImpar < 0 ) {
		
		System.out.println("\nVosso n�mero Negativo �!");
		
	}
	else {
		
		System.out.println("\nVosso n�mero ZERO �!");
		
	}
	}

}

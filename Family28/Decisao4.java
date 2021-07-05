package Family28;

import java.util.Scanner;

public class Decisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int parOuImpar;
		
		Scanner veja = new Scanner(System.in);
		
		System.out.println("\nDigite o número: ");
		parOuImpar = veja.nextInt();
				
	if(parOuImpar %2 == 0)	{
		System.out.println("\nTeu número é Par! " + Math.sqrt(parOuImpar) + " é sua raiz quadrada");
	}
	else {
		System.out.println("\nTeu número é Impar! " + Math.pow(parOuImpar,2) + " é sua elevanção ao quadrado");
	}
	if ( parOuImpar > 0 ) {
		
		System.out.println("\nVosso númer Positivo É!");
		
	}
	else if (parOuImpar < 0 ) {
		
		System.out.println("\nVosso número Negativo É!");
		
	}
	else {
		
		System.out.println("\nVosso número ZERO É!");
		
	}
	}

}

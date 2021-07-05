package Family28;

import java.util.Scanner;

public class JavandinhoDevagar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		
		Scanner observe = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = observe.nextFloat() ;
		System.out.println("\nEntre com a primeira nota: ");
		nota2 = observe.nextFloat() ;
		System.out.println("\nEntre com a primeira nota: ");
		nota3 = observe.nextFloat() ;
		
		media = (nota1 = nota2 = nota3)/3;
		
		//System.out.println("\nMédia: "+media );
		System.out.printf("\nMédia: %2.2f ",media );
		
		nota1 = Math.sqrt(nota2);
		
		nota2 = Math.pow(nota3, 3);
		
	}

}

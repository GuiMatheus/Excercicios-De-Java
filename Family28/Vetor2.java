package Family28;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		//� Os n�meros pares digitados;  
		//� A soma dos n�meros pares digitados; 
		//� Os n�meros �mpares digitados; 
		//� A quantidade de n�meros �mpares digitados.

		
		int [] Velvet = new int [6];
		int quantImp = 0, somaPa= 0;
		int G;
		
		Scanner averigue = new Scanner(System.in);
		
		for( G= 0; G <6; G++)
		{	
			System.out.println("\nDigite aqui o numero desejado: ");   //ususario digita
			Velvet [G] = averigue.nextInt();  //susbtitui o vetor []
		//}
		//for (G= 0; G <6; G++) {
		
			
			if (Velvet [G] %2 == 0) // valendo para G par
			{ 
				somaPa = somaPa + Velvet[G];
				System.out.println("\nEstes numeros s�o pares: " + Velvet[G]);
				
				
			}
			else // numero G  valendo para impares 
			{
				
				quantImp++;
			System.out.println("\nEstes numeros s�o impares: " +Velvet[G]);
				
			}
		}
		
		System.out.println("\nOs numeros  pares  somados s�o: " + somaPa);
		System.out.println("\nA quantidade de impares �: " + quantImp );
	
	}

}

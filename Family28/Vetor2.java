package Family28;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//2- Faça um programa que receba 6 números inteiros e mostre: 
		//• Os números pares digitados;  
		//• A soma dos números pares digitados; 
		//• Os números ímpares digitados; 
		//• A quantidade de números ímpares digitados.

		
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
				System.out.println("\nEstes numeros são pares: " + Velvet[G]);
				
				
			}
			else // numero G  valendo para impares 
			{
				
				quantImp++;
			System.out.println("\nEstes numeros são impares: " +Velvet[G]);
				
			}
		}
		
		System.out.println("\nOs numeros  pares  somados são: " + somaPa);
		System.out.println("\nA quantidade de impares é: " + quantImp );
	
	}

}

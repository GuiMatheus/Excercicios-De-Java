package Family28;

import java.util.Scanner;

public class Repet��o5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual 
		//a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

		int num, juntanum = 0;
		Scanner averigue = new Scanner(System.in);
		
		
		
		do {
			System.out.println("\nDigite um numero: ");
			num = averigue.nextInt();
			
			juntanum = juntanum +num;
		}
		while(num!=0);
		System.out.println("\nOs numeros somados ficam iguais a: " + juntanum);
	}
	
}

package Family28;

import java.util.Scanner;

public class Repetição1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR))
		
		
		int x, par = 0, impar = 0, num;
		Scanner averigue = new Scanner(System.in);
		
		
		
		for (num =1 ;num <=10; num++) {
			
			System.out.println("\nInsira um numero: ");
			x = averigue.nextInt();
			
			if( x %2 ==0 ) {
				x = par;
						par++;
			}
			else {
				
				x = impar;
				impar++;
			}
		}
		System.out.println("\nVocê digitou " + par + " numeros pares! e " + impar + " numeros impares !");
		
	}

}

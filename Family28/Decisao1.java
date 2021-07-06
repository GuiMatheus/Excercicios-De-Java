package Family28;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		
		
		try (Scanner observe = new Scanner(System.in)) {
			System.out.println("\nInsira primeiro numero: ");
			num1 = observe.nextInt();
			
			System.out.println("\nInsira segundo numero: ");
			num2 = observe.nextInt();
			
			System.out.println("\nInsira Terceiro numero: ");
			num3 = observe.nextInt();
		}
		
		if(num1 > num2 && num1 > num3 )
		{ 
			System.out.println("\nMaior numero: " + num1);}
			
		
		else if(num2 > num3 && num2 > num1 ) {
			
			System.out.println("\nMaior numero: " + num2);
		}
		
		else {
			System.out.println("\nMaior numero: " + num3);
		}
	}
			
			
	}
		
	
		
	


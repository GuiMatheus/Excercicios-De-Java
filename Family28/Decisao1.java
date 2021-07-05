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
		
		if(num1 < num2 && num2 <= num3)
		{
			System.out.println("\nMaior numero:" + num1);}
			
			else if (num1< num3 && num3 <= num2)
			{
			System.out.println("\nMaior numero: " + num1);}
		
			else if (num3<num1 && num1<=num2);
		{
			System.out.println("\nMaior numero:" + num3);
			
			 if (num3< num2 && num2 <= num1) {
				
				
			System.out.println("\nMaior numero: " + num3);
			}
			 else 
				 System.out.println("\nMaior numero: " + num2);
		}
		}
	
		
	}



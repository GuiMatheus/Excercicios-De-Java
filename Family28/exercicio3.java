package Family28;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float not1, not2 , not3, resp1, resp2, resp3;
		
		Scanner analise = new Scanner(System.in);
		
		System.out.println("\nNota 1: ");
		not1 = analise.nextFloat();
		System.out.println("\nNota 2: ");
		not2 = analise.nextFloat();
		
		resp1 = not1 + not2;
		System.out.println("\nSoma :" + resp1);
		
		System.out.println("\nNota 3: ");
		not3 = analise.nextFloat();
		
		resp2 = not3 + resp1;
		System.out.println("\nSoma :" + resp2);
		
		resp3 = resp2/3;
		System.out.println("\nMédia Final: " + resp3);
	}

}

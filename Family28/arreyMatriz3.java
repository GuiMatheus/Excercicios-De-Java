package Family28;

import java.util.Scanner;

public class arreyMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float [] [] valor = new float [3] [3];
			int l,c,cont = 0;
			
			Scanner averigue = new Scanner(System.in);
			
			for (l = 0; l < 3; l++)
			{
				for (c = 0;c < 3; c++ ) {
					System.out.println("\nEntre com os numeros: ");
					valor [l] [c] = averigue.nextFloat();
					
					if (valor[l] [c] >10)
					{
						cont++;
						
					}
					
				}
			}
			
			System.out.println("\nOs valores acima de 10 são: " + cont);
	}

}

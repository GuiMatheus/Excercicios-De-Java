package Family28;

import java.util.Scanner;

public class ArreyMatriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [ ] [ ] A = new float [2] [2];
		float [ ] [ ] B = new float [2] [2];
		float [ ] [ ] resultado = new float [2] [2];
		int l,c, op, valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor ");
		valor = leia.nextInt();
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nEntre com o valor A");
				A[1][c]=leia.nextFloat();
				System.out.println("\nEntre com o valor A");
				B[1][c]=leia.nextFloat();
			}
		}
		System.out.println("\n\t\nMenu de opções");
		System.out.println("\n1 - Somar as matrizes");
		System.out.println("\n2 - Subtratir a primeira matriz da segunda");
		System.out.println("\n3 - Adicionar uma constante a duas matries");
		System.out.println("\n4 - Imprimir as matrizes");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
	
		switch(op)
		{
			case 1:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						resultado[l][c] + B[l][c];
						System.out.println("\nResultado da soma: " +resultado);
						
					}
				}
			break;
			
			case 2:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						resultado[l][c] - B[l][c];
						System.out.println("\nResultado da soma: " +resultado);
						
				
		}
	}
	break;			
	
			case 3:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						resultado[l][c] + b[l][c];
							System.out.println("\nResultado da soma: " +resultado);
			
	

}

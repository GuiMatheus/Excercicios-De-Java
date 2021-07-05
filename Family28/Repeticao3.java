package Family28;

import java.util.Scanner;

public class Repeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

		int  g= 0, menor21 =0, maior50 = 0, idade ; 
		Scanner averigue = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = averigue.nextInt();
		
		System.out.println("\n Para parar as inserções digite -99");
		
		while(idade != -99) {
			
			System.out.println("\nDigite sua idade: ");
			idade = averigue.nextInt();
			
			if( idade < 21) {
				menor21 ++;
			}
			else if (idade > 50) {
				maior50 ++;
			}
			else {
				
				g++;
			}
		}
		
		System.out.println("\nForam adicionados " + menor21 + " idades menores a 21 e " + maior50 + " maiores de 50!");
		
	}

}

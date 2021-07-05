package Family28;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double anos,meses,dias,totaldias;
		
		Scanner  observe = new Scanner(System.in);
		
		System.out.println("\nInsira os anos de vida: ");
		anos = observe.nextFloat();
		System.out.println("\nInsira os meses de vida: ");
		meses = observe.nextFloat();
		System.out.println("\nInsira os diaas de vida: ");
		dias = observe.nextFloat();
		
		totaldias = anos*365 + meses*30 + dias;
		
		System.out.println("Você existe a cerca de: "+totaldias + " dias de vida!" );
	}

}

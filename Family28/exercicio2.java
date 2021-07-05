package Family28;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totaldias, anos, meses, dias;
		
		Scanner observe = new Scanner(System.in);
		
		System.out.println("\nEntre com o total de dias existidos: ");
		totaldias = observe.nextFloat();
		
		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;
		
		System.out.printf("\nEu existo á:  "+ anos + "anos, " + meses +"meses, " + dias + "e dias.  " );
	}

}

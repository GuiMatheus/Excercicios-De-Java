package POO;

public class ProrodutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proroduto [] plus = new  Proroduto [2] ;
		
		
		plus[0] = new Proroduto(" Ursinhos de Pelucia", " Gigante ", " Milhoes ",100);
		plus[1] = new Proroduto(" Cerulares", " Nokia tijolin ", " Poucos ", 2500);
		//("Ursinhos de pelucia", "gigante", "milhoes");
		
		for (Proroduto vira: plus)
		{
			vira.mostrar();
		}
		
		System.out.println("**************************");
		
		for (Proroduto vira : plus)
		{
			vira.aumentarPrecin(10);
			vira.mostrar();
		}
	}

}

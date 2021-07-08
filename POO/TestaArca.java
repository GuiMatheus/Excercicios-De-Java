package POO;

public class TestaArca										{

						public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nome, int idade, String somEmitido, 
		//String pelo, String instinto, String raça, String cor, float peso)
			Cachorro auau = new Cachorro ("Clifford", 2, "Latir", "Pelo Arrepiadin",
					"Jeitinho Doido", "Gigante Vermelho", "Avermelhada", "muito" );
				
			auau.imprimirInfo();
			System.out.println("\n*************");
					
			Cavalo pocoto = new Cavalo ("Alipio", 4, "Relinchar","Sua Crina","Abusado","Brasileiro",
					"Brincando de Pique Esconde", "dormindo pesado");
			
			pocoto.imprimirInfo();
			System.out.println("*\n**************");
			
			Preguiça nha = new Preguiça ("Sid", 5, "balidos", "Pelo Grande",
					"Debochado","Mangas","Fica Feliz", "Enorme");
			
			nha.ImprimirInfo();
	}

}

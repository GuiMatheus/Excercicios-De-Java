package POO;

public class TestaArca										{

						public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nome, int idade, String somEmitido, 
		//String pelo, String instinto, String ra�a, String cor, float peso)
			Cachorro auau = new Cachorro ("Clifford", 2, "Arrepiadin",
					"Jeitinho Doido", "Gigante Vermelho", "Avermelhada", "Muito" );
				
			auau.imprimirInfo();
			auau.som();
			auau.corre();
			
			
			System.out.println("\n*************");
					
			Cavalo pocoto = new Cavalo ("Alipio", 4,"Sua Crina","Abusado","Brasileiro",
					"Brincando de Pique Esconde", "dormindo pesado");
			
			pocoto.imprimirInfo();
			pocoto.som();
			pocoto.corre();
			
			
			System.out.println("\n**************");
			
			Pregui�a nha = new Pregui�a ("Sid", 5, "Pelo Grande",
					"Debochado","Dentes de le�o"," Feliz", "Enorme");
			
			nha.ImprimirInfo();
			nha.som();
			nha.corre();
	}

}

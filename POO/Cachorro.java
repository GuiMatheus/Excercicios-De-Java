package POO;

public class Cachorro extends Animal {
		 
	private String raça;
	private String cor;
	private String peso;
	
		public Cachorro (String nome, int idade, String somEmitido, 
				String pelo, String instinto, String raça, String cor, String peso)
		{
			super( nome, idade, somEmitido,  pelo, instinto);
			this.raça = raça;
			this.cor = cor;
			this.peso = peso;
		}

		public String getRaça() {
			return raça;
		}

		public void setRaça(String raça) {
			this.raça = raça;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getPeso() {
			return peso;
		}

		public void setPeso(String peso) {
			this.peso = peso;
		}
		public void imprimirInfo()
		{
			System.out.println( "\nO Nome do doguin é "+ getNome() + " possui " + getIdade() + " anos de idade e costuma "
					+ getSomEmitido() + " quando esta nervouser,  seu " + getPelo() + " \nprecisa de atenção e cuidado, seu "+
					 getInstinto() + " costuma infererir no seu dia dia, é da raça " + raça + " \ntem uma cor " + cor + " muito linda, "
					 		+ " e pesa " + peso );
		}
}

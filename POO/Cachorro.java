package POO;

public class Cachorro extends Animal {
		 
	private String ra�a;
	private String cor;
	private String peso;
	
		public Cachorro (String nome, int idade, String somEmitido, 
				String pelo, String instinto, String ra�a, String cor, String peso)
		{
			super( nome, idade, somEmitido,  pelo, instinto);
			this.ra�a = ra�a;
			this.cor = cor;
			this.peso = peso;
		}

		public String getRa�a() {
			return ra�a;
		}

		public void setRa�a(String ra�a) {
			this.ra�a = ra�a;
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
			System.out.println( "\nO Nome do doguin � "+ getNome() + " possui " + getIdade() + " anos de idade e costuma "
					+ getSomEmitido() + " quando esta nervouser,  seu " + getPelo() + " \nprecisa de aten��o e cuidado, seu "+
					 getInstinto() + " costuma infererir no seu dia dia, � da ra�a " + ra�a + " \ntem uma cor " + cor + " muito linda, "
					 		+ " e pesa " + peso );
		}
}

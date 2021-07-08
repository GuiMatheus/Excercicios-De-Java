package POO;

public class Preguiça extends Animal {

	
	private String gosto;
	private String humor;
	private String tamanho;
	
	public Preguiça (String nome, int idade, String somEmitido, String pelo, 
			String instinto, String gosto, String humor, String tamanho)
	{
		super (nome, idade, somEmitido, pelo, instinto);
		this.gosto = gosto;
		this.humor = humor;
		this.tamanho = tamanho;
	}

	public String getGosto() {
		return gosto;
	}

	public void setGosto(String gosto) {
		this.gosto = gosto;
	}

	public String getHumor() {
		return humor;
	}

	public void setHumor(String humor) {
		this.humor = humor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void ImprimirInfo()
	{
		System.out.println("\nA " + getNome() + " tem " + getIdade() + " anos de idade  e emite " + getSomEmitido() //balidos
		+ " quando se sente ameaçado, seu " + getPelo() + " ajuda a proteger do mal tempo," +  " \ncostumar ser " + getInstinto() + 
		" adora comer " + gosto + " e " + humor + " quando esta no seu habitat" + " \ne costuma ser " + tamanho );
	}
}

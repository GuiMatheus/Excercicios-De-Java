package POO;

public class Preguiça extends Animal
{

	private String gosto;
	private String humor;
	private String tamanho;

	public Preguiça(String nome, int idade, String pelo, String instinto, String gosto, String humor, String tamanho)
	{
		super(nome, idade, pelo, instinto);
		this.gosto = gosto;
		this.humor = humor;
		this.tamanho = tamanho;
	}

	public String getGosto()
	{
		return gosto;
	}

	public void setGosto(String gosto)
	{
		this.gosto = gosto;
	}

	public String getHumor()
	{
		return humor;
	}

	public void setHumor(String humor)
	{
		this.humor = humor;
	}

	public String getTamanho()
	{
		return tamanho;
	}

	public void setTamanho(String tamanho)
	{
		this.tamanho = tamanho;
	}

	public void ImprimirInfo()
	{
		System.out.println("\nNome da preguiça é: " + getNome() + "\nPossui " + getIdade() + " anos de idade "
				+ "\nSeu " + getPelo() + " ajuda a proteger do mal tempo." + " \nCostumar ser " + getInstinto()
				+ "\nAdora comer " + gosto + "\nSe sente " + humor + " quando esta no seu habitat" + " \nE costuma ser "
				+ tamanho);
	}

	@Override
	public void som()
	{
		System.out.println("Bali assim: ....!!!");
	}

	@Override
	public void corre()
	{
		System.out.println("Se locomove: Subindo arvores");

	}
}

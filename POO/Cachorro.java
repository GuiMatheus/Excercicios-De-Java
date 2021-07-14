package POO;

public class Cachorro extends Animal
{

	private String raça;
	private String cor;
	private String peso;

	public Cachorro(String nome, int idade, String pelo, String instinto, String raça, String cor, String peso)
	{
		super(nome, idade, pelo, instinto);
		this.raça = raça;
		this.cor = cor;
		this.peso = peso;
	}

	public String getRaça()
	{
		return raça;
	}

	public void setRaça(String raça)
	{
		this.raça = raça;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getPeso()
	{
		return peso;
	}

	public void setPeso(String peso)
	{
		this.peso = peso;
	}

	public void imprimirInfo()
	{
		System.out.println("\nO Nome do doguin é: " + getNome() + "\nTem a seguinte idade:  " + getIdade() + " anos."
				+ "\nSeu pelo é: " + getPelo() + " precisa de atenção e cuidado." + " \nSeu " + getInstinto()
				+ " costuma infererir no seu dia dia" + "\nÉ da raça: " + raça + " \nTem uma cor " + cor
				+ " muito linda," + " e pesa " + peso);
	}

	@Override
	public void som()
	{
		System.out.println("Uiva assim :Auuuuuuuuuuuuuuuu!!!");
	}

	@Override
	public void corre()
	{
		System.out.println("Se locomove: Correndo");
	}
}

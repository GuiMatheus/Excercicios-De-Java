package POO;

public class Animal {
	
	
	
	private String nome;
	private int idade;
	private String somEmitido;
	private String pelo;
	private String instinto;
	
	public  Animal (String nome, int idade, String somEmitido, String pelo, String instinto)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.somEmitido = somEmitido;
		this.pelo = pelo;
		this.instinto = instinto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSomEmitido() {
		return somEmitido;
	}

	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public String getInstinto() {
		return instinto;
	}

	public void setInstinto(String instinto) {
		this.instinto = instinto;
	}
}



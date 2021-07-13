package POO;

public abstract class Animal {
	
	
	
	private String nome;
	private int idade;
	private String pelo;
	private String instinto;
	

	
	public  Animal (String nome, int idade, String pelo, String instinto)
	{
		super();
		this.nome = nome;
		this.idade = idade;
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
	abstract public void som();
	abstract public void corre();
}



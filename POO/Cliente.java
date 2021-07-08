package POO;

public class Cliente {
		private String nome;
		private String idade;
		private String jeito;
		private String paga;
		
		public Cliente (String nome, String idade,String jeito, String paga)
		{
			this.nome = nome;
			this.idade = idade;
			this.jeito = jeito ;
			this.paga = paga;
			
		}
	
	public void imprimirInfo()
	{
		System.out.println(nome + " tem " + idade + " anos de idade e é um cliente " + jeito + " e ainda " + paga);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getJeito() {
		return jeito;
	}

	public void setJeito(String jeito) {
		this.jeito = jeito;
	}

	public String getPaga() {
		return paga;
	}

	public void setPaga(String paga) {
		this.paga = paga;
	}
	
	
	}
	
package POO;

public class Cavalo extends Animal{
		
	private String nacionalidade;
	private String atividade;
	private String sono;
	
	public Cavalo (String nome, int idade, String somEmitido, String pelo, 
			String instinto, String nacionalidade, String atividade, String sono)
	{
		super( nome,  idade, somEmitido,  pelo,  instinto);
		this.nacionalidade = nacionalidade;
		this.atividade = atividade;
		this.sono = sono;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getExercicio() {
		return atividade;
	}

	public void setExercicio(String atividade) {
		this.atividade = atividade;
	}

	public String getSono() {
		return sono;
	}

	public void setSono(String sono) {
		this.sono = sono;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nO cavalin " + getNome() + " tem " + getIdade() + " aninhos de idade e adora " 
	+ getSomEmitido() + "  quando ta cavalgando com sua " + getPelo() + " balançando ao vendo  tem um jeitinho mais " + 
		getInstinto() + " \né uma natural " + nacionalidade + " que adora se divertir " + atividade + " \ndepois gosta de descansar "
		+ sono );
	}
} 


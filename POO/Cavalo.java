package POO;

public class Cavalo extends Animal{
		
	private String nacionalidade;
	private String atividade;
	private String sono;
	
	public Cavalo (String nome, int idade,  String pelo, 
			String instinto, String nacionalidade, String atividade, String sono)
	{
		super( nome,  idade,   pelo,  instinto);
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
		System.out.println("\nO nome do cavalin é: " + getNome() + " \nTem " + getIdade() + " aninhos de idade " +   "\nQando ta cavalgando com sua " + getPelo() + " balançando ao vendo " + "\nTem um jeitinho: "+
		getInstinto() + " \nÉ uma natural :" + nacionalidade + "\nAdora se divertir: " + atividade + "\nPrefere descansar: "
		+ sono ) ;
	}
	@Override
	public void som(){
		System.out.println("Relincha assim: Iririririiiiiii!!!");
	}
	@Override
	public void corre()  {
		System.out.println("Se locomove: Cavalgandinho");
} 
}


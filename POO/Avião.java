package POO;

public class Avião {
	
	private String poltrona;
	private String faixaetaria;
	private String classe;
	private String posição;
	
	public Avião (String poltrona, String faixaetaria, String classe, String posição)
	{
		this.poltrona = poltrona;
		this.faixaetaria = faixaetaria;
		this.classe = classe;
		this.posição = posição;
		

	}
	public void ImprimirInfo()
	{
		System.out.println("No Avião da Guiariline na " +  poltrona + " tem uma pessoa " +
	faixaetaria + " localizada na classe " + classe + " posicionada perto do(a) " + posição);
	}
	public String getPoltrona() {
		return poltrona;
	}
	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}
	public String getFaixaetaria() {
		return faixaetaria;
	}
	public void setFaixaetaria(String faixaetaria) {
		this.faixaetaria = faixaetaria;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getPosição() {
		return posição;
	}
	public void setPosição(String posição) {
		this.posição = posição;
	}

}

package POO;

import java.text.NumberFormat;

public class Proroduto {
	
	private String poroduto;
	private String tamanho;
	private String quantidade;
	private double precin;

	
	public Proroduto ( String p, String t, String q, double pc)
	{
		this.setPoroduto(p);
		this.setTamanho(t);
		this.setQuantidade(q);
		this.setPrecin(pc);
	
	}
	
	public void aumentarPrecin(double percentual)
	{
		precin *= 1 + percentual/100;
	}

	public String getPoroduto() {
		return poroduto;
	}

	public void setPoroduto(String poroduto) {
		this.poroduto = poroduto;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecin() {
		return precin;
	}

	public void setPrecin(double precin) {
		this.precin = precin;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
				nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(precin);
		return formatoMoeda;
	}
	public void mostrar()
	{
			System.out.println("Os" + poroduto + " de tipo" + tamanho + "estão sendo vendidos aos " + quantidade 
					+ " pela bagatela de " + "\t\t"+ this.formatarMoeda());
	}
}

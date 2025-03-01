package br.com.henriquebg.lojaonline;

public class JogoMidiaFisica extends ProdutoFisico 
{
	private String estudio;
	
	public JogoMidiaFisica(String nome, double preco, double peso, String estudio) 
	{
		super(nome, preco, peso);
		this.estudio = estudio;
	}
	
	public String getEstudio()
	{
		return estudio;
	}
	
	@Override
	public String toString()
	{
		return "Jogo Mídia Física: " + nome + " / Preço: " + preco;
	}
}

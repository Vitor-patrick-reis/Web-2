package br.com.henriquebg.lojaonline;

public class FilmeDigital extends ProdutoDigital
{
	private String estudio;
	
	public FilmeDigital(String nome, double preco, double tamanhoArquivo, String estudio) 
	{
		super(nome, preco, tamanhoArquivo);
		this.estudio = estudio;
	}
	
	public String getEstudio()
	{
		return estudio;
	}
	
	@Override
	public String toString()
	{
		return "Filme Digital: " + nome + " / Preço: " + preco;
	}
}

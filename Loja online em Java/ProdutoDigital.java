package br.com.henriquebg.lojaonline;

public class ProdutoDigital extends Produto 
{
	private double tamanhoArquivo;
	
	public ProdutoDigital(String nome, double preco, double tamanhoArquivo) 
	{
		super(nome, preco);
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public double getTamanhoArquivo() 
	{
		return tamanhoArquivo;
	}
}

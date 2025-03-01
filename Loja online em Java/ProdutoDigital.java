package br.com.henriquebg.lojaonline;

public abstract class ProdutoDigital extends Produto 
{
	protected double tamanhoArquivo;
	
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

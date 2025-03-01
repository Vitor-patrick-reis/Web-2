package br.com.henriquebg.lojaonline;

public abstract class ProdutoFisico extends Produto
{
	protected double peso;
	
	public ProdutoFisico(String nome, double preco, double peso) 
	{
		super(nome, preco);
		this.peso = peso;
	}
	
	public double getPeso()
	{
		return peso;
	}
}

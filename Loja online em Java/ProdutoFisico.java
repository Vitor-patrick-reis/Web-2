package br.com.henriquebg.lojaonline;

public class ProdutoFisico extends Produto
{
	private double peso;
	
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

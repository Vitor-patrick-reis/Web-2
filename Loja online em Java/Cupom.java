package br.com.henriquebg.lojaonline;

public class Cupom 
{
	private String codigo;
	private double desconto;
	
	public Cupom(String codigo, double desconto)
	{
		this.codigo = codigo;
		this.desconto = desconto;
	}

	public double getDesconto() 
	{
		return desconto;
	}
}

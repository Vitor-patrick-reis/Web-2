package br.com.henriquebg.lojaonline;

public class Console extends ProdutoFisico 
{
	private String fabricante;
	
	public Console(String nome, double preco, double peso, String fabricante) 
	{
		super(nome, preco, peso);
		this.fabricante = fabricante;
	}
	
	public String getFabricante()
	{
		return fabricante;
	}
	
	@Override
	public String toString()
	{
		return "Console: " + nome + " / Preço: " + preco;
	}
}

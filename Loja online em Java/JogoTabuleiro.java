package br.com.henriquebg.lojaonline;

public class JogoTabuleiro extends ProdutoFisico 
{
	private String editora;
	
	public JogoTabuleiro(String nome, double preco, double peso, String editora) 
	{
		super(nome, preco, peso);
		this.editora = editora;
	}
	
	public String getEditora()
	{
		return editora;
	}
	
	@Override
	public String toString()
	{
		return "Jogo Tabuleiro: " + nome + " / Preço: " + preco;
	}
}

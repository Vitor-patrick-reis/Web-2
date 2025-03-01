package br.com.henriquebg.lojaonline;

public class LivroFisico extends ProdutoFisico 
{
	private String editora;
	private String isbn;
	
	public LivroFisico(String nome, double preco, double peso, String editora, String isbn) 
	{
		super(nome, preco, peso);
		this.editora = editora;
		this.isbn = isbn;
	}
	
	public String getEditora()
	{
		return editora;
	}
	
	public String getISBN()
	{
		return isbn;
	}
	
	@Override
	public String toString()
	{
		return "Livro Físico: " + nome + " / Preço: " + preco;
	}
}

package br.com.henriquebg.lojaonline;

public class LivroDigital extends ProdutoDigital implements Enviavel
{
	private String editora;
	private String isbn;
	
	public LivroDigital(String nome, double preco, double tamanhoArquivo, String editora, String isbn) 
	{
		super(nome, preco, tamanhoArquivo);
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
		return "Livro Digital: " + nome + " / Preço: " + preco;
	}

	@Override
	public void enviarPorEmail(String email) 
	{
		System.out.println("O livro " + nome + " foi enviado para o email: " + email);
	}
}

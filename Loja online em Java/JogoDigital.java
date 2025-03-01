package br.com.henriquebg.lojaonline;

public class JogoDigital extends ProdutoDigital implements Enviavel
{

	private String estudio;
	
	public JogoDigital(String nome, double preco, double tamanhoArquivo, String estudio) 
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
		return "Jogo Digital: " + nome + " / Preço: " + preco;
	}

	@Override
	public void enviarPorEmail(String email) 
	{
		System.out.println("O jogo " + nome + " foi enviado para o email: " + email);
	}
}

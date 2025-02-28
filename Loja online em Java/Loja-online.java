package br.com.henriquebg.lojaonline;

public class LojaOnline 
{
	public static void main(String[] args) 
	{
		Cliente cliente = new Cliente("Fulano", "fulano@email.com", "00000000000");
		
		Produto livro = new Produto("O Senhor dos Aneis", 50.0);
		Produto jogo = new Produto("GTA 6", 250.0);
		Produto console = new Produto("Nintendo Switch", 2500.0);
		
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarProduto(livro);
		pedido.adicionarProduto(jogo);
		pedido.adicionarProduto(console);
		pedido.finalizar();
	}
}

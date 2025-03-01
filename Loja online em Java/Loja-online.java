package br.com.henriquebg.lojaonline;

public class LojaVirtual 
{
	public static void main(String[] args) 
	{
		Cliente cliente = new Cliente("Fulano", "fulano@email.com");
		
		Produto livro = new LivroFisico("O Senhor dos Anéis", 50.0, 0.5, "HarperCollins", "8595086354");
		Produto jogo = new JogoDigital("Mario Odyssey", 250.0, 10000.0, "Nintendo");
		Produto console = new Console("Nintendo Switch", 2500.0, 2.0, "Nintendo");
		Produto filme = new FilmeDigital("Piratas do Caribe", 25.0, 500.0, "Warner Bros.");
		
		Pedido pedido = new Pedido(cliente);
		Cupom cupomDesconto = new Cupom("CARNAVAL20", 0.2);
		pedido.aplicarDesconto(cupomDesconto);
		pedido.adicionarProduto(livro);
		pedido.adicionarProduto(jogo);
		pedido.adicionarProduto(console);
		pedido.adicionarProduto(filme);
		pedido.finalizar();
	}
}

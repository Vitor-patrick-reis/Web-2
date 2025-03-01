package br.com.henriquebg.lojaonline;

import java.util.ArrayList;

public class Pedido 
{
	private Cliente cliente;
	private ArrayList<Produto> produtos;
	private Cupom cupomDesconto;
	
	public Pedido(Cliente cliente)
	{
		this.cliente = cliente;
		produtos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto(Produto produto)
	{
		produtos.add(produto);
	}
	
	private double calcularSubtotal()
	{
		double subtotal = 0.0;
		
		for (Produto produto : produtos)
		{
			subtotal += produto.getPreco();
		}
		
		return subtotal;
	}
	
	private double calcularFrete()
	{
		double somaPesos = 0.0;
		
		for (Produto produto : produtos)
		{
			if (produto instanceof ProdutoFisico)
			{
				somaPesos += ((ProdutoFisico) produto).getPeso();
			}
		}
		
		return somaPesos * 5.0;
	}
	
	public void aplicarDesconto(Cupom cupomDesconto)
	{
		this.cupomDesconto = cupomDesconto;
	}
	
	public void finalizar()
	{
		System.out.println("=============RESUMO DO PEDIDO=============");
		System.out.println(cliente);
		System.out.println("=============ITENS DO PEDIDO==============");
		
		for (Produto produto : produtos)
		{
			System.out.println(produto);
		}
		
		double subtotal = calcularSubtotal();
		
		double desconto = 0.0;
		
		if (cupomDesconto != null)
		{
			desconto = subtotal * cupomDesconto.getDesconto();
		}
		
		double frete = calcularFrete();
		double valorTotal = subtotal - desconto + frete;
		
		System.out.println("=============TOTAL DO PEDIDO==============");
		System.out.println("SUBTOTAL: " + subtotal);
		System.out.println("DESCONTO: " + desconto);
		System.out.println("FRETE: " + frete);
		System.out.println("TOTAL: " + valorTotal);
		System.out.println("========ENVIO DE PRODUTOS DIGITAIS========");
		
		for (Produto produto : produtos)
		{
			if (produto instanceof Enviavel)
			{
				((Enviavel)produto).enviarPorEmail(cliente.getEmail());
			}
		}
	}
}
 

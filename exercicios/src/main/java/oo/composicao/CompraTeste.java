package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = "joao pedro";
		compra.adicionarItem(new Item("caneta", 20, 7.45));
		compra.adicionarItem(new Item("borracha", 12, 3.89));
		compra.adicionarItem(new Item("caderno", 3, 18.79));
		
		System.out.println(compra.itens.size());
		System.out.println(compra.obterValorTotal());
	}
}

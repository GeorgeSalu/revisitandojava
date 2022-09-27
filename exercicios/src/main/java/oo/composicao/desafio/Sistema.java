package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("notebook", 1893.1), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 9.67, 100);
		compra2.adicionarItem(new Produto("impressora", 1893.1), 2);
		

		Cliente cliente = new Cliente("maria julia moraes");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}

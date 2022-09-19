package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preco = 12132;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "caneta preta";
		p2.preco = 12.33;
		p2.desconto = 0.29;
		
		System.out.println(p2.nome);
		System.out.println(p1.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		System.out.println((precoFinal1 + precoFinal2) / 2);
	}
}

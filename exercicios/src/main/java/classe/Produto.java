package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial, double precoInical) {
		nome = nomeInicial;
		preco = precoInical;
	}
	
	Produto() {
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}

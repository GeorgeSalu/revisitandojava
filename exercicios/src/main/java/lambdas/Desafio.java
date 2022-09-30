package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		Produto p = new Produto("ipad", 3235.89, 0.19);
		
		/*
		 1. a partir do produto calcular o preco real (com desconto)
		 2. imposto municipal: >= 2500 (8.5%) / < 2500 (isento)
		 3. frete: >= 3000 (100) / < 3000 (50)
		 4. arredondar: deixar duas casas decimais
		 5. formatar: r$ 1234.56 
		*/
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		Function<Double, String> formatar = 
				preco -> ("R$"+ preco).replace(".", ",");
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("o preco final é "+preco);
	}
}

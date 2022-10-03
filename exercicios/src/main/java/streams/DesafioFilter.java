package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("lapis", 1.99, 0.35, 00);
		Produto p2 = new Produto("notebook", 4899.89, 0.32, 00);
		Produto p3 = new Produto("caderno", 30, 0.45, 00);
		Produto p4 = new Produto("impressora", 1200, 0.40, 00);
		Produto p5 = new Produto("ipad", 3100, 0.29, 00);
		Produto p6 = new Produto("relogio", 1900, 0.12, 00);
		Produto p7 = new Produto("monitor", 800, 0.31, 00);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional =
				p -> "aproveite !"+p.nome+" por r$ "+p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
	}
}

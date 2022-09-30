package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome+"!!");
		
		Produto p1 = new Produto("caneta", 12.23, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("notebook", 12.23, 0.09);
		Produto p3 = new Produto("caberno", 12.23, 0.09);
		Produto p4 = new Produto("borracha", 12.23, 0.09);
		Produto p5 = new Produto("lapis", 12.23, 0.09);
		
		List<Produto> produtos = Arrays.asList(p2, p3,p4,p5); 
		
		produtos.forEach(imprimir);
	}
}

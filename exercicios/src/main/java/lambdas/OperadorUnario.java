package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer> masDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = masDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(masDois)
				.apply(0);
		
		System.out.println(resultado2);
		
	}
}

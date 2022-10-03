package streams;

import java.util.Arrays;
import java.util.List;

public class Map {
	public static void main(String[] args) {
		
		List<String> marcas = Arrays.asList("bmw ", "audi ", "honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(Utilitarios.print);

		System.out.println("\nusando composicao");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios.grito)
			.forEach(Utilitarios.print);
	}
}

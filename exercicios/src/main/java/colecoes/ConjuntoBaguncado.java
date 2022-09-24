package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjuto = new HashSet();
		
		conjuto.add(1.2); 		//double -> Double
		conjuto.add(true);
		conjuto.add("Teste");
		conjuto.add(1);
		
		System.out.println("tamanho é "+conjuto.size());
		
		conjuto.add("Teste");
		conjuto.add("x");
		System.out.println("tamanho é "+conjuto.size());
		
		System.out.println(conjuto.remove("teste"));
		System.out.println(conjuto.remove("Teste"));
		System.out.println(conjuto.remove("x"));
		
		System.out.println("Tamanho é "+conjuto.size());
		
		System.out.println(conjuto.contains("x"));
		System.out.println(conjuto.contains(1));
		System.out.println(conjuto.contains(true));
		
		Set nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
	}
}

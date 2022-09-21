package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("arroz", 0.22);
		Comida c2 = new Comida("feijao", 0.30);
		
		Pessao p = new Pessao("joao", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());		
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}

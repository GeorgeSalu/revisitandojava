package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("ola pessoal".charAt(2));
		
		String s = "boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		
		var nome = "pedro";
		var sobrenome = "santos";
		var idade = 33;
		var salario = 11122;
		
		System.out.println("nome "+nome+" sobrenome "+sobrenome+" idade "+idade+" salario "+salario);
		
	}
}

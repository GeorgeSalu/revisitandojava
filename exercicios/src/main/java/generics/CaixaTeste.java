package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<String>();
		caixaA.aguardar("segredo");
		
		System.out.println(caixaA.abrir());
	}
}

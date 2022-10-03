package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim ");
	}
	
	// não checada ou nao verificada
	static void geraErro1() {
		throw new RuntimeException("ocorreu um erro bem legal #01");
	}
	
	// exceção checada ou verificada
	static void geraErro2() throws Exception{
		new Exception("ocorreu um erro bem legal #02");
	}
}

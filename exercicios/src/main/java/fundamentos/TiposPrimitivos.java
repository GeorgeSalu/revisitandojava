package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionario
		
		// tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numeros reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleanos
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A';
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos reais
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha "+salario);
		System.out.println("ferias "+estaDeFerias);
		System.out.println("status "+status);
	}
}

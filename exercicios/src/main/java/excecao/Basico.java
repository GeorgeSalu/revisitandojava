package excecao;

public class Basico {
	public static void main(String[] args) {
		
		System.out.println(7 / 0);
		
		Aluno a1 = null;
		try {
			imprimirNomeDoAluno(a1);
		}catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usaurio");
		}
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}

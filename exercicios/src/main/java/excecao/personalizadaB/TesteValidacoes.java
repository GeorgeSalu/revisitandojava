package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("", -7);
		
		try {
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			e.printStackTrace();
		} 
		
		System.out.println("fim");
	}
}

package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("joao");
		Aluno aluno2 = new Aluno("maria");
		Aluno aluno3 = new Aluno("pedro");
		
		Curso curso1 = new Curso("java completo");
		Curso curso2 = new Curso("web 2023");
		Curso curso3 = new Curso("react native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("estou matriculado no curso 1...");
			System.out.println("e o meu nome é "+aluno.nome);
		}
		
	}
}

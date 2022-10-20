package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("star wars 4p 3", 8.9);
		Filme filmeB = new Filme("O fugitivo", 8.1);
		
		Ator atorA = new Ator("harrison ford");
		Ator atorB = new Ator("carrie fisher");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
	}
}

package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> obterTodos = dao.obterTodos();
		
		for (Produto produto : obterTodos) {
			System.out.println(produto.getNome());
		}
	}
}

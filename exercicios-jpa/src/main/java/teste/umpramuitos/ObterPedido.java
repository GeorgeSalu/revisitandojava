package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
	public static void main(String[] args) {

		DAO<Pedido> dao = new DAO<>(Pedido.class);

		Pedido pedido = dao.obterPorId(1l);

		for (ItemPedido itemPedido : pedido.getItens()) {
			System.out.println(itemPedido.getQuantidade());
			System.out.println(itemPedido.getProduto().getNome());
		}

		dao.fechar();
	}
}

package loja;
public class PagamentoDinheiro implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento por dinheiro!");
	}

}

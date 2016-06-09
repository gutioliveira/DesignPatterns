package loja;

public class PagamentoBoleto implements PagamentoCommand {

	@Override
	public void processarCompra(Compra compra) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento por boleto");
	}

}

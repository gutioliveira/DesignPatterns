package loja;

public class Loja {
	
	String nomeDaLoja;
	
	public Loja(String nomeDaLoja){
		this.nomeDaLoja = nomeDaLoja;
	}
	
	public void executarCompra(double valor, PagamentoCommand pagamento){
		
		Compra compra = new Compra(nomeDaLoja);
		compra.setValor(valor);
		pagamento.processarCompra(compra);
	}
}

package loja;

public class App {
	
	public static void main(String[] args){
		
		Loja loja = new Loja("Loja");
		
		loja.executarCompra(30.0, new PagamentoBoleto());
		loja.executarCompra(50.0, new PagamentoCartao());
		loja.executarCompra(40.0, new PagamentoDinheiro());
	}

}

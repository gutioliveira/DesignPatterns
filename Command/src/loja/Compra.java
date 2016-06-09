package loja;

public class Compra {
	
	int idNotafiscal;
	String nomeDaLoja;
	double valorTotal;
	
	public Compra(String nomeDaLoja){
		
		this.nomeDaLoja = nomeDaLoja;
	}
	
	public void setValor(double valor){
		
		this.valorTotal = valor;
	}

}

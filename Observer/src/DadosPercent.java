
public class DadosPercent extends DadosObserver {
	
	public DadosPercent(DadosSubject dados){
		super(dados);
	}
	
	public void update(){
		
		double soma = dados.getState().valorA + dados.getState().valorB + dados.getState().valorC;
		
		System.out.println("soma = " + soma);
	}

}

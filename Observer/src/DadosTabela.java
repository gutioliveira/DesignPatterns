
public class DadosTabela extends DadosObserver {
	
	public DadosTabela(DadosSubject dados){
		super(dados);
	}
	
	public void update(){
		
		System.out.println("valor a = "+dados.getState().valorA);
		System.out.println("valor b = "+dados.getState().valorB);
		System.out.println("valor c = "+dados.getState().valorC);
	}

}


public class DadosBarras extends DadosObserver {
	
	public DadosBarras(DadosSubject dados){
		super(dados);
	}

	public void update(){
		
		System.out.println("altura a = "+dados.getState().valorA);
		System.out.println("altura b = "+dados.getState().valorB);
		System.out.println("altura c = "+dados.getState().valorC);
	}	
}

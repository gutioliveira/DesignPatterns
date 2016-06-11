import java.util.ArrayList;

public class DadosSubject {
	
	protected ArrayList<DadosObserver> observers;
	protected Dados dados;
	
	public DadosSubject(){
		observers = new ArrayList<DadosObserver>();
	}
	
	public void attach(DadosObserver dadosObserver){
		observers.add(dadosObserver);
	}
	
	public void detach(int index){
		observers.remove(index);
	}
	
	public void setState(Dados dados){
		
		this.dados = dados;
		notifyObservers();
	}

	private void notifyObservers() {
		for ( DadosObserver observer : observers ){
			observer.update();
		}
	}
	
	public Dados getState(){
		return dados;
	}
	
	

}

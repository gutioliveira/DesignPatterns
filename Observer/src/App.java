
public class App {

	public static void main(String[] args) {
		
		DadosSubject dadosSubject = new DadosSubject();
		
		DadosObserver d1 = new DadosBarras(dadosSubject);
		DadosObserver d2 = new DadosTabela(dadosSubject);
		DadosObserver d3 = new DadosPercent(dadosSubject);
		
		dadosSubject.attach(d1);
		dadosSubject.attach(d2);
		dadosSubject.attach(d3);
		
		Dados valores = new Dados(10.0, 20.0, 30.0);
		
//		dadosSubject.attach(new DadosPercent());
//		dadosSubject.attach(new DadosTabela());
		
		dadosSubject.setState(valores);
		dadosSubject.setState(new Dados(5.0, 5.0, 5.0));
	}

}

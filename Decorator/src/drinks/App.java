package drinks;

public class App {
	
	public static void main(String[] args){
		
		
		Coquetel coquetel = new Cachaca();
		coquetel = new Limao(coquetel);
		System.out.println(coquetel.getDescription());
	}

}

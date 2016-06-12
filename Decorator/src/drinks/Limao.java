package drinks;

public class Limao extends CoquetelDecorator {
	
	public Limao(Coquetel coquetel){
		super(coquetel);
		description = "Limao";
		cost = 2.0;
	}
	
}

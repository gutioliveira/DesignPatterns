package drinks;

public abstract class CoquetelDecorator extends Coquetel {
	
	protected Coquetel coquetel;
	
	public CoquetelDecorator(Coquetel coquetel){
		this.coquetel = coquetel;
	}
	
	public String getDescription(){
		return coquetel.getDescription() + " + " + description;
	}
	
	public double getCost(){
		return coquetel.getCost() + cost;
	}
}

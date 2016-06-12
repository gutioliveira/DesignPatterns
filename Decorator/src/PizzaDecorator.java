
public abstract class PizzaDecorator extends Pizza{
	
	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	public String getDescription(){
		return pizza.getDescription() + " + " + description;
	}
	
	public double getCost(){
		return pizza.getCost() + cost;
	}
}

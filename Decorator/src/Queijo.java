
public class Queijo extends PizzaDecorator{
	
	public Queijo(Pizza pizza){
		super(pizza);
		description = "Queijo";
		cost = 5.0;
	}

}

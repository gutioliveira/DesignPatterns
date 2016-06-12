
public class App {

	public static void main(String[] args) {
		
		Pizza pizza = new PizzaDoce();
		
		pizza = new Queijo(new Calabresa(pizza));
		
		System.out.println(pizza.getDescription() + " = " + pizza.getCost());
		
		Pizza pizzaEspecial = new PizzaEspecial();
		
		pizzaEspecial = new Queijo(new Calabresa(pizzaEspecial));
		
		System.out.println(pizzaEspecial.getDescription() + " = " + pizzaEspecial.getCost());
	}
}

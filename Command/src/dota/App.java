package dota;

public class App {
	
	public static void main(String[] args){
		
		Hero axe = new Hero("Axe", 100.0, 20.0, 25.0);
		Hero mirana = new Hero("Mirana", 100.0, 20.0, 25.0);
		
		axe.attack(mirana, new PhysicalDamage(), 50.0);
		axe.attack(mirana, new MagicalDamage(), 50.0);
		axe.attack(mirana, new PureDamage(), 50.0);
	}

}

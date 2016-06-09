package dota;

public class PhysicalDamage implements Damage {

	@Override
	public double attack(Hero hero, double damage) {
		// TODO Auto-generated method stub
		return damage - damage*hero.getArmor()/100;
	}

}

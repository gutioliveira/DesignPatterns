package dota;

public class MagicalDamage implements Damage {

	@Override
	public double attack(Hero hero, double damage) {
		// TODO Auto-generated method stub
		return damage - hero.getMagicalResistence()*damage/100;
	}

}

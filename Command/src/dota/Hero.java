package dota;

public class Hero {
	
	private String name;
	private Double hp;
	private Double armor;
	private Double magicalResistence;

	public Hero(String name, Double hp, Double armor, Double magicalResistence) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.magicalResistence = magicalResistence;
	}

	public void attack(Hero hero, Damage damage, double attack){
		
		System.out.println(name + " attacks " + hero.getName() + " giving " + damage.attack(hero, attack));
		hero.setHp(hero.getHp() - damage.attack(hero, attack));
		
		if ( hero.getHp() <= 0 )
			System.out.println(hero.getName() + " got killed! ");
		else
			System.out.println(hero.getName() + " now has " + hero.getHp());
	}
	
	public Double getHp() {
		return hp;
	}

	public void setHp(Double hp) {
		this.hp = hp;
	}

	public Double getArmor() {
		return armor;
	}

	public void setArmor(Double armor) {
		this.armor = armor;
	}

	public Double getMagicalResistence() {
		return magicalResistence;
	}

	public void setMagicalResistence(Double magicalResistence) {
		this.magicalResistence = magicalResistence;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

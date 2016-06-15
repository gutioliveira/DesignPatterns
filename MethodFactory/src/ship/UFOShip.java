package ship;

public class UFOShip extends EnemyShip{
	
	public UFOShip(String name){
		this.name = name;
		hp = 100;
		speed = 60;
	}
	
	@Override
	public void atack() {
		// TODO Auto-generated method stub
		System.out.println(name + " has attacked !");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(name + " has moved at " + speed + " km/h");
	}

}

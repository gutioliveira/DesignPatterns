package ship;

public class RocketShip extends EnemyShip{

	public RocketShip(String name) {
		
		this.name = name;
		hp = 60;
		speed = 100;
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

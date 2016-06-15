package ship;

public abstract class EnemyShip {
	
	protected String name;
	protected int hp;
	protected double speed;
	
	public abstract void atack();
	
	public abstract void move();

}

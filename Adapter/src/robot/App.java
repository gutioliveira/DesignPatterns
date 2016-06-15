package robot;

public class App {
	
	public static void main(String[] args) {
		
		EnemyTarget enemy = new EnemyTank();
		
		enemy.driveFowards();
		enemy.assignDriver("Gustavo");
		enemy.fireWeapon();
		
		EnemyTarget enemy2 = new EnemyRobotAdapter();
		enemy2.assignDriver("Fail");
		enemy2.driveFowards();
		enemy2.fireWeapon();
		
	}
}

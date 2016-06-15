package robot;

public class EnemyRobotAdapter extends EnemyTarget {

	private EnemyRobot robot;
	
	public EnemyRobotAdapter(){
		
		robot = new EnemyRobot();
	}
	
	public void fireWeapon(){
		
		robot.smashWithHands();
	}
	
	public void driveFowards(){
		
		robot.walkFowards();
	}
	
	public void assignDriver(String s){
		
		robot.reactToHuman(s);
	}

}

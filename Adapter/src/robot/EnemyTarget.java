package robot;

public abstract class EnemyTarget {

	public void fireWeapon(){
		
		System.out.println("Fires weeapon!");
	}
	
	public void driveFowards(){
			
		System.out.println("is driving");
	}
	
	public void assignDriver(String s){
		
		System.out.println(s + " is driving!");
	}
}

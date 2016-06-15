package ship;

public class ShipFactory {
	
	public EnemyShip makeShip(String type){
		
		if ( type.equals("u") || type.equals("U") )
			return new UFOShip("UFO");
		else if ( type.equals("r") || type.equals("R") )
			return new RocketShip("Rocket");
		
		return null;
	}

}

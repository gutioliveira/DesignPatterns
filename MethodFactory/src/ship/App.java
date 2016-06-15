package ship;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		ShipFactory shipFactory = new ShipFactory();
		
		EnemyShip enemyShip;
	
		do{
			
			System.out.println("Which type of rocket do you want in your team? (U/R)");
			String in = input.nextLine();
			enemyShip = shipFactory.makeShip(in);
			
			if ( enemyShip != null ){
				
				enemyShip.atack();
				enemyShip.move();
			}
		}while ( input.hasNext() );
		
	}

}

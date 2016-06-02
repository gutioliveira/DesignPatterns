
public class Summer implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		
		System.out.println("We are on summer... ");
		
		// condition
		seasonContext.setSeason(new Spring());
	}

}

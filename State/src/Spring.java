
public class Spring implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		
		System.out.println("We are on spring... ");
		
		
		seasonContext.setSeason(new Winter());
	}
}

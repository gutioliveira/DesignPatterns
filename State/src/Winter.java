
public class Winter implements Season{

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		
		System.out.println("We are on winter... ");
		
		seasonContext.setSeason(new Summer());
	}

}

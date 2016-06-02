
public class App {

	public static void main(String[] args) {
		
		SeasonContext seasonContext = new SeasonContext(new Summer());
		
		for ( int i = 0; i < 5; i++ )
			seasonContext.nextSeason();
	}

}

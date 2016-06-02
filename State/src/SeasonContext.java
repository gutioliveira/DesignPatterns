
public class SeasonContext {
	
	public Season season;
	
	public SeasonContext(Season seasonContext){
		this.season = seasonContext;
	}
	
	public void setSeason(Season season){
		this.season = season;
	}
	
	public void nextSeason(){
		this.season.nextSeason(this);
	}

}

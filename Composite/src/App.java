
public class App {
	
	public static void main(String[] args){
		
		SongComponent everySong = new SongGroup("Every other Group", "all styles");
		
		SongComponent metal = new SongGroup("metal", "whatever");
		
		SongComponent pop = new SongGroup("pop", "popular music");
		
		SongComponent heavyMetal = new SongGroup("Heavy metal", "subgenre of metal");
		
		everySong.add(metal);
		everySong.add(pop);
		
		metal.add(heavyMetal);
		
		metal.add(new Song("Master of puppets", "Metallica", 1986));
		
		everySong.displaySongInfo();
	}

}

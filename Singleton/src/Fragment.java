
public class Fragment {
	
	private static Fragment instance;
	
	private Fragment(){}
	
	public static Fragment getInstance(){
		
		if ( instance == null ){
			instance = new Fragment();
			System.out.println("a new fragment on the screen");
		}
		
		return instance;
	}

}

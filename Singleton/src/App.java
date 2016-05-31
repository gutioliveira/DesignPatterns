
public class App {
	
	static Fragment fragment;
	
	public static void main(String[] args) {
		
		for ( int i = 0; i < 10000; i++ )
			onClick();
	}
	
	// calls a fragment on the screen
	public static void onClick(){
		
		fragment = Fragment.getInstance();
	}
}

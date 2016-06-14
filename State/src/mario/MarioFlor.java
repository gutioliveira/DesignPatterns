package mario;

public class MarioFlor extends MarioState{
	
	public MarioState pegarPena(){
		
		System.out.println("Mario voador!");
		
		return new MarioPena();
	}
}

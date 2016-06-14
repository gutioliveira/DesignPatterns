package mario;

public class MarioGrande extends MarioState {
	
	public MarioState pegarPena(){
		
		System.out.println("Mario Voador!");
		
		return new MarioPena();
	}
	
	public MarioState pegarFlor(){
		
		System.out.println("Mario pegando fogo!");
		
		return new MarioFlor();
	}
}

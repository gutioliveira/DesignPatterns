package mario;

public class MarioPequeno extends MarioState {
	
	public MarioState pegarCogumelo(){
		System.out.println("Mario esta grande!");
		
		return new MarioGrande();
	}
	
	public MarioState pegarPena(){
		System.out.println("Mario voador");
		
		return new MarioPena();
	}
	
	public MarioState pegarFlor(){
		
		System.out.println("Mario esta pegando fogo!!");
		
		return new MarioFlor();
	}
}

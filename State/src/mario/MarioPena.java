package mario;

public class MarioPena extends MarioState {
	
	public MarioState pegarFlor(){
		
		System.out.println("Ganhou 1000 pontos");
		
		return new MarioFlor();
	}
}

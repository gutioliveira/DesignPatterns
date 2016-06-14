package mario;

public abstract class MarioState {
	
	public MarioState pegarCogumelo(){
		
		System.out.println("Ganhou 1000 pontos");
		
		return this;
	}
	
	public MarioState pegarPena(){
		
		System.out.println("Ganhou 1000 pontos");
		
		return this;
	}
	
	public MarioState pegarFlor(){
		
		System.out.println("Ganhou 1000 pontos");
		
		return this;
	}
	
	public void pular(){
		System.out.println("Pulou!");
	}
}

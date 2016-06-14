package mario;

public class Mario {
	
	protected MarioState estado;
	
	public Mario(){
		estado = new MarioPequeno();
	}
	
	public void pegarCogumelo(){
		
		estado = estado.pegarCogumelo();
	}
	
	public void pegarPena(){
		estado = estado.pegarPena();
	}
	
	public void pegarFlor(){
		estado = estado.pegarFlor();
	}
	
	public void pular(){
		System.out.println("Pulou!");
	}
}

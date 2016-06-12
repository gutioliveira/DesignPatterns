
public class App {
	
	public static void main(String[] args){
		
		ImagemTarget imagem = new SDLSurfaceAdapter();
		imagem.carregarImagem("background.png");
		imagem.desenharImagem(0, 0, 5, 5);
		
		
		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("background.png");
		imagem.desenharImagem(0, 0, 5, 5);
	}	
}


public class SDLSurfaceAdapter extends SDLSurface implements ImagemTarget {

	@Override
	public void carregarImagem(String imagem) {
		
		carregarSurface(imagem);
	}

	@Override
	public void desenharImagem(int posx, int posy, int largura, int altura) {
		
		desenharSurfarece(largura, altura, posx, posy);
	}

}

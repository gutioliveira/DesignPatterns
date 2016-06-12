
public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {

	@Override
	public void desenharImagem(int posx, int posy, int largura, int altura) {
		// TODO Auto-generated method stub
		desenharImage(posx, posy);
	}

	@Override
	public void carregarImagem(String imagem) {
		// TODO Auto-generated method stub
		openGLcarregarImagem(imagem);
	}

}

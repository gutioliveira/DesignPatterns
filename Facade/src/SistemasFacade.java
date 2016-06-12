
public class SistemasFacade {
	
	private SistemasAudio sistemasAudio;
	private SistemasVideo sistemasVideo;
	
	public SistemasFacade(){
		
		sistemasAudio = new SistemasAudio();
		sistemasAudio.configurarFrequencia();
		sistemasAudio.configurarVolume();
		
		sistemasVideo = new SistemasVideo();
		sistemasVideo.configurarFPS();
		sistemasVideo.configurarVolume();
	}
	
	public void reproduzirVideo(String arquivo){
		
		sistemasVideo.reproduzirVideo(arquivo);
	}

	public void reproduzirAudio(String arquivo){
		
		sistemasAudio.reproduzirAudio(arquivo);
	}
}

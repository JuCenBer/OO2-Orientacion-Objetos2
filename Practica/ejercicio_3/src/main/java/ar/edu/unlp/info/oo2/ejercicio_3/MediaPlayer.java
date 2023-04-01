package ar.edu.unlp.info.oo2.ejercicio_3;

public class MediaPlayer {

	private Media media;
	
	public MediaPlayer(Media media) {
		this.media = media;
	}
	
	public String playMedia() {
		String playing = this.media.play();
		System.out.println(playing);
		return playing;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}
	
}

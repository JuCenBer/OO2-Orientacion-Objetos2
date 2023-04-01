package ar.edu.unlp.info.oo2.ejercicio_3;

public class VideoStreamAdapter extends Media{
	VideoStream adaptee = new VideoStream();
	
	@Override
	public String play() {
		return adaptee.reproduce();
		
	}
}

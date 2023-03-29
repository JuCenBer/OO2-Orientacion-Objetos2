package ar.edu.unlp.info.oo1.ejercicio_1;

public class Retweet extends Tweet{

	private Tweet tweetOriginal;
	
	public Retweet(Tweet tweetOriginal, String mensaje) {
		super(mensaje);
		this.tweetOriginal = tweetOriginal;
	}

	public Tweet getTweetOriginal() {
		return tweetOriginal;
	}

	public void setTweetOriginal(Tweet tweetOriginal) {
		this.tweetOriginal = tweetOriginal;
	}
	
	
}

package ar.edu.unlp.info.oo1.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private List<Tweet> tweets;
	private String screenName;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public void publicarTweet(String texto) {
		if(texto.length() > 0 && texto.length() <= 280) {
			Tweet tweet = new Tweet(texto);
			this.tweets.add(tweet);			
		}
		else {
			System.out.println("El texto debe tener por lo menos un caracter,"
					+ "y menos de 280 caracteres");
		}
	}
	
	public void realizarReTweet(Tweet tweet, String texto) {
		Retweet retweet = new Retweet(tweet, texto);
		this.tweets.add(retweet);
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
}

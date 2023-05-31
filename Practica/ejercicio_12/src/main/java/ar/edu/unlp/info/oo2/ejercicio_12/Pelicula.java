package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<Pelicula>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public List<Pelicula> getPeliculasSimilares() {
		return peliculasSimilares;
	}

	public void setPeliculasSimilares(List<Pelicula> peliculasSimilares) {
		this.peliculasSimilares = peliculasSimilares;
	}
	
	public void agregarSimilitud(Pelicula pelicula) {
		this.peliculasSimilares.add(pelicula);
	}
}

package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> peliculasReproducidas;
	private CriterioDeSugerencia sugerencia;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
		this.sugerencia = new Novedad();
	}
	
	public Decodificador(ArrayList<Pelicula> grilla, ArrayList<Pelicula> peliculasReproducidas, CriterioDeSugerencia sugerencia) {
		this.grilla = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
		this.grilla = grilla;
		this.peliculasReproducidas = peliculasReproducidas;
		this.sugerencia = sugerencia;
	}
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}
	public void setGrilla(List<Pelicula> grilla) {
		this.grilla = grilla;
	}
	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}
	public void setPeliculasReproducidas(List<Pelicula> peliculasReproducidas) {
		this.peliculasReproducidas = peliculasReproducidas;
	}
	
	public void configurarSugerencia(CriterioDeSugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.sugerencia.realizarSugerencia(this);
	}
	
	public void agregarPeliculaAGrilla(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void agregarPeliculaReproducida(Pelicula pelicula) {
		this.peliculasReproducidas.add(pelicula);
	}
}

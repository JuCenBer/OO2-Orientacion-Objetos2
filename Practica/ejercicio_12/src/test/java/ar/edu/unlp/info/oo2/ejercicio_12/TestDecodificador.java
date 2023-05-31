package ar.edu.unlp.info.oo2.ejercicio_12;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Year;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDecodificador {
	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", 7.9, 2007);
		this.capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		this.ironMan = new Pelicula("Iron man", 7.9, 2010);
		this.dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		this.rocky = new Pelicula("Rocky", 8.1, 1976);
		this.rambo = new Pelicula("Rambo", 7.8, 1979);
		
		this.thor.agregarSimilitud(capitanAmerica);
		this.thor.agregarSimilitud(ironMan);
		this.capitanAmerica.agregarSimilitud(ironMan);
		this.rocky.agregarSimilitud(rambo);
		
		this.decodificador = new Decodificador();
		
		this.decodificador.agregarPeliculaAGrilla(thor);
		this.decodificador.agregarPeliculaAGrilla(capitanAmerica);
		this.decodificador.agregarPeliculaAGrilla(ironMan);
		this.decodificador.agregarPeliculaAGrilla(dunkirk);
		this.decodificador.agregarPeliculaAGrilla(rocky);
		this.decodificador.agregarPeliculaAGrilla(rambo);
		this.decodificador.agregarPeliculaReproducida(thor);
		this.decodificador.agregarPeliculaReproducida(rocky);
	}

	@Test
	void testObtenerSugerencias() {
		assertTrue(this.decodificador.sugerirPeliculas().contains(dunkirk));
		assertTrue(this.decodificador.sugerirPeliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPeliculas().contains(ironMan));
		this.decodificador.configurarSugerencia(new Similaridad());
		assertTrue(this.decodificador.sugerirPeliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPeliculas().contains(ironMan));
		assertTrue(this.decodificador.sugerirPeliculas().contains(rambo));
		this.decodificador.configurarSugerencia(new Puntaje());
		assertTrue(this.decodificador.sugerirPeliculas().contains(capitanAmerica));
		assertTrue(this.decodificador.sugerirPeliculas().contains(ironMan));
		assertTrue(this.decodificador.sugerirPeliculas().contains(dunkirk));
	}

}

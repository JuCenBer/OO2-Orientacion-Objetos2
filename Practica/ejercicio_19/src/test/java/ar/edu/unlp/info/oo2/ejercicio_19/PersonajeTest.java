package ar.edu.unlp.info.oo2.ejercicio_19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
	
	private CreadorPersonaje creadorArquero;
	private CreadorPersonaje creadorGuerrero;
	private CreadorPersonaje creadorMago;
	private Personaje mago;
	private Personaje arquero;
	private Personaje guerrero;

	@BeforeEach
	void setUp() throws Exception {
		creadorArquero = new CreadorArquero();
		arquero = creadorArquero.crearPersonaje();
		creadorGuerrero = new CreadorGuerrero();
		guerrero = creadorGuerrero.crearPersonaje();
		creadorMago = new CreadorMago();
		mago = creadorMago.crearPersonaje();
	}

	@Test
	void testCrearPersonaje() {
		assertEquals(100,mago.getVida());
		assertEquals(100,guerrero.getVida());
		assertEquals(100,arquero.getVida());
	}
	
	@Test
	void testAtacarGuerrero() {
		guerrero.atacar(mago);
		assertEquals(92 ,mago.getVida());
		guerrero.atacar(guerrero); 
		assertEquals(97,guerrero.getVida());
	}
	
	@Test
	void testAtacarArquero() {
		arquero.atacar(guerrero); 
		assertEquals(98,guerrero.getVida());
		arquero.atacar(mago); 
		assertEquals(95,mago.getVida());
	}
	
	@Test
	void testAtacarMago() {
		mago.atacar(arquero); 
		assertEquals(98,arquero.getVida());
		mago.atacar(guerrero);
		assertEquals(99,guerrero.getVida());
	}
}

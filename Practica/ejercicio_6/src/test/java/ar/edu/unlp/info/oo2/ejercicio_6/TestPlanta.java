package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPlanta {

	Planta planta9Antiguedad;
	Planta plantaCasadoConHijos9Anios;
	Planta plantaCasadoConHijos;
	Planta plantaCasadoSinHijos;
	
	@BeforeEach
	void setUp() {
		planta9Antiguedad = new Planta(false, 0, 9);
		plantaCasadoConHijos9Anios = new Planta(true, 5, 9);
		plantaCasadoConHijos = new Planta(true, 5, 0);
		plantaCasadoSinHijos = new Planta(true, 0, 0);
	}
	
	@Test
	void testBasico() {
		assertEquals(50000, planta9Antiguedad.getBasico());
		assertEquals(50000, plantaCasadoConHijos.getBasico());
		assertEquals(50000, plantaCasadoSinHijos.getBasico());
		assertEquals(50000, plantaCasadoConHijos9Anios.getBasico());
	}
	
	@Test
	void testAdicional() {
		assertEquals(18000, planta9Antiguedad.getAdicional());
		assertEquals(5000+10000, plantaCasadoConHijos.getAdicional());
		assertEquals(5000, plantaCasadoSinHijos.getAdicional());
		assertEquals(5000+10000+18000, plantaCasadoConHijos9Anios.getAdicional());
	}
}

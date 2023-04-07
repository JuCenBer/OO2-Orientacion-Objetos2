package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTemporario {

	Temporario temporarioSinHoras;
	Temporario temporarioConHoras;
	Temporario temporarioCasadoConHijosConHoras;
	Temporario temporarioCasadoSinHijosSinHoras;
	
	@BeforeEach
	void setUp() {
		temporarioSinHoras = new Temporario(0, false, 0);
		temporarioConHoras = new Temporario(5, false, 0);
		temporarioCasadoConHijosConHoras = new Temporario(5, true, 5);
		temporarioCasadoSinHijosSinHoras = new Temporario(0, true, 0);
	}
	
	@Test
	void testBasico() {
		assertEquals(20000, temporarioSinHoras.getBasico());
		assertEquals(20000+1500, temporarioConHoras.getBasico());
		assertEquals(20000+1500, temporarioCasadoConHijosConHoras.getBasico());
		assertEquals(20000, temporarioCasadoSinHijosSinHoras.getBasico());
	}
	
	@Test
	void testAdicional() {
		assertEquals(0, temporarioSinHoras.getAdicional());
		assertEquals(0, temporarioConHoras.getAdicional());
		assertEquals(5000+10000, temporarioCasadoConHijosConHoras.getAdicional());
		assertEquals(5000, temporarioCasadoSinHijosSinHoras.getAdicional());
	}
}

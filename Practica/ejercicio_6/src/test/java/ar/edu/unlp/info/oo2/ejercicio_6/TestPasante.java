package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPasante {

	Pasante pasanteSinExamenes;
	Pasante pasanteConExamenes;
	
	@BeforeEach
	public void SetUp() {
		pasanteSinExamenes = new Pasante(0, true, 0);
		pasanteConExamenes = new Pasante(5, false, 0);
	}
	
	@Test
	void testSueldoAdicional() {
		assertEquals(0, pasanteSinExamenes.getAdicional());
		assertEquals(10000, pasanteConExamenes.getAdicional());
	}
	
	@Test
	void testSueldoBasico() {
		assertEquals(20000, pasanteSinExamenes.getBasico());
		assertEquals(20000, pasanteConExamenes.getBasico());
	}
	
}

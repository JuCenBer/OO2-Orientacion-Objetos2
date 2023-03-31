package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(this.biblioteca.exportarSocios());
	}
	
	@Test
	public void testExportarSocios() {
		String sociosExportados = this.biblioteca.exportarSocios();
		assertTrue(sociosExportados.contains("Arya Stark"));
		assertTrue(sociosExportados.contains("needle@stark.com"));
		assertTrue(sociosExportados.contains("5234-5"));
		assertTrue(sociosExportados.contains("Tyron Lannister"));
		assertTrue(sociosExportados.contains("tyron@thelannisters.com"));
		assertTrue(sociosExportados.contains("2345-2"));
	}
}

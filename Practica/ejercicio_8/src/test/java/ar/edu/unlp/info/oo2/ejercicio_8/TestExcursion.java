package ar.edu.unlp.info.oo2.ejercicio_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExcursion {

	private Excursion excursion;
	private UsuarioInscripto usuario1;
	private UsuarioInscripto usuario2;
	private UsuarioInscripto usuario3;
	
	@BeforeEach
	public void setUp() {
		excursion = new Excursion("Dos dias en kayak bajando el Parana", 
				LocalDate.parse("2023-01-03"), "Rio de La Plata", 2000, 1, 2);
		usuario1 = new UsuarioInscripto("Laura", "Perez", "laura@gmail.com");
		usuario2 = new UsuarioInscripto("Pedro", "Martinez", "superemail@gmail.com");
		usuario3 = new UsuarioInscripto("Paco", "Pereira", "paquito@gmail.com");
	}
	
	@Test
	public void testInscribirPersonas() {
		assertEquals(0, excursion.getUsuariosInscriptos().size());
		assertEquals(0, excursion.getListaDeEspera().size());
		excursion.inscribir(usuario1);
		assertEquals(1, excursion.getUsuariosInscriptos().size());
		assertEquals(0, excursion.getListaDeEspera().size());
		excursion.inscribir(usuario2);
		assertEquals(2, excursion.getUsuariosInscriptos().size());
		assertEquals(0, excursion.getListaDeEspera().size());
		excursion.inscribir(usuario3);
		assertEquals(2, excursion.getUsuariosInscriptos().size());
		assertEquals(1, excursion.getListaDeEspera().size());
	}
	
	@Test
	public void test() {
		assertEquals("Nombre: Dos dias en kayak bajando el Parana" +
				"\n Costo: 2000.0" +
				"\n Fecha: 2023-01-03" +
				"\n Punto de encuentro: Rio de La Plata" + 
				"\n Cantidad de usuarios faltantes para alcanzar el cupo minimo: 1"
				,excursion.obtenerInformacion());
		
		excursion.inscribir(usuario1);
		assertEquals("Nombre: Dos dias en kayak bajando el Parana" +
				"\n Costo: 2000.0" +
				"\n Fecha: 2023-01-03" +
				"\n Punto de encuentro: Rio de La Plata" +
				"\n Mails de los usuarios inscriptos: [laura@gmail.com]" +
				"\n Cantidad de usuarios faltantes para alcanzar el cupo maximo: 1"
				,excursion.obtenerInformacion());

		excursion.inscribir(usuario2);
		assertEquals("Nombre: Dos dias en kayak bajando el Parana" +
				"\n Costo: 2000.0" +
				"\n Fecha: 2023-01-03" +
				"\n Punto de encuentro: Rio de La Plata"
				,excursion.obtenerInformacion());
	}
}

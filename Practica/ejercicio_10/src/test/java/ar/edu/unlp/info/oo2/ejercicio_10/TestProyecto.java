package ar.edu.unlp.info.oo2.ejercicio_10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProyecto {
	
	private Proyecto proyecto;
	private Proyecto proyectoPrecio0;

	@BeforeEach
	public void setUp() {
		proyecto = new Proyecto("Vacaciones de invierno", LocalDate.parse("2023-07-15"),
				LocalDate.parse("2023-07-30"), "salir con amigos", 3, 100);
		proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 7, 15), LocalDate.of(2023, 7, 25), "salir con amigos",3,0);
		this.proyecto.aprobarEtapa();
	}
	
	@Test
	public void test() {
		assertEquals(0.07, this.proyecto.getMargenGanancia());
		assertEquals(4500, this.proyecto.costoProyecto());
		assertEquals(4815, this.proyecto.precioProyecto());
		
	}
	
	@Test
	public void testAprobarEtapa() {
	    assertTrue(this.proyecto.getState() instanceof Evaluacion);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getState() instanceof Confirmada);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getState() instanceof Confirmada);
		
		Exception exceptionPrecio0 = assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobarEtapa();});
	    assertEquals("No se puede aprobar la construccion de un proyecto cuyo costo es $0.",exceptionPrecio0.getMessage());
	}
	
	@Test
	public void testCostoYPrecioDelProyecto() {
		assertEquals(4500,this.proyecto.costoProyecto());
		assertEquals(4815,this.proyecto.precioProyecto());
		
		assertEquals(0,this.proyectoPrecio0.costoProyecto());
		assertEquals(0,this.proyectoPrecio0.precioProyecto());
	}
	
	@Test
	public void testModificarMargenDeGanancias() {		
		this.proyecto.modificarMargenGanancia(0.10);
		assertEquals(4815,this.proyecto.precioProyecto());
		this.proyecto.modificarMargenGanancia(0.16);
		assertEquals(4815,this.proyecto.precioProyecto());
		this.proyecto.modificarMargenGanancia(0.11);
		assertEquals(4995,this.proyecto.precioProyecto());
		this.proyecto.modificarMargenGanancia(0.15);
		assertEquals(5175,this.proyecto.precioProyecto());
		
		this.proyecto.aprobarEtapa();
		this.proyecto.modificarMargenGanancia(0.10);
		assertEquals(5175,this.proyecto.precioProyecto());
	}
	
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelarProyecto();
		assertEquals("salir con amigos (Cancelado)",this.proyecto.getObjetivo());
		this.proyecto.cancelarProyecto();
		assertEquals("salir con amigos (Cancelado)",this.proyecto.getObjetivo());
	}
}

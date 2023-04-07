package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {

	Empleado empleadoTemporario;
	Empleado empleadoPasante;
	Empleado empleadoPlanta;
	
	@BeforeEach
	void setUp() {
		empleadoTemporario = new Temporario(5,true,9);
		empleadoPasante = new Pasante(5, true, 90);
		empleadoPlanta = new Planta(true, 5, 5);
	}
	
	@Test
	void testDescuento() {
		assertEquals(3945, empleadoTemporario.calcularDescuento(empleadoTemporario.getBasico(), empleadoTemporario.getAdicional()));
		assertEquals(3100, empleadoPasante.calcularDescuento(empleadoPasante.getBasico(), empleadoPasante.getAdicional()));
		assertEquals(7750, empleadoPlanta.calcularDescuento(empleadoPlanta.getBasico(), empleadoPlanta.getAdicional()));
	}
	
	@Test
	void testSueldo() {
		assertEquals(40555, empleadoTemporario.sueldo());
		assertEquals(26900, empleadoPasante.sueldo());
		assertEquals(67250, empleadoPlanta.sueldo());
	}
}

package ar.edu.unlp.info.oo2.ejercicio_14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {

	private FileOO2 archivo;
	
	private Decorator nombre;
	private Decorator extension;
	private Decorator fechaCreacion;
	private Decorator permisos;
	private Decorator tamanio;
	
	@BeforeEach
	public void setUp() {
		archivo = new FileOO2("Minecraft", ".exe", 32000, LocalDate.of(2011,11,11), LocalDate.of(2020,12,20), "usuario-admin");
	}
	
	@Test
	public void testPrettyPrint1() {
		nombre = new NombreDecorator(archivo);
		extension = new ExtensionDecorator(nombre);
		assertEquals("Datos del archivo: Minecraft| .exe|", extension.prettyPrint());
	}
	
	@Test
	public void testPrettyPrint2() {
		nombre = new NombreDecorator(archivo);
		extension = new ExtensionDecorator(nombre);
		fechaCreacion = new FechaCreacionDecorator(extension);
		assertEquals("Datos del archivo: Minecraft| .exe| FC: 2011-11-11|", fechaCreacion.prettyPrint());
	}
	
	@Test
	public void testPrettyPrint3() {
		permisos = new PermisosDecorator(archivo);
		nombre = new NombreDecorator(permisos);
		extension = new ExtensionDecorator(nombre);
		tamanio = new TamanioDecorator(extension);
		assertEquals("Datos del archivo: usuario-admin| Minecraft| .exe| 32000.0|",tamanio.prettyPrint());
	}
	
}

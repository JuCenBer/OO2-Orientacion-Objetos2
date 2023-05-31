package ar.edu.unlp.info.oo2.ejercicio_11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDispositivo {
	
	private Dispositivo dispositivo;
	
	@BeforeEach
	public void setUp() {
		dispositivo = new Dispositivo(new CRC16_Calculator(),new WifiConn(),new Ringer(),new Display());
	}
	
	@Test
	public void testSend() {
		assertEquals("Transmitiendo con WIFI", dispositivo.send("hola"));
		dispositivo.conectarCon(new CuatroGAdapter());
		assertEquals("Transmitiendo con 4G", dispositivo.send("hola"));
	}
	
	@Test
	public void testConectarCon() {
		assertEquals("Se cambio la conexion", dispositivo.conectarCon(new CuatroGAdapter()));
		assertEquals("Se cambio la conexion", dispositivo.conectarCon(new WifiConn()));

	}

	@Test
	public void configurarCRC() {
		assertEquals("Se cambio el CRC", dispositivo.configurarCRC(new CRC32_Calculator()));
		assertEquals("Se cambio el CRC", dispositivo.configurarCRC(new CRC16_Calculator()));

	}

}

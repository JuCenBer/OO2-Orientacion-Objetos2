package ar.edu.unlp.info.oo2.ejercicio_11;

public class CuatroGConnection{

	private String symb="4G";
	
	public String transmit(String data, long crc) {
		return "Transmitiendo con 4G";
	}
	
	public String symb() {
		return symb;
	}
}

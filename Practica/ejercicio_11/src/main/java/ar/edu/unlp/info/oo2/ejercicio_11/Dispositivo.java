package ar.edu.unlp.info.oo2.ejercicio_11;

public class Dispositivo {

	private CRC_Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;

	public Dispositivo(CRC_Calculator crc_Calculator, Connection connection, Ringer ringer, Display display) {
		this.crcCalculator = crc_Calculator;
		this.connection = connection;
		this.ringer = ringer;
		this.display = display;
	}

	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	} 

	public String conectarCon(Connection conexion) {
		this.connection = conexion;
		System.out.println(display.showBanner(conexion.pict()));
		ringer.ring();
		return "Se cambio la conexion";
	}
	
	public String configurarCRC(CRC_Calculator crc) {
		this.crcCalculator = crc;
		return "Se cambio el CRC";
	}
}

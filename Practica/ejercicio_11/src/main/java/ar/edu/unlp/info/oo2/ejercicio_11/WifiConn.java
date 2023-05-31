package ar.edu.unlp.info.oo2.ejercicio_11;

public class WifiConn implements Connection{

	private String pict= "WIFI";
	
	@Override
	public String sendData(String data, long crc) {
		return "Transmitiendo con WIFI";
	}

	@Override
	public String pict() {
		return pict;
	}

}

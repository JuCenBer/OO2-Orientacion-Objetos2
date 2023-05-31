package ar.edu.unlp.info.oo2.ejercicio_11;

public class CuatroGAdapter implements Connection{
	
	private CuatroGConnection adaptee;

	public CuatroGAdapter() {
		this.adaptee = new CuatroGConnection();
	}
	
	@Override
	public String sendData(String data, long crc) {
		return adaptee.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.adaptee.symb();
	}

}

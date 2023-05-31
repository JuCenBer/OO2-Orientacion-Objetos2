package ar.edu.unlp.info.oo2.ejercicio_11;
import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{

	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}
}

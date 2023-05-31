package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class CreadorLlamada {

	public Llamada crearLlamada(Persoona emisor, Persoona remitente,
			String tipoLlamada, int duracion) {
		Llamada nuevaLlamada = null;
		
		if (tipoLlamada.equals("internacional")) {
			nuevaLlamada = new LlamadaInternacional(emisor, remitente, duracion);
		} else if (tipoLlamada.equals("nacional")) {
			nuevaLlamada = new LlamadaNacional(emisor, remitente, duracion);
		}
		return nuevaLlamada;
	}
}

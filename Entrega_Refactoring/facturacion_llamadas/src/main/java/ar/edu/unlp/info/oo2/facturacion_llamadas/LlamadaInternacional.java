package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{
	
	public LlamadaInternacional(Persoona emisor, Persoona remitente, int duracion) {
		super(emisor, remitente, duracion);
	}

	@Override
	public double calcularCosto() {
		return this.getDuracion() *200 + (this.getDuracion()*200*0.21);
	}
	
	
}

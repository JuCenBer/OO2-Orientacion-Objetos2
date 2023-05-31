package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String tipoDeLlamada;
	private Persoona emisor;
	private Persoona remitente;
	private int dur;
	
	public Llamada() {
		
	}
	
	public Llamada(Persoona emisor, Persoona remitente, int dur) {
		this.emisor= emisor;
		this.remitente= remitente;
		this.dur = dur;
	}

	public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}
	public void setEmisor(Persoona emisor) {
		this.emisor = emisor;
	}
	public Persoona getRemitente() {
		return remitente;
	}
	public void setRemitente(Persoona remitente) {
		this.remitente = remitente;
	}

	public int getDuracion() {
		return dur;
	}

	public void setDuracion(int dur) {
		this.dur = dur;
	}
	
	abstract public double calcularCosto();
}

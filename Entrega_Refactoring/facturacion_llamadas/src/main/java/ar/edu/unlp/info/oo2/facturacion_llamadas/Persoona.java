package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombreApellido;
	private String telefono;
	private Persoonal sistema;
	
	public Persoona(String nombreApellido, String telefono) {
		this.nombreApellido = nombreApellido;
		this.telefono = telefono;
	}
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Persoonal getSistema() {
		return this.sistema;
	}
	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	
	abstract public double calcularDescuento(double montoParcial);
	
	public double calcularMontoTotalLlamadas() {
		double montoTotal = 0;
		for (Llamada llamada : this.getLlamadas()) {
			double montoParcial = 0;
			montoParcial += llamada.calcularCosto();
			montoParcial -= this.calcularDescuento(montoParcial);
			montoTotal += montoParcial;			
		}
		return montoTotal;
	}
}

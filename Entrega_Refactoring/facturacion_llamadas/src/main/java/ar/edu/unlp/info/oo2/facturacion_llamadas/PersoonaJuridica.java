package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona{

	private String cuit;
	private static double descuentoPersonaJuridica = 0.15;
	
	public PersoonaJuridica(String nombreApellido, String telefono, String cuit) {
		super(nombreApellido, telefono);
		this.cuit = cuit;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public double calcularDescuento(double montoParcial) {
		return montoParcial *descuentoPersonaJuridica;
	}
	
	public double getDescuento() {
		return descuentoPersonaJuridica;
	}
}

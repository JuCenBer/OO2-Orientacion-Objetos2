package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Empleado {
	
	private boolean estaCasado;
	private int cantHijos;
	private double descuentoBasico;
	private double descuentoAdicional;
	
	public Empleado (boolean estaCasado, int cantHijos) {
		this.estaCasado = estaCasado;
		this.cantHijos = cantHijos;
		this.descuentoBasico = 0.13;
		this.descuentoAdicional = 0.05;
	}

	public double sueldo() {
		double basico = this.getBasico();
		double adicional = this.getAdicional();
		double descuento = this.calcularDescuento(basico,adicional);
		return (basico + adicional - descuento);
	}
	
	public double calcularDescuento(double basico, double adicional) {
		return (basico*this.getDescuentoBasico()) + (adicional * this.getDescuentoAdicional());
	}

	public double getDescuentoBasico() {
		return descuentoBasico;
	}

	public void setDescuentoBasico(double descuentoBasico) {
		this.descuentoBasico = descuentoBasico;
	}

	public double getDescuentoAdicional() {
		return descuentoAdicional;
	}

	public void setDescuentoAdicional(double descuentoAdicional) {
		this.descuentoAdicional = descuentoAdicional;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public abstract double getBasico();
	public abstract double getAdicional();	
}

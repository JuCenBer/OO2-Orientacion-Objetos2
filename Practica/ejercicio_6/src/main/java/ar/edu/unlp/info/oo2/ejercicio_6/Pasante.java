package ar.edu.unlp.info.oo2.ejercicio_6;

public class Pasante extends Empleado{

	private int cantidadExamenesRendidos;
	
	public Pasante(int examenesRendidos, boolean estaCasado, int cantHijos) {
		super(estaCasado, cantHijos);
		this.cantidadExamenesRendidos = examenesRendidos;
	}

	@Override
	public double getBasico() {
		return 20000;
	}

	@Override
	public double getAdicional() {
		return (this.getCantidadExamenesRendidos() * 2000);
	}

	public int getCantidadExamenesRendidos() {
		return cantidadExamenesRendidos;
	}

	public void setCantidadExamenesRendidos(int cantidadExamenesRendidos) {
		this.cantidadExamenesRendidos = cantidadExamenesRendidos;
	}
	
}

package ar.edu.unlp.info.oo2.ejercicio_6;

public class Temporario extends Empleado{
	
	private int horasTrabajo;
	
	public Temporario(int horasTrabajo, boolean estaCasado, int cantHijos) {
		super(estaCasado, cantHijos);
		this.horasTrabajo = horasTrabajo;
	}
	
	public double getBasico() {
		return 20000 + (this.horasTrabajo * 300);
	}
	
	public double getAdicional() {
		double montoAdicional = this.getCantHijos()*2000;
		if(this.isEstaCasado()) montoAdicional += 5000;
		return montoAdicional;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

}

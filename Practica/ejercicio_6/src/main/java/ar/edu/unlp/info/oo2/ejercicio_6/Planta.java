package ar.edu.unlp.info.oo2.ejercicio_6;

public class Planta extends Empleado{

	private int aniosAntiguedad;
	
	public Planta(boolean estaCasado, int cantHijos, int antiguedad) {
		super(estaCasado, cantHijos);
		this.aniosAntiguedad = antiguedad;
	}

	@Override
	public double getBasico() {
		return 50000;
	}

	@Override
	public double getAdicional() {
		double adicional = (this.getCantHijos() * 2000) + (this.getAniosAntiguedad()*2000);
		if (this.isEstaCasado()) adicional += 5000;
		return adicional;
	}

	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
}

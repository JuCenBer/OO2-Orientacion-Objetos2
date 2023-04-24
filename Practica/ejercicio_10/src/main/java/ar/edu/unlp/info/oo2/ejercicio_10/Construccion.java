package ar.edu.unlp.info.oo2.ejercicio_10;

public class Construccion extends Etapa{

	public Construccion(Proyecto proyecto) {
		super(proyecto);
	}

	public void aprobarEtapa() {
		if (this.getProyecto().precioProyecto() > 0)
			this.getProyecto().setState(new Evaluacion(this.getProyecto()));
		else
			throw new RuntimeException("No puede aprobar la construccion de "
					+ "un proyecto cuyo costo es cero.");
	}
	
	public void modificarMargenGanancia(double margen) {
		if ((0.08 < margen) & (margen < 0.1)) {
			this.getProyecto().setMargenGanancia(margen);
		}
	}
}

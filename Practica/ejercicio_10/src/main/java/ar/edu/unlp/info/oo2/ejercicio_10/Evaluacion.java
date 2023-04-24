package ar.edu.unlp.info.oo2.ejercicio_10;

public class Evaluacion extends Etapa{

	public Evaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	public void aprobarEtapa() {
		this.getProyecto().setState(new Confirmada(this.getProyecto()));
	}
	
	public void modificarMargenGanancia(double margen) {
		if ((0.11 < margen) & (margen < 0.15)) {
			this.getProyecto().setMargenGanancia(margen);
		}
	}
}

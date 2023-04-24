package ar.edu.unlp.info.oo2.ejercicio_10;

public abstract class Etapa {

	private Proyecto proyecto;
	
	public Etapa(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public void aprobarEtapa() {
	}
	
	public void modificarMargenGanancia(double margen) {
		
	}
	
}

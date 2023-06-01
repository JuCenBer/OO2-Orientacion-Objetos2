package ar.edu.unlp.info.oo2.ejercicio_14;

import java.time.LocalDate;

public abstract class Decorator implements Component{

	private Component wrappee;
	
	public Decorator(Component wrappee) {
		this.wrappee = wrappee;
	}

	public Component getWrappee() {
		return wrappee;
	}

	public void setWrappee(Component wrappee) {
		this.wrappee = wrappee;
	}
	
	public String getNombre() {
		return this.wrappee.getNombre();
	}
	public String getExtension() {
		return this.wrappee.getExtension();
	}
	public Double getTamanio() {
		return this.wrappee.getTamanio();
	}
	public LocalDate getFechaCreacion() {
		return this.wrappee.getFechaCreacion();
	}
	public LocalDate getFechaModificacion() {
		return this.wrappee.getFechaModificacion();
	}
	public String getPermisos() {
		return this.wrappee.getPermisos();
	}
	
	public String prettyPrint() {
		return this.wrappee.prettyPrint() + " ";
	}
}

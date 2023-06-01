package ar.edu.unlp.info.oo2.ejercicio_14;

public class FechaModificacionDecorator extends Decorator{

	public FechaModificacionDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "FM: " + this.getFechaModificacion().toString() + "| ";
	}

}

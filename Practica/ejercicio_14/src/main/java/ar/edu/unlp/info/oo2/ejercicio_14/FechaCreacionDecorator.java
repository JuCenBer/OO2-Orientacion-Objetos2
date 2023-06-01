package ar.edu.unlp.info.oo2.ejercicio_14;

public class FechaCreacionDecorator extends Decorator{

	public FechaCreacionDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "FC: " + this.getFechaCreacion().toString() + "|";
	}

}

package ar.edu.unlp.info.oo2.ejercicio_14;

public class NombreDecorator extends Decorator{

	public NombreDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre() + "|";
	}

}

package ar.edu.unlp.info.oo2.ejercicio_14;

public class TamanioDecorator extends Decorator{

	public TamanioDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getTamanio().toString() + "|";
	}

}

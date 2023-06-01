package ar.edu.unlp.info.oo2.ejercicio_14;

public class ExtensionDecorator extends Decorator{

	public ExtensionDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension() + "|";
	}

}

package ar.edu.unlp.info.oo2.ejercicio_14;

public class PermisosDecorator extends Decorator{

	public PermisosDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getPermisos() + "|";
	}

}

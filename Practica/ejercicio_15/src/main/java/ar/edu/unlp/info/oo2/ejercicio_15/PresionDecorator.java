package ar.edu.unlp.info.oo2.ejercicio_15;

public class PresionDecorator extends Decorator{

	public PresionDecorator(Informacion wrappee) {
		super(wrappee);
	}
	
	public String displayData() {
		return super.displayData() + "Presión atmosférica: "+this.getPresion();
	}

}

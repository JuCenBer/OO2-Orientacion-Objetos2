package ar.edu.unlp.info.oo2.ejercicio_15;

public class CelsiusDecorator extends Decorator{

	public CelsiusDecorator(Informacion wrappee) {
		super(wrappee);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura C: "+this.getTemperaturaCelsius();
	}

}

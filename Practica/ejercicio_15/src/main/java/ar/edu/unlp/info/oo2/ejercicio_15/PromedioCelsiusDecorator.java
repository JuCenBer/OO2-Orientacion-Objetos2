package ar.edu.unlp.info.oo2.ejercicio_15;

public class PromedioCelsiusDecorator extends Decorator{

	public PromedioCelsiusDecorator(Informacion wrappee) {
		super(wrappee);
	}

	public String displayData() {
		return super.displayData() + "Promedio de temperaturas C: "+ this.getPromedioTempCelsius();
	}
}

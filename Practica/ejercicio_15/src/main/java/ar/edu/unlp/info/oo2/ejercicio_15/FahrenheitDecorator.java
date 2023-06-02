package ar.edu.unlp.info.oo2.ejercicio_15;

public class FahrenheitDecorator extends Decorator{

	public FahrenheitDecorator(Informacion wrappee) {
		super(wrappee);
	}

	public String displayData() {
		return super.displayData() + "Temperatura F: "+this.getTemperaturaFahrenheit();
	}
}

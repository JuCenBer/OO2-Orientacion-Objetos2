package ar.edu.unlp.info.oo2.ejercicio_15;

public class PromedioFahrenheitDecorator extends Decorator{

	public PromedioFahrenheitDecorator(Informacion wrappee) {
		super(wrappee);
	}

	public String displayData() {
		return super.displayData() + "Promedio de temperaturas F:" +this.getPromedioTempFahrenheit();
	}
	
}

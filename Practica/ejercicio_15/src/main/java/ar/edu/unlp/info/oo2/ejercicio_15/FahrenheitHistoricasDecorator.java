package ar.edu.unlp.info.oo2.ejercicio_15;

public class FahrenheitHistoricasDecorator extends Decorator{

	public FahrenheitHistoricasDecorator(Informacion wrappee) {
		super(wrappee);
	}
	
	public String displayData() {
		return super.displayData() +this.getHistoricasFahrenheit();
	}

}

package ar.edu.unlp.info.oo2.ejercicio_15;

public class CeliusHistoricasDecorator extends Decorator{

	public CeliusHistoricasDecorator(Informacion wrappee) {
		super(wrappee);
	}

	public String displayData() {
		return super.displayData() + this.getHistoricasCelsius();
	}
}

package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;

public abstract class Decorator implements Informacion{

	
	private Informacion wrappee;
	
	public Decorator(Informacion wrappee) {
		this.wrappee = wrappee;
	}
	
	@Override
	public String displayData() {
		return this.wrappee.displayData() + " ";
	}

	@Override
	public int getTemperaturaCelsius() {
		return this.wrappee.getTemperaturaCelsius();
	}

	@Override
	public double getTemperaturaFahrenheit() {
		return this.wrappee.getTemperaturaFahrenheit();
	}

	@Override
	public List<Double> getHistoricasFahrenheit() {
		return this.wrappee.getHistoricasFahrenheit();
	}

	@Override
	public List<Double> getHistoricasCelsius() {
		return this.wrappee.getHistoricasCelsius();
	}

	@Override
	public double getPromedioTempFahrenheit() {
		return this.wrappee.getPromedioTempFahrenheit();
	}

	@Override
	public double getPromedioTempCelsius() {
		return this.wrappee.getPromedioTempCelsius();
	}

	@Override
	public double getRadiacionSolar() {
		return this.wrappee.getRadiacionSolar();
	}

	@Override
	public double getPresion() {
		return this.wrappee.getPresion();
	}

	public Informacion getWrappee() {
		return wrappee;
	}

	public void setWrappee(Informacion wrappee) {
		this.wrappee = wrappee;
	}
	
	

}

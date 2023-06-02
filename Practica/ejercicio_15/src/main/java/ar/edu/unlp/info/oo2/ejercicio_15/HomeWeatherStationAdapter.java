package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWeatherStationAdapter implements Informacion{

	private HomeWeatherStation adaptee;
	
	public HomeWeatherStationAdapter(HomeWeatherStation adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public String displayData() {
		return "";
	}

	@Override
	public int getTemperaturaCelsius() {
		return (int) ((adaptee.getTemperaturaFahrenheit()-32)/1.8);
	}

	@Override
	public double getTemperaturaFahrenheit() {
		return adaptee.getTemperaturaFahrenheit();
	}

	@Override
	public List<Double> getHistoricasFahrenheit() {
		return adaptee.getTemperaturasFahrenheit();
	}

	@Override
	public List<Double> getHistoricasCelsius() {
		return adaptee.getTemperaturasFahrenheit().stream()
				.map(temperatura -> ((temperatura-32)/1.8) ).collect(Collectors.toList());
	}

	@Override
	public double getPromedioTempFahrenheit() {
		return adaptee.getTemperaturasFahrenheit().stream()
				.mapToDouble(temperatura -> temperatura).average().orElse(0);
	}

	@Override
	public double getPromedioTempCelsius() {
		return this.getHistoricasCelsius().stream()
				.mapToDouble(temperatura -> temperatura).average().orElse(0);
	}

	@Override
	public double getRadiacionSolar() {
		return adaptee.getRadiacionSolar();
	}

	@Override
	public double getPresion() {
		return adaptee.getPresion();
	}

}

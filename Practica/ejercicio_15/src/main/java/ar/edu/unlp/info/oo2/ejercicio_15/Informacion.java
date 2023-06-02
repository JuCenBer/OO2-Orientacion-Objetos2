package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.List;

public interface Informacion {

	public String displayData();
	public int getTemperaturaCelsius();
	public double getTemperaturaFahrenheit();
	public List<Double> getHistoricasFahrenheit();
	public List<Double> getHistoricasCelsius();
	public double getPromedioTempFahrenheit();
	public double getPromedioTempCelsius();
	public double getRadiacionSolar();
	public double getPresion();
}

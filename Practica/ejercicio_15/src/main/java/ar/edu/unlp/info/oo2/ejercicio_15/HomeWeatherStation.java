package ar.edu.unlp.info.oo2.ejercicio_15;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	
	private double temp;
	private double presion;
	private double radiacion;
	private List<Double> tempsFahrenheit;
	
	public HomeWeatherStation(double temp, double presion, double radiacion) {
		this.temp = temp;
		this.presion = presion;
		this.radiacion = radiacion;
		this.tempsFahrenheit = new ArrayList<Double>();
	}
	
	//retorna la temperatura en grados Fahrenheit
	public double getTemperaturaFahrenheit() {
		return this.temp;
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.presion;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.radiacion;
	}
	
	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturasFahrenheit(){
		return tempsFahrenheit;
	}

	public void setTemperaturasFahrenheit(List<Double> temps) {
		this.tempsFahrenheit = temps;
	}
}

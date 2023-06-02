package ar.edu.unlp.info.oo2.ejercicio_15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeWeatherStationTest {
	private HomeWeatherStation estacion;
	private HomeWeatherStationAdapter adaptador;
	private PresionDecorator presion;
	private RadiacionDecorator radiacion; 
	private CelsiusDecorator celsius;
	private PromedioCelsiusDecorator promedioCelsius;
	private List<Double> temps;

	@BeforeEach
	public void setUp() throws Exception {
		//23.5 + 23.5 + 30
		this.estacion = new HomeWeatherStation(82.4, 1008, 500);
		temps = new ArrayList<Double>();
		temps.add(temps.size(),70.0);
		temps.add(temps.size(),80.0);
		temps.add(temps.size(),81.0);
		this.estacion.setTemperaturasFahrenheit(temps);
		this.adaptador = new HomeWeatherStationAdapter(estacion);
	}

	@Test
	public void testDisplayDataOpcion2() {
		this.presion = new PresionDecorator(adaptador);
		this.radiacion = new RadiacionDecorator(this.presion);
		
		assertEquals(" Presión atmosférica: 1008.0 Radiación solar: 500.0",this.radiacion.displayData());
		
	}

	@Test
	public void testDisplayDataOpcion3() {
		this.radiacion = new RadiacionDecorator(adaptador);
		this.celsius = new CelsiusDecorator(radiacion);
		this.promedioCelsius = new PromedioCelsiusDecorator(celsius);
		
		assertEquals(" Radiación solar: 500.0 Temperatura C: 28 Promedio de temperaturas C: 25.0" ,this.promedioCelsius.displayData());

	}
}

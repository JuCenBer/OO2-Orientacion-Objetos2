package ar.edu.unlp.info.oo2.ejercicio_10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int numeroIntegrantes;
	private double montoPorIntegrante;
	private double margenGanancia;
	private Etapa state;

	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
			String objetivo, int numeroIntegrantes, double montoPorIntegrante) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.numeroIntegrantes = numeroIntegrantes;
		this.montoPorIntegrante = montoPorIntegrante;
		this.margenGanancia = 0.07;
		this.state = new Construccion(this);
	}
	
	public void aprobarEtapa() {
		this.getState().aprobarEtapa();
	}
	
	public void modificarMargenGanancia(double margen) {
		this.getState().modificarMargenGanancia(margen);
	}
	
	public double costoProyecto() {
		return this.numeroIntegrantes * this.montoPorIntegrante * ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	public double precioProyecto() {
		return this.costoProyecto() * (1 + this.getMargenGanancia());
	}
	
	public void cancelarProyecto() {
		if (!(this.objetivo.contains("(Cancelado)"))){
			this.objetivo += " (Cancelado)";			
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}

	public void setNumeroIntegrantes(int numeroIntegrantes) {
		this.numeroIntegrantes = numeroIntegrantes;
	}

	public double getMontoPorIntegrante() {
		return montoPorIntegrante;
	}

	public void setMontoPorIntegrante(double montoPorIntegrante) {
		this.montoPorIntegrante = montoPorIntegrante;
	}

	public double getMargenGanancia() {
		return margenGanancia;
	}

	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia = margenGanancia;
	}

	public Etapa getState() {
		return state;
	}

	public void setState(Etapa state) {
		this.state = state;
	}
	
	
}

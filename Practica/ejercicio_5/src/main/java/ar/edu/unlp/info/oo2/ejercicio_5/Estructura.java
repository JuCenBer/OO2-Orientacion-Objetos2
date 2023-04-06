package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public abstract class Estructura {

	private String nombre;
	private LocalDate fechaCreacion;
	private int tamanoBytes;
	
	public Estructura(String nombre, LocalDate fechaCreacion, int tamano) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamanoBytes = tamano;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getTamanoBytes() {
		return this.tamanoBytes;
	}

	public void setTamanoBytes(int tamanoBytes) {
		this.tamanoBytes = tamanoBytes;
	}
	
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract int tamanoTotalOcupado();
}

package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public class Archivo extends Estructura{
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamano) {
		super(nombre, fechaCreacion, tamano);
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public int tamanoTotalOcupado() {
		return this.getTamanoBytes();
	}
}

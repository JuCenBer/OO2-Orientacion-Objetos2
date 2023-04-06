package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends Estructura{

	private List<Estructura> contenido;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion, 32);
		this.contenido = new ArrayList<Estructura>();
	}
	
	public int tamanoTotalOcupado() {
		return this.getTamanoBytes() + this.contenido.stream().
										mapToInt(estructura -> estructura.tamanoTotalOcupado())
										.sum();
	}
	
	public Archivo archivoMasGrande() {
		return contenido.stream().map(estructura -> estructura.archivoMasGrande())
								.sorted((archivo1, archivo2) -> Integer.compare(archivo2.getTamanoBytes(), archivo1.getTamanoBytes()))
								.findFirst().orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return contenido.stream().map(estructura -> estructura.archivoMasNuevo())
				.sorted((archivo1, archivo2) -> archivo2.getFechaCreacion().compareTo(archivo1.getFechaCreacion()))
				.findFirst().orElse(null);
	}

	public List<Estructura> getContenido() {
		return contenido;
	}

	public void setContenido(List<Estructura> contenido) {
		this.contenido = contenido;
	}
	
	public void agregar(Estructura estructura){
		this.contenido.add(estructura);
	}
	
	public void eliminar(Estructura estructura) {
		this.contenido.remove(estructura);
	}
	
}
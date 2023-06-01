package ar.edu.unlp.info.oo2.ejercicio_14;

import java.time.LocalDate;

public interface Component {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public Double getTamanio();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
}

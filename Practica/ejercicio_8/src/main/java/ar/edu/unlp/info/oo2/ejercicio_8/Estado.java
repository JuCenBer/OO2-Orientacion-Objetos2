package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;

public abstract class Estado {
	
	private Excursion excursion;
	
	
	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public String getNombre() {
		return this.getExcursion().getNombre();
	}
	
	public double getCosto() {
		return this.getExcursion().getCosto();
	}
	
	public LocalDate getFecha() {
		return this.getExcursion().getFechaInicio();
	}
	
	public String getPuntoDeEncuentro() {
		return this.getExcursion().getPuntoDeEncuentro();
	}

	public Excursion getExcursion() {
		return excursion;
	}

	public void setExcursion(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public String obtenerInformacion() {
		String informacion = "Nombre: " + this.getNombre() +
				"\n Costo: " + this.getCosto() +
				"\n Fecha: " + this.getFecha() +
				"\n Punto de encuentro: " + this.getPuntoDeEncuentro();
		return informacion;
	}
	
	public void inscribir(UsuarioInscripto unUsuario) {
		this.getExcursion().getUsuariosInscriptos().add(unUsuario);
	}
	
}

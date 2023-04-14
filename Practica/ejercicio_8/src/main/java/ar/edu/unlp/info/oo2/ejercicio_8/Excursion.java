package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado state;
	private List<UsuarioInscripto> usuariosInscriptos;
	private List<UsuarioInscripto> listaDeEspera;
	
	public Excursion(String nombre, LocalDate fechaInicio, String puntoDeEncuentro,
			double costo, int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.state = new Provisorio(this);
		this.usuariosInscriptos = new ArrayList<UsuarioInscripto>();
		this.listaDeEspera = new ArrayList<UsuarioInscripto>(); 
		//podria haber una sola lista que alterne entre lista de usuarios y lista de espera dependiendo del estado de la excursion?
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
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getCupoMinimo() {
		return cupoMinimo;
	}
	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}
	public void setPuntoDeEncuentro(String puntoDeEncuentro) {
		this.puntoDeEncuentro = puntoDeEncuentro;
	}

	public Estado getState() {
		return state;
	}

	public void setState(Estado state) {
		this.state = state;
	}

	public List<UsuarioInscripto> getUsuariosInscriptos() {
		return usuariosInscriptos;
	}

	public void setUsuariosInscriptos(List<UsuarioInscripto> usuariosInscriptos) {
		this.usuariosInscriptos = usuariosInscriptos;
	}

	public List<UsuarioInscripto> getListaDeEspera() {
		return listaDeEspera;
	}

	public void setListaDeEspera(List<UsuarioInscripto> listaDeEspera) {
		this.listaDeEspera = listaDeEspera;
	}
	
	public void inscribir(UsuarioInscripto usuario) {
		this.getState().inscribir(usuario);
	}
	
	public String obtenerInformacion() {
		return this.getState().obtenerInformacion();
	}
	
	public Boolean seAlcanzoCupoMinimo() {
		if(this.getUsuariosInscriptos().size() >= this.cupoMinimo) return true;
		else return false;
	}
	
	public Boolean seAlcanzoCupoMaximo() {
		if(this.getUsuariosInscriptos().size() >= this.cupoMaximo) return true;
		else return false;
	}
}

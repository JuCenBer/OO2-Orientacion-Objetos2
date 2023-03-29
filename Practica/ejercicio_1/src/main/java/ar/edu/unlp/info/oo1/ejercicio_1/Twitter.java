package ar.edu.unlp.info.oo1.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void crearUsuario(String screenName) {
		if(this.noExisteUsuario(screenName)) {
			Usuario usuario = new Usuario(screenName);
			this.usuarios.add(usuario);	
		}
		else {
			System.out.println("Ya existe un usuario con ese nombre");
		}
	}
	
	public void eliminarUsuario(String screenName) {
		if(this.noExisteUsuario(screenName)) {
			System.out.println("No existe el usuario ingresado");
		}
		else {
			Usuario unUsuario = this.usuarios.stream().filter(usuario -> usuario.getScreenName().equals(screenName))
			.findFirst().orElse(null);
			unUsuario.eliminarTweets();
			usuarios.remove(unUsuario);
		}
	}
	
	public boolean noExisteUsuario(String screenName) {
		return this.usuarios.stream().noneMatch(usuario -> usuario.getScreenName().equals(screenName));
	}
}

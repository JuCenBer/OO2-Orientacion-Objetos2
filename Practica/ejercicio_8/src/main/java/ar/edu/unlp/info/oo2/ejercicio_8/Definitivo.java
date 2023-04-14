package ar.edu.unlp.info.oo2.ejercicio_8;

import java.util.List;
import java.util.stream.Collectors;

public class Definitivo extends Estado{

	public Definitivo(Excursion excursion) {
		super(excursion);
	}
	
	public List<String> getMailsIncriptos(){
		return this.getExcursion().getUsuariosInscriptos().stream()
				.map(usuario -> usuario.getEmail()).collect(Collectors.toList());
	}
	
	public int getCantidadFaltantesParaCupoMaximo() {
		return this.getExcursion().getCupoMaximo() - 
				(int) this.getExcursion().getUsuariosInscriptos().stream().count();
	}

	@Override
	public void inscribir(UsuarioInscripto unUsuario) {
		super.inscribir(unUsuario);
		if(this.getExcursion().seAlcanzoCupoMaximo()) 
			this.getExcursion().setState(new ConCupoMaximo(this.getExcursion()));
		
	}

	@Override
	public String obtenerInformacion() {
		return super.obtenerInformacion()  
				+ "\n Mails de los usuarios inscriptos: "
				+ this.getMailsIncriptos().toString()
				+ "\n Cantidad de usuarios faltantes para alcanzar el cupo maximo: "
				+ this.getCantidadFaltantesParaCupoMaximo();
	}
}

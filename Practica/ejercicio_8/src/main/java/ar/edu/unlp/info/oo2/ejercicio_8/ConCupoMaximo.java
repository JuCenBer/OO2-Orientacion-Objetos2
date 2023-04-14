package ar.edu.unlp.info.oo2.ejercicio_8;

public class ConCupoMaximo extends Estado{

	public ConCupoMaximo(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(UsuarioInscripto unUsuario) {
		this.getExcursion().getListaDeEspera().add(unUsuario);		
	}
}

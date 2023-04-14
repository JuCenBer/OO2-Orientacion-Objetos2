package ar.edu.unlp.info.oo2.ejercicio_8;

public class Provisorio extends Estado{

	public Provisorio(Excursion excursion) {
		super(excursion);
	}
	
	public int getCantidadFaltanteParaCupoMinimo() {
		return this.getExcursion().getCupoMinimo() - 
				(int) this.getExcursion().getUsuariosInscriptos().stream().count();
	}

	@Override
	public void inscribir(UsuarioInscripto unUsuario) {
		super.inscribir(unUsuario);
		if(this.getExcursion().seAlcanzoCupoMinimo()) 
			this.getExcursion().setState(new Definitivo(this.getExcursion()));
		
	}

	@Override
	public String obtenerInformacion() {
		return super.obtenerInformacion() 
				+ "\n Cantidad de usuarios faltantes para alcanzar el cupo minimo: "
				+ this.getCantidadFaltanteParaCupoMinimo();
	}
}

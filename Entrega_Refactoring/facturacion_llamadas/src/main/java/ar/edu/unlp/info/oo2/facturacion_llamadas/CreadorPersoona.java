package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class CreadorPersoona {

	public Persoona crearPersoona(String nombreApellido, String telefono, String tipoPersoona,
			String identificacion) {
		
		Persoona nuevaPersoona = null;
		
		if (tipoPersoona.equals("fisica")) {
			return  nuevaPersoona = new PersoonaFisica(nombreApellido, telefono, identificacion);
		}
		else if (tipoPersoona.equals("juridica")) {
			return nuevaPersoona = new PersoonaJuridica(nombreApellido, telefono, identificacion);
		}
		
		return nuevaPersoona;
	}
}

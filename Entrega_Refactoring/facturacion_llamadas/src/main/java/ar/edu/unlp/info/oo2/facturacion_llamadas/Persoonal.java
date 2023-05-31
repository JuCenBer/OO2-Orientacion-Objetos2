package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> usuarios = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	
	public boolean agregarTelefono(String telefono) {
		return guiaTelefonica.agregarTelefono(telefono);
	}
	
	public Persoona registrarUsuario(String identificacion, String nombreApellido, String tipoPersoona) {

		String telefono = this.guiaTelefonica.tomarUltimoTelefono();

		CreadorPersoona creador = new CreadorPersoona();
		Persoona nuevaPersoona = creador.crearPersoona(nombreApellido, telefono, tipoPersoona, identificacion);
		nuevaPersoona.setSistema(this);
		usuarios.add(nuevaPersoona);
		return nuevaPersoona;
	}
	
	public boolean eliminarUsuario(Persoona persona) {
		boolean borre = false;
		if (this.existeUsuario(persona)) {
			this.usuarios.remove(persona);
			this.guiaTelefonica.getGuia().add(persona.getTelefono());
			borre = true;
		}
		return borre;
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente, String tipoLlamada, int duracion) {
		CreadorLlamada creador = new CreadorLlamada();
		Llamada nuevaLlamada;
		nuevaLlamada = creador.crearLlamada(emisor, remitente, tipoLlamada, duracion);
		llamadas.add(nuevaLlamada);
		return nuevaLlamada;
	}
	
	public Persoona obtenerUsuario(Persoona persoona) {
		return usuarios.stream()
			.filter(usuario -> usuario.getTelefono().equals(persoona.getTelefono()))
			.findFirst().orElse(null);
	}


	public double calcularMontoTotalLlamadas(Persoona persoona) {
		double montoTotal = 0;
		Persoona usuario = obtenerUsuario(persoona);
		if (usuario != null) montoTotal = usuario.calcularMontoTotalLlamadas();
		return montoTotal;
	}

	public int cantidadDeUsuarios() {
		return usuarios.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return usuarios.contains(persona);
	}
	
}

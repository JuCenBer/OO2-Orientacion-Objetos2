package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();
	
	public boolean agregarTelefono(String telefono) {
		if (!guia.contains(telefono)) {
			guia.add(telefono);
			return true;
		}
		return false;
	}

	public SortedSet<String> getGuia() {
		return guia;
	}

	public void setGuia(SortedSet<String> guia) {
		this.guia = guia;
	}
	
	public String tomarUltimoTelefono() {
		String telefono = this.getGuia().last();
		this.getGuia().remove(telefono);
		return telefono;
		
	}
	
}

package ar.edu.unlp.info.oo2.ejercicio_14;

import java.util.ArrayList;
import java.util.List;

public class FileManager {

	private List<Component> componentes;
	
	public FileManager() {
		this.componentes = new ArrayList<Component>();
	}
	
	public void mostrarArchivos() {
		componentes.stream().forEach(componente -> System.out.println(componente.prettyPrint()));
	}
	
	public void agregarComponente(Component componente) {
		this.componentes.add(componente);
	}
}

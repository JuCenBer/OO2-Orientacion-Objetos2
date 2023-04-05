package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta implements Topografia{

	private List<Topografia> composicion;
	
	public TopografiaMixta(Topografia comp1, Topografia comp2,
							Topografia comp3, Topografia comp4) {
		composicion = new ArrayList<Topografia>();
		composicion.add(comp1);
		composicion.add(comp2);
		composicion.add(comp3);
		composicion.add(comp4);
	}

	public List<Topografia> getComposicion() {
		return composicion;
	}

	public double getProporcionAgua() {
		return (composicion.stream()
				.mapToDouble(componente -> componente.getProporcionAgua())
				.sum())/this.composicion.size();
	}
	
	public double getProporcionTierra() {
		return (composicion.stream().
				mapToDouble(componente -> componente.getProporcionTierra())
				.sum())/this.composicion.size();

	}

	public void setComposicion(List<Topografia> composicion) {
		this.composicion = composicion;
	}
	
	public void agregarTopografia (Topografia topografia) {
		this.composicion.add(topografia);
	}
	
	public void removerTopografia(Topografia topografia) {
		this.composicion.remove(topografia);
	}
	
	public boolean esIgual(Topografia topografia) {
		return this.composicion.equals(topografia.getTopografia()) 
				&& this.getProporcionAgua() == topografia.getProporcionAgua() 
				&& this.getProporcionTierra() == topografia.getProporcionTierra();
	}
	
	@Override
	public List<Topografia> getTopografia() {
		return this.composicion;
	}
}

package ar.edu.unlp.info.oo2.ejercicio_4;

public class Tierra implements Topografia{

	private double proporcionAgua;
	private double proporcionTierra;
	
	public Tierra() {
		proporcionAgua = 0;
		proporcionTierra = 1;
	}

	public double getProporcionAgua() {
		return proporcionAgua;
	}

	public void setProporcionAgua(double proporcionAgua) {
		this.proporcionAgua = proporcionAgua;
	}

	public double getProporcionTierra() {
		return proporcionTierra;
	}

	public void setProporcionTierra(double proporcionTierra) {
		this.proporcionTierra = proporcionTierra;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		if (topografia.getProporcionTierra() == this.getProporcionTierra()) return true;
		else return false;
	}

	@Override
	public Object getTopografia() {
		return this;
	}
	
	
}

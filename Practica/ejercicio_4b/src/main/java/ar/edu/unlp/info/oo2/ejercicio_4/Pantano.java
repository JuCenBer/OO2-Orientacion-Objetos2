package ar.edu.unlp.info.oo2.ejercicio_4;

public class Pantano implements Topografia{

	private double proporcionAgua = 0.7;
	private double proporcionTierra = 0.3;
	
	@Override
	public double getProporcionAgua() {
		return proporcionAgua;
	}

	@Override
	public double getProporcionTierra() {
		return proporcionTierra;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		if(topografia.getProporcionAgua() == this.getProporcionAgua() 
				&& topografia.getProporcionTierra() == this.getProporcionTierra()) return true;
		else return false;
	}

	@Override
	public Object getTopografia() {
		return this;
	}

}

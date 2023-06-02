package ar.edu.unlp.info.oo2.ejercicio_18;

public class SubteWay {
	
	private Builder builder;
	
	public SubteWay(Builder builder){
		this.builder = builder;
	}

	public Sandwich hacerSandwichSinAdicional() {
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		return this.builder.obtenerSandwich();
	}
	
	public Sandwich hacerSandwichConAderezo() {
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
		return this.builder.obtenerSandwich();
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
}
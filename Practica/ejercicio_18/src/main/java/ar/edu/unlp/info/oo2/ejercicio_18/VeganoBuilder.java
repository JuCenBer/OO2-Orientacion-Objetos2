package ar.edu.unlp.info.oo2.ejercicio_18;

public class VeganoBuilder implements Builder{

	private Sandwich sandwich;
	
	public VeganoBuilder() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void reset() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void agregarPan() {
		this.sandwich.setPan(100);
		
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(20);
		
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(500);
		
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(0);
	}

	@Override
	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}

}

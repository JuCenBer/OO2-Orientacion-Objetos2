package ar.edu.unlp.info.oo2.ejercicio_18;

public class SinTACCBuilder implements Builder{

	private Sandwich sandwich;
	
	public SinTACCBuilder() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void reset() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void agregarPan() {
		this.sandwich.setPan(150);
		
	}

	@Override
	public void agregarAderezo() {
		this.sandwich.setAderezo(18);
		
	}

	@Override
	public void agregarPrincipal() {
		this.sandwich.setPrincipal(250);
		
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(200);
	}

	@Override
	public Sandwich obtenerSandwich() {
		return this.sandwich;
	}

}

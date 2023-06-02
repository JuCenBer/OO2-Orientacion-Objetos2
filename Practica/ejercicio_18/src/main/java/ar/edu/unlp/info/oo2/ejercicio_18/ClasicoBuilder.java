package ar.edu.unlp.info.oo2.ejercicio_18;

public class ClasicoBuilder implements Builder{

	private Sandwich sandwich;
	
	public ClasicoBuilder() {
		this.sandwich = new Sandwich();
	}
	
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
		this.sandwich.setPrincipal(300);
		
	}

	@Override
	public void agregarAdicional() {
		this.sandwich.setAdicional(80);
		
	}

	@Override
	public Sandwich obtenerSandwich() {
		return sandwich;
	}

}

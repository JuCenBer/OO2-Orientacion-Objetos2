package ar.edu.unlp.info.oo2.ejercicio_18;

public interface Builder {

	public void reset();
	public void agregarPan();
	public void agregarAderezo();
	public void agregarPrincipal();
	public void agregarAdicional();
	public Sandwich obtenerSandwich();
}

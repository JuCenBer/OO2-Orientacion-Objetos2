package ar.edu.unlp.info.oo2.ejercicio_18;

public class Sandwich {
	
	private int pan;
	private int aderezo;
	private int principal;
	private int adicional;
	
	public int getPan() {
		return pan;
	}
	public void setPan(int pan) {
		this.pan = pan;
	}
	public int getAderezo() {
		return aderezo;
	}
	public void setAderezo(int aderezo) {
		this.aderezo = aderezo;
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getAdicional() {
		return adicional;
	}
	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	public int calcularMonto() {
		return this.pan + this.aderezo 
				+ this.principal + this.adicional;
	}
}

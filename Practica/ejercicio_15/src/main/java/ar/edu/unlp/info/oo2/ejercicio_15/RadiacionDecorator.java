package ar.edu.unlp.info.oo2.ejercicio_15;

public class RadiacionDecorator extends Decorator{

	public RadiacionDecorator(Informacion wrappee) {
		super(wrappee);
	}
	
	public String displayData() {
		return super.displayData() + "Radiación solar: "+this.getRadiacionSolar();
	}

}

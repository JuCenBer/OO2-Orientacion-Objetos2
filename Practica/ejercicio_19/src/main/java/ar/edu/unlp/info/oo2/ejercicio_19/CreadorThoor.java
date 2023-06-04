package ar.edu.unlp.info.oo2.ejercicio_19;

import java.util.ArrayList;
import java.util.List;

public class CreadorThoor extends CreadorPersonaje{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add(new LanzarRayos());
		return new Thoor(habilidades, new ArmaMartillo(), new ArmaduraDeHierro());
	}
}

package ar.edu.unlp.info.oo2.ejercicio_19;

import java.util.ArrayList;
import java.util.List;

public class CreadorGuerrero extends CreadorPersonaje{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add(new CombateMelee());
		return new Guerrero(habilidades, new ArmaEspada(), new ArmaduraDeAcero());
	}

}

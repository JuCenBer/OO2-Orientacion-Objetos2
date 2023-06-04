package ar.edu.unlp.info.oo2.ejercicio_19;

import java.util.ArrayList;
import java.util.List;

public class CreadorMago extends CreadorPersonaje{

	@Override
	public Personaje crearPersonaje() {
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add(new Magia());
		habilidades.add(new CombateDistancia());
		return new Mago(habilidades, new ArmaBaston(), new ArmaduraDeCuero());
	}

}

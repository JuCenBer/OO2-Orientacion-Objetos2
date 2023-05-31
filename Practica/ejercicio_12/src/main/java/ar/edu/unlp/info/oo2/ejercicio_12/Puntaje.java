package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends CriterioDeSugerencia{

	@Override
	public List<Pelicula> seleccionarPeliculas(Decodificador decodificador) {
		return decodificador.getGrilla().stream()
				.sorted((o2,o1) -> Double.compare(o1.getPuntaje(),o2.getPuntaje()))
				.collect(Collectors.toList());
	}

}

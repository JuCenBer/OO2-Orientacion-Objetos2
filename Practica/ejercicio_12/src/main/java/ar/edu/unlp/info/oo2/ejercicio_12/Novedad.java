package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends CriterioDeSugerencia{

	@Override
	public List<Pelicula> seleccionarPeliculas(Decodificador decodificador) {
		List<Pelicula> peliculasNuevas = decodificador.getGrilla().stream()
		.sorted((o2, o1) -> Integer.compare(o1.getAnioEstreno(), o2.getAnioEstreno()))
		.collect(Collectors.toList());
		return peliculasNuevas;
	}
}

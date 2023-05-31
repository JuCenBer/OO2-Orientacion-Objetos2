package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends CriterioDeSugerencia{

	@Override
	public List<Pelicula> seleccionarPeliculas(Decodificador decodificador) {
		return decodificador.getPeliculasReproducidas().stream()
				.map(pelicula -> pelicula.getPeliculasSimilares())
				.flatMap(lista -> lista.stream()).distinct()
				.collect(Collectors.toList());
	}

}

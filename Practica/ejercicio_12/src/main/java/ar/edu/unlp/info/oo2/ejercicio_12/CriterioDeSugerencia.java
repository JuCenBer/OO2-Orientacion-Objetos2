package ar.edu.unlp.info.oo2.ejercicio_12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CriterioDeSugerencia {

	public List<Pelicula> realizarSugerencia(Decodificador decodificador){
		List<Pelicula> sugerencias = seleccionarPeliculas(decodificador);
		List<Pelicula> peliculasVistas = decodificador.getPeliculasReproducidas();
		return sugerencias.stream().filter(pelicula -> !(peliculasVistas.contains(pelicula)))
				.limit(3).collect(Collectors.toList());

	}
	
	public abstract List<Pelicula> seleccionarPeliculas(Decodificador decodificador);
}

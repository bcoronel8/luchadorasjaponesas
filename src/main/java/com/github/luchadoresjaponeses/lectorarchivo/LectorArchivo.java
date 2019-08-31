package com.github.luchadoresjaponeses.lectorarchivo;

import com.github.luchadoresjaponeses.Luchador;

import java.util.List;

public interface LectorArchivo {
	List<Luchador> leerParticipantes(String ubicacionArchivo);
}

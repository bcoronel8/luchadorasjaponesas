package com.github.luchadoresjaponeses.lectorarchivo;

import com.github.luchadoresjaponeses.Luchador;
import com.github.luchadoresjaponeses.Torneo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public interface LectorArchivo {
	
	
	void leerParticipantes(String ubicacionArchivo, Torneo torneoDeSumo) throws FileNotFoundException;
	
	void escribirDominantes(String ubicacionArchivo, ArrayList<Integer> cantidadDominantes) throws FileNotFoundException;
	
	
}

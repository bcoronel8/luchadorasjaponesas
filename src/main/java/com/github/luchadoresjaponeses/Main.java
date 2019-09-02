package com.github.luchadoresjaponeses;

import java.io.FileNotFoundException;

import com.github.luchadoresjaponeses.lectorarchivo.ProcesadorParticipantesArchivoTexto;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		Torneo torneoDeSumos = new Torneo();
		ProcesadorParticipantesArchivoTexto procesadorArchivoIn= new ProcesadorParticipantesArchivoTexto();
		procesadorArchivoIn.leerParticipantes("sumo.in", torneoDeSumos);
		torneoDeSumos.resultadosDominantes();
		procesadorArchivoIn.escribirDominantes("sumo.out", torneoDeSumos.getCantidadDominantes());
		
		
	}
}

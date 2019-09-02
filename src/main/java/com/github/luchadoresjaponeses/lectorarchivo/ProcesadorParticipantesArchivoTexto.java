package com.github.luchadoresjaponeses.lectorarchivo;

import com.github.luchadoresjaponeses.Luchador;
import com.github.luchadoresjaponeses.Torneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProcesadorParticipantesArchivoTexto implements LectorArchivo {

	@Override
	public void leerParticipantes(String ubicacionArchivo, Torneo torneoDeSumo) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File(ubicacionArchivo));
		scanner.useLocale(Locale.ENGLISH);
		int cantidadParticipantes = scanner.nextInt();
		
		
		for(int i=0; i< cantidadParticipantes; i++) {
			
			Luchador luchador= new Luchador();
			luchador.setPeso(scanner.nextDouble());
			luchador.setAltura(scanner.nextDouble());
			torneoDeSumo.getParticipantes().add(i,luchador);
			
		}
		
		scanner.close();
		
	}

	@Override
	public void escribirDominantes(String ubicacionArchivo, ArrayList<Integer> cantidadDominantes) throws FileNotFoundException {
		
		PrintWriter salida = new PrintWriter(ubicacionArchivo);
		
		for(int i=0; i<cantidadDominantes.size(); i++) 
			salida.println(cantidadDominantes.get(i));

		
		salida.close();
	}
}

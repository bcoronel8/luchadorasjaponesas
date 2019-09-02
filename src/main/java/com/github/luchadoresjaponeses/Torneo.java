package com.github.luchadoresjaponeses;

import com.github.luchadoresjaponeses.lectorarchivo.LectorArchivo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	
	private ArrayList<Luchador> participantes;
	private ArrayList<Integer> cantidadDominantes;
	
	
	public Torneo() {
		
		this.participantes= new ArrayList<Luchador>();
		this.cantidadDominantes= new ArrayList<Integer>();
		
	}
	
	
	public void resultadosDominantes() {
		
		Luchador luchadorAEvaluar= new Luchador();
		int cantidadQueDomina =0;
		for(int i=0; i< this.participantes.size(); i++) {
			luchadorAEvaluar= this.participantes.get(i);
			for(int j=0; j< this.participantes.size(); j++) {
				if(luchadorAEvaluar.domina(this.participantes.get(j)))
					cantidadQueDomina++;
			}
			this.cantidadDominantes.add(i, cantidadQueDomina);
			cantidadQueDomina =0;
		}
		
	}
	
	
	public ArrayList<Luchador> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Luchador> participantes) {
		this.participantes = participantes;
	}


	public ArrayList<Integer> getCantidadDominantes() {
		return cantidadDominantes;
	}


	public void setCantidadDominantes(ArrayList<Integer> cantidadDominantes) {
		this.cantidadDominantes = cantidadDominantes;
	}
	
	
	

}

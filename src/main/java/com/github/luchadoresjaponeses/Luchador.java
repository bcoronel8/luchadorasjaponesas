package com.github.luchadoresjaponeses;

import java.util.Objects;

public class Luchador {
	private double peso;
	private double altura;

	public Luchador(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public Luchador() {
		this.peso=0;
		this.altura=0;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Luchador luchador = (Luchador) o;
		return Double.compare(luchador.peso, peso) == 0 &&
				Double.compare(luchador.altura, altura) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(peso, altura);
	}

	public boolean domina(Luchador contrincante) {
		if(this.altura > contrincante.altura && this.peso> contrincante.peso || this.peso == contrincante.peso && this.altura> contrincante.altura ||
				this.altura == contrincante.altura && this.peso> contrincante.peso)
				return true;
		return false;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}

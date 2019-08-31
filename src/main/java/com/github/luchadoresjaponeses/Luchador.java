package com.github.luchadoresjaponeses;

import java.util.Objects;

public class Luchador {
	private double peso;
	private double altura;

	public Luchador(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
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
}

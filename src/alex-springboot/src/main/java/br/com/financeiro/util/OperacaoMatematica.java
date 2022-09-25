package br.com.financeiro.util;

public class OperacaoMatematica {
	
	public Double somar(Double numero1, Double numero2) {
		return numero1 + numero2;
	}
	
	public Double subtrair(Double numero1, Double numero2) {
		return numero1 - numero2;
	}
	
	public Double multiplicar(Double numero1, Double numero2) {
		return numero1 * numero2;
	}
	
	public Double dividir(Double numero1, Double numero2) {
		return numero1 / numero2;
	}
	
	public Double media(Double numero1, Double numero2) {
		return (numero1 + numero2) / 2;
	}
	
	public Double raizQuadrada(Double numero) {
		return Math.sqrt(numero);
	}

}

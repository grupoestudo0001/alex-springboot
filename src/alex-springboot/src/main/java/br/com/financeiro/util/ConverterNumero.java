package br.com.financeiro.util;

import br.com.financeiro.exceptions.OperacaoMatematicaNaoSuportadaException;

public class ConverterNumero {
	
	public static Double converteToDouble(String strNumero) {
		if (strNumero == null) return 0D;
		
		String numero = strNumero.replaceAll(",", ".");
		
		if (!isNumerico(numero)) {
			throw new OperacaoMatematicaNaoSuportadaException("Por favor inserir um número.");
		}
				
		if (isNumerico(numero)) return Double.parseDouble(numero);
		
		return 0D;
	}
	
	private static boolean isNumerico(String strNumero) {		
		return strNumero.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	

}

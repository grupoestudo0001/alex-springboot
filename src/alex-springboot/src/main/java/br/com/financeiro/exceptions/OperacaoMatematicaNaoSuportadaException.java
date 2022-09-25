package br.com.financeiro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OperacaoMatematicaNaoSuportadaException extends RuntimeException {

	public OperacaoMatematicaNaoSuportadaException(String ex) {
		super(ex);
	}

	private static final long serialVersionUID = 1L;
	
}

package br.com.financeiro.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String mensagem;
	private String Detalhe;
	
	public ExceptionResponse(Date timestamp, String mensagem, String detalhe) {
		this.timestamp = timestamp;
		this.mensagem = mensagem;
		Detalhe = detalhe;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDetalhe() {
		return Detalhe;
	}

	public void setDetalhe(String detalhe) {
		Detalhe = detalhe;
	}
	
	
	
	

}

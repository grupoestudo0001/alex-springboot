package br.com.financeiro.model;

import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String primeiroNome;
	private String ultimoNome;
	private String endereco;
	private String sexo;
	
	public Pessoa() {}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getPrimeiroNome() {
		return primeiroNome;
	}

	public final void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public final String getUltimoNome() {
		return ultimoNome;
	}

	public final void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public final String getEndereco() {
		return endereco;
	}

	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public final String getSexo() {
		return sexo;
	}

	public final void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(endereco, id, primeiroNome, sexo, ultimoNome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(primeiroNome, other.primeiroNome) && Objects.equals(sexo, other.sexo)
				&& Objects.equals(ultimoNome, other.ultimoNome);
	}
	
	
}

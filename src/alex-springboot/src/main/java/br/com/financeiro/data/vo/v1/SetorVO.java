package br.com.financeiro.data.vo.v1;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SetorVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String descricao;
	
	private Date dataDeCriacao;
	
	private Boolean inativo;

	public SetorVO() {}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getDescricao() {
		return descricao;
	}

	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public final Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public final void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public final Boolean getInativo() {
		return inativo;
	}

	public final void setInativo(Boolean inativo) {
		this.inativo = inativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDeCriacao, descricao, id, inativo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetorVO other = (SetorVO) obj;
		return Objects.equals(dataDeCriacao, other.dataDeCriacao) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(id, other.id) && Objects.equals(inativo, other.inativo);
	}

	
}

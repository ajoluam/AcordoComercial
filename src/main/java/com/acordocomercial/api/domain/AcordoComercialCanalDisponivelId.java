package com.acordocomercial.api.domain;

import java.io.Serializable;

public class AcordoComercialCanalDisponivelId implements Serializable {
	private static final long serialVersionUID = 1L;

	private AcordoComercialParceiro acordoComercialparceiro;
	private Integer CodCanalDistribuicao;
	private Integer codSituacao;

	public AcordoComercialCanalDisponivelId() {

	}

	public AcordoComercialCanalDisponivelId(AcordoComercialParceiro acordoComercialparceiro,
			Integer codCanalDistribuicao, Integer codSituacao) {
		super();
		this.acordoComercialparceiro = acordoComercialparceiro;
		CodCanalDistribuicao = codCanalDistribuicao;
		this.codSituacao = codSituacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodCanalDistribuicao == null) ? 0 : CodCanalDistribuicao.hashCode());
		result = prime * result + ((acordoComercialparceiro == null) ? 0 : acordoComercialparceiro.hashCode());
		result = prime * result + ((codSituacao == null) ? 0 : codSituacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcordoComercialCanalDisponivelId other = (AcordoComercialCanalDisponivelId) obj;
		if (CodCanalDistribuicao == null) {
			if (other.CodCanalDistribuicao != null)
				return false;
		} else if (!CodCanalDistribuicao.equals(other.CodCanalDistribuicao))
			return false;
		if (acordoComercialparceiro == null) {
			if (other.acordoComercialparceiro != null)
				return false;
		} else if (!acordoComercialparceiro.equals(other.acordoComercialparceiro))
			return false;
		if (codSituacao == null) {
			if (other.codSituacao != null)
				return false;
		} else if (!codSituacao.equals(other.codSituacao))
			return false;
		return true;
	}

}

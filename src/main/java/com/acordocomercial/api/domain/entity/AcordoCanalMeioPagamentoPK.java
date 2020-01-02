package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the acordocanalmeiopagamento database table.
 * 
 */
@Embeddable
public class AcordoCanalMeioPagamentoPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "NUM_ACOR_COML_PACE", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer numeroAcordoComercialParceiro;

	@Column(name = "NUM_VERS_ACOR_COML", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer numeroVersaoAcordoComercial;

	@Column(name = "COD_CANA_DTBC", insertable = false, updatable = false, unique = true, nullable = false, length = 2)
	private String codigoCanalDistribuicao;

	@Column(name = "COD_TIPO_MEIO_PGTO", unique = true, nullable = false)
	private Integer codigoTipoMeioPagamento;

	public AcordoCanalMeioPagamentoPK() {
	}

	public Integer getNumeroAcordoComercialParceiro() {
		return this.numeroAcordoComercialParceiro;
	}

	public void setNumeroAcordoComercialParceiro(Integer numeroAcordoComercialParceiro) {
		this.numeroAcordoComercialParceiro = numeroAcordoComercialParceiro;
	}

	public Integer getNumeroVersaoAcordoComercial() {
		return this.numeroVersaoAcordoComercial;
	}

	public void setNumeroVersaoAcordoComercial(Integer numeroVersaoAcordoComercial) {
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
	}

	public String getCodigoCanalDistribuicao() {
		return this.codigoCanalDistribuicao;
	}

	public void setCodigoCanalDistribuicao(String codigoCanalDistribuicao) {
		this.codigoCanalDistribuicao = codigoCanalDistribuicao;
	}

	public Integer getCodigoTipoMeioPagamento() {
		return this.codigoTipoMeioPagamento;
	}

	public void setCodigoTipoMeioPagamento(Integer codigoTipoMeioPagamento) {
		this.codigoTipoMeioPagamento = codigoTipoMeioPagamento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcordoCanalMeioPagamentoPK)) {
			return false;
		}
		AcordoCanalMeioPagamentoPK castOther = (AcordoCanalMeioPagamentoPK) other;
		return (this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
				&& (this.numeroVersaoAcordoComercial == castOther.numeroVersaoAcordoComercial)
				&& this.codigoCanalDistribuicao.equals(castOther.codigoCanalDistribuicao)
				&& (this.codigoTipoMeioPagamento == castOther.codigoTipoMeioPagamento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numeroAcordoComercialParceiro;
		hash = hash * prime + this.numeroVersaoAcordoComercial;
		hash = hash * prime + this.codigoCanalDistribuicao.hashCode();
		hash = hash * prime + this.codigoTipoMeioPagamento;

		return hash;
	}
}
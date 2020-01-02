package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the contarepasse database table.
 * 
 */
@Embeddable
public class ContaRepassePK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "NUM_ACOR_COML_PACE", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer numeroAcordoComercialParceiro;

	@Column(name = "NUM_VERS_ACOR_COML", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer numeroVersaoAcordoComercial;

	@Column(name = "COD_PACE_COML", unique = true, nullable = false)
	private Integer codigoParceiroComercial;

	@Column(name = "NUM_SEQE_CONT_PACE_COML", unique = true, nullable = false)
	private Integer numeroSequencialContaParceiroComercial;

	public ContaRepassePK() {
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

	public Integer getCodigoParceiroComercial() {
		return this.codigoParceiroComercial;
	}

	public void setCodigoParceiroComercial(Integer codigoParceiroComercial) {
		this.codigoParceiroComercial = codigoParceiroComercial;
	}

	public Integer getNumeroSequencialContaParceiroComercial() {
		return this.numeroSequencialContaParceiroComercial;
	}

	public void setNumeroSequencialContaParceiroComercial(Integer numeroSequencialContaParceiroComercial) {
		this.numeroSequencialContaParceiroComercial = numeroSequencialContaParceiroComercial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContaRepassePK)) {
			return false;
		}
		ContaRepassePK castOther = (ContaRepassePK) other;
		return (this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
				&& (this.numeroVersaoAcordoComercial == castOther.numeroVersaoAcordoComercial)
				&& (this.codigoParceiroComercial == castOther.codigoParceiroComercial)
				&& (this.numeroSequencialContaParceiroComercial == castOther.numeroSequencialContaParceiroComercial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numeroAcordoComercialParceiro;
		hash = hash * prime + this.numeroVersaoAcordoComercial;
		hash = hash * prime + this.codigoParceiroComercial;
		hash = hash * prime + this.numeroSequencialContaParceiroComercial;

		return hash;
	}
}
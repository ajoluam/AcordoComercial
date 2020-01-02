package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the acordocomercialparceiro database table.
 * 
 */
@Embeddable
public class AcordoComercialParceiroPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "NUM_ACOR_COML_PACE", unique = true, nullable = false)
	private Integer numeroAcordoComercialParceiro;

	@Column(name = "NUM_VERS_ACOR_COML", unique = true, nullable = false)
	private Integer numeroVersaoAcordoComercial;

	public AcordoComercialParceiroPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcordoComercialParceiroPK)) {
			return false;
		}
		AcordoComercialParceiroPK castOther = (AcordoComercialParceiroPK) other;
		return (this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
				&& (this.numeroVersaoAcordoComercial == castOther.numeroVersaoAcordoComercial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numeroAcordoComercialParceiro;
		hash = hash * prime + this.numeroVersaoAcordoComercial;

		return hash;
	}
}
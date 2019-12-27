package com.acordocomercial.api.domain;

import java.io.Serializable;


public class AcordoComercialParceiroId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer numAcordoComercialParceiro;

	private Integer numVersaoAcordoComercial;

	public AcordoComercialParceiroId() {

	}

	public AcordoComercialParceiroId(Integer numAcordoComercialParceiro, Integer numVersaoAcordoComercial) {
		super();
		this.numAcordoComercialParceiro = numAcordoComercialParceiro;
		this.numVersaoAcordoComercial = numVersaoAcordoComercial;
	}

	
	
	public Integer getNumAcordoComercialParceiro() {
		return numAcordoComercialParceiro;
	}

	public Integer getNumVersaoAcordoComercial() {
		return numVersaoAcordoComercial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numAcordoComercialParceiro == null) ? 0 : numAcordoComercialParceiro.hashCode());
		result = prime * result + ((numVersaoAcordoComercial == null) ? 0 : numVersaoAcordoComercial.hashCode());
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
		AcordoComercialParceiroId other = (AcordoComercialParceiroId) obj;
		if (numAcordoComercialParceiro == null) {
			if (other.numAcordoComercialParceiro != null)
				return false;
		} else if (!numAcordoComercialParceiro.equals(other.numAcordoComercialParceiro))
			return false;
		if (numVersaoAcordoComercial == null) {
			if (other.numVersaoAcordoComercial != null)
				return false;
		} else if (!numVersaoAcordoComercial.equals(other.numVersaoAcordoComercial))
			return false;
		return true;
	}

}

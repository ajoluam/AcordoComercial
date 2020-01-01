package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the acordocomercialcanaldisponivel database table.
 * 
 */
@Embeddable
public class AcordocomercialcanaldisponivelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int numeroAcordoComercialParceiro;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int numeroVersaoAcordoComercial;

	@Column(unique=true, nullable=false, length=2)
	private String codigoCanalDistribuicao;

	public AcordocomercialcanaldisponivelPK() {
	}
	public int getNumeroAcordoComercialParceiro() {
		return this.numeroAcordoComercialParceiro;
	}
	public void setNumeroAcordoComercialParceiro(int numeroAcordoComercialParceiro) {
		this.numeroAcordoComercialParceiro = numeroAcordoComercialParceiro;
	}
	public int getNumeroVersaoAcordoComercial() {
		return this.numeroVersaoAcordoComercial;
	}
	public void setNumeroVersaoAcordoComercial(int numeroVersaoAcordoComercial) {
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
	}
	public String getCodigoCanalDistribuicao() {
		return this.codigoCanalDistribuicao;
	}
	public void setCodigoCanalDistribuicao(String codigoCanalDistribuicao) {
		this.codigoCanalDistribuicao = codigoCanalDistribuicao;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcordocomercialcanaldisponivelPK)) {
			return false;
		}
		AcordocomercialcanaldisponivelPK castOther = (AcordocomercialcanaldisponivelPK)other;
		return 
			(this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
			&& (this.numeroVersaoAcordoComercial == castOther.numeroVersaoAcordoComercial)
			&& this.codigoCanalDistribuicao.equals(castOther.codigoCanalDistribuicao);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numeroAcordoComercialParceiro;
		hash = hash * prime + this.numeroVersaoAcordoComercial;
		hash = hash * prime + this.codigoCanalDistribuicao.hashCode();
		
		return hash;
	}
}
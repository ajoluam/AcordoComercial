package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the contarepasse database table.
 * 
 */
@Embeddable
public class ContarepassePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int numeroAcordoComercialParceiro;

	@Column(insertable=false, updatable=false)
	private int numeroVersaoAcordoComercial;

	private int codigoParceiroComercial;

	private int numeroSequencialContaParceiroComercial;

	public ContarepassePK() {
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
	public int getCodigoParceiroComercial() {
		return this.codigoParceiroComercial;
	}
	public void setCodigoParceiroComercial(int codigoParceiroComercial) {
		this.codigoParceiroComercial = codigoParceiroComercial;
	}
	public int getNumeroSequencialContaParceiroComercial() {
		return this.numeroSequencialContaParceiroComercial;
	}
	public void setNumeroSequencialContaParceiroComercial(int numeroSequencialContaParceiroComercial) {
		this.numeroSequencialContaParceiroComercial = numeroSequencialContaParceiroComercial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContarepassePK)) {
			return false;
		}
		ContarepassePK castOther = (ContarepassePK)other;
		return 
			(this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
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
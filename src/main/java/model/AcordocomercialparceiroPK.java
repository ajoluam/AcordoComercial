package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the acordocomercialparceiro database table.
 * 
 */
@Embeddable
public class AcordocomercialparceiroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int numeroAcordoComercialParceiro;

	private int numeroVersaoAcordoComercial;

	public AcordocomercialparceiroPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcordocomercialparceiroPK)) {
			return false;
		}
		AcordocomercialparceiroPK castOther = (AcordocomercialparceiroPK)other;
		return 
			(this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
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
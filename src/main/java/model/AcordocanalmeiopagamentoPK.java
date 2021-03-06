package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the acordocanalmeiopagamento database table.
 * 
 */
@Embeddable
public class AcordocanalmeiopagamentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int numeroAcordoComercialParceiro;

	@Column(insertable=false, updatable=false)
	private int numeroVersaoAcordoComercial;

	@Column(insertable=false, updatable=false)
	private String codigoCanalDistribuicao;

	private int codigoTipoMeioPagamento;

	public AcordocanalmeiopagamentoPK() {
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
	public int getCodigoTipoMeioPagamento() {
		return this.codigoTipoMeioPagamento;
	}
	public void setCodigoTipoMeioPagamento(int codigoTipoMeioPagamento) {
		this.codigoTipoMeioPagamento = codigoTipoMeioPagamento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AcordocanalmeiopagamentoPK)) {
			return false;
		}
		AcordocanalmeiopagamentoPK castOther = (AcordocanalmeiopagamentoPK)other;
		return 
			(this.numeroAcordoComercialParceiro == castOther.numeroAcordoComercialParceiro)
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
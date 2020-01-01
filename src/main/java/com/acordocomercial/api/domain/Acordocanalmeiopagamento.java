package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the acordocanalmeiopagamento database table.
 * 
 */
@Entity
@Table(name="acordocanalmeiopagamento")
@NamedQuery(name="Acordocanalmeiopagamento.findAll", query="SELECT a FROM Acordocanalmeiopagamento a")
public class Acordocanalmeiopagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordocanalmeiopagamentoPK id;

	//bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codigoCanalDistribuicao", referencedColumnName="codigoCanalDistribuicao", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial", nullable=false, insertable=false, updatable=false)
		})
	private Acordocomercialcanaldisponivel acordocomercialcanaldisponivel;

	public Acordocanalmeiopagamento() {
	}

	public AcordocanalmeiopagamentoPK getId() {
		return this.id;
	}

	public void setId(AcordocanalmeiopagamentoPK id) {
		this.id = id;
	}

	public Acordocomercialcanaldisponivel getAcordocomercialcanaldisponivel() {
		return this.acordocomercialcanaldisponivel;
	}

	public void setAcordocomercialcanaldisponivel(Acordocomercialcanaldisponivel acordocomercialcanaldisponivel) {
		this.acordocomercialcanaldisponivel = acordocomercialcanaldisponivel;
	}

}
package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the contarepasse database table.
 * 
 */
@Entity
@Table(name="contarepasse")
@NamedQuery(name="Contarepasse.findAll", query="SELECT c FROM Contarepasse c")
public class Contarepasse implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContarepassePK id;

	@Column(length=5)
	private String codigoFinalidadeSistemaPagamentoBrasileiro;

	@Column(length=7)
	private String codigoMensagemSistemaPagamentoBrasileiro;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal percentualRateioContaRepasseParceiro;

	//bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial", nullable=false, insertable=false, updatable=false)
		})
	private Acordocomercialparceiro acordocomercialparceiro;

	public Contarepasse() {
	}

	public ContarepassePK getId() {
		return this.id;
	}

	public void setId(ContarepassePK id) {
		this.id = id;
	}

	public String getCodigoFinalidadeSistemaPagamentoBrasileiro() {
		return this.codigoFinalidadeSistemaPagamentoBrasileiro;
	}

	public void setCodigoFinalidadeSistemaPagamentoBrasileiro(String codigoFinalidadeSistemaPagamentoBrasileiro) {
		this.codigoFinalidadeSistemaPagamentoBrasileiro = codigoFinalidadeSistemaPagamentoBrasileiro;
	}

	public String getCodigoMensagemSistemaPagamentoBrasileiro() {
		return this.codigoMensagemSistemaPagamentoBrasileiro;
	}

	public void setCodigoMensagemSistemaPagamentoBrasileiro(String codigoMensagemSistemaPagamentoBrasileiro) {
		this.codigoMensagemSistemaPagamentoBrasileiro = codigoMensagemSistemaPagamentoBrasileiro;
	}

	public BigDecimal getPercentualRateioContaRepasseParceiro() {
		return this.percentualRateioContaRepasseParceiro;
	}

	public void setPercentualRateioContaRepasseParceiro(BigDecimal percentualRateioContaRepasseParceiro) {
		this.percentualRateioContaRepasseParceiro = percentualRateioContaRepasseParceiro;
	}

	public Acordocomercialparceiro getAcordocomercialparceiro() {
		return this.acordocomercialparceiro;
	}

	public void setAcordocomercialparceiro(Acordocomercialparceiro acordocomercialparceiro) {
		this.acordocomercialparceiro = acordocomercialparceiro;
	}

}
package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the contarepasse database table.
 * 
 */
@Entity
@Table(name = "contarepasse")
@NamedQuery(name = "ContaRepasse.findAll", query = "SELECT c FROM ContaRepasse c")
public class ContaRepasse implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContaRepassePK id;

	@Column(name = "CODFINALD", length = 5)
	private String codigoFinalidadeSistemaPagamentoBrasileiro;

	@Column(name = "COMSGSPB", length = 7)
	private String codigoMensagemSistemaPagamentoBrasileiro;

	@Column(name = "PCT_RATE_CONT_REPS_PACE", nullable = false, precision = 10, scale = 2)
	private BigDecimal percentualRateioContaRepasseParceiro;

	// bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "NUM_ACOR_COML_PACE", referencedColumnName = "NUM_ACOR_COML_PACE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NUM_VERS_ACOR_COML", referencedColumnName = "NUM_VERS_ACOR_COML", nullable = false, insertable = false, updatable = false) })
	private AcordoComercialParceiro acordoComercialParceiro;

	public ContaRepasse() {
	}

	public ContaRepassePK getId() {
		return this.id;
	}

	public void setId(ContaRepassePK id) {
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

	public AcordoComercialParceiro getAcordoComercialParceiro() {
		return this.acordoComercialParceiro;
	}

	public void setAcordocomercialparceiro(AcordoComercialParceiro acordoComercialParceiro) {
		this.acordoComercialParceiro = acordoComercialParceiro;
	}

}
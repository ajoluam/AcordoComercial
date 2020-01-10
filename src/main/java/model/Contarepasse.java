package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the contarepasse database table.
 * 
 */
@Entity
@NamedQuery(name="Contarepasse.findAll", query="SELECT c FROM Contarepasse c")
public class Contarepasse implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContarepassePK id;

	private String codigoFinalidadeSistemaPagamentoBrasileiro;

	private String codigoMensagemSistemaPagamentoBrasileiro;

	private BigDecimal percentualRateioContaRepasseParceiro;

	//bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro"),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial")
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
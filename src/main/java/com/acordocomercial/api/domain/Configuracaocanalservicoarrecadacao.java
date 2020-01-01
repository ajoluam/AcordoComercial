package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


/**
 * The persistent class for the configuracaocanalservicoarrecadacao database table.
 * 
 */
@Entity
@Table(name="configuracaocanalservicoarrecadacao")
@NamedQuery(name="Configuracaocanalservicoarrecadacao.findAll", query="SELECT c FROM Configuracaocanalservicoarrecadacao c")
public class Configuracaocanalservicoarrecadacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int codigoConfiguracaoCanalServicoArrecadacao;

	@Column(nullable=false)
	private int quantidadeDiaFloatingServicoArrecadacao;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal valorTarifaServicoArrecadacao;

	//bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codigoCanalDistribuicao", referencedColumnName="codigoCanalDistribuicao", nullable=false),
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro", nullable=false),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial", nullable=false)
		})
	private Acordocomercialcanaldisponivel acordocomercialcanaldisponivel;

	//bi-directional many-to-one association to Tipovalortarifa
	@ManyToOne
	@JoinColumn(name="codigoTipoValorTarifa", nullable=false)
	private Tipovalortarifa tipovalortarifa;

	public Configuracaocanalservicoarrecadacao() {
	}

	public int getCodigoConfiguracaoCanalServicoArrecadacao() {
		return this.codigoConfiguracaoCanalServicoArrecadacao;
	}

	public void setCodigoConfiguracaoCanalServicoArrecadacao(int codigoConfiguracaoCanalServicoArrecadacao) {
		this.codigoConfiguracaoCanalServicoArrecadacao = codigoConfiguracaoCanalServicoArrecadacao;
	}

	public int getQuantidadeDiaFloatingServicoArrecadacao() {
		return this.quantidadeDiaFloatingServicoArrecadacao;
	}

	public void setQuantidadeDiaFloatingServicoArrecadacao(int quantidadeDiaFloatingServicoArrecadacao) {
		this.quantidadeDiaFloatingServicoArrecadacao = quantidadeDiaFloatingServicoArrecadacao;
	}

	public BigDecimal getValorTarifaServicoArrecadacao() {
		return this.valorTarifaServicoArrecadacao;
	}

	public void setValorTarifaServicoArrecadacao(BigDecimal valorTarifaServicoArrecadacao) {
		this.valorTarifaServicoArrecadacao = valorTarifaServicoArrecadacao;
	}

	public Acordocomercialcanaldisponivel getAcordocomercialcanaldisponivel() {
		return this.acordocomercialcanaldisponivel;
	}

	public void setAcordocomercialcanaldisponivel(Acordocomercialcanaldisponivel acordocomercialcanaldisponivel) {
		this.acordocomercialcanaldisponivel = acordocomercialcanaldisponivel;
	}

	public Tipovalortarifa getTipovalortarifa() {
		return this.tipovalortarifa;
	}

	public void setTipovalortarifa(Tipovalortarifa tipovalortarifa) {
		this.tipovalortarifa = tipovalortarifa;
	}

}
package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * The persistent class for the configuracaocanalservicoarrecadacao database
 * table.
 * 
 */
@Entity
@Table(name = "configuracaocanalservicoarrecadacao")
@NamedQuery(name = "ConfiguracaoCanalServicoArrecadacao.findAll", query = "SELECT c FROM ConfiguracaoCanalServicoArrecadacao c")
public class ConfiguracaoCanalServicoArrecadacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CNFG_CANA_SERV_ARRE", unique = true, nullable = false)
	private Integer codigoConfiguracaoCanalServicoArrecadacao;

	@Column(name = "QTD_DIA_FLTG_SERV_ARRE", nullable = false)
	private Integer quantidadeDiaFloatingServicoArrecadacao;

	@Column(name = "VLR_TARI_SERV_ARRE", nullable = false, precision = 10, scale = 2)
	private BigDecimal valorTarifaServicoArrecadacao;

	// bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "COD_CANA_DTBC", referencedColumnName = "COD_CANA_DTBC", nullable = false),
			@JoinColumn(name = "NUM_ACOR_COML_PACE", referencedColumnName = "NUM_ACOR_COML_PACE", nullable = false),
			@JoinColumn(name = "NUM_VERS_ACOR_COML", referencedColumnName = "NUM_VERS_ACOR_COML", nullable = false) })
	private AcordoComercialCanalDisponivel acordoComercialCanalDisponivel;

	// bi-directional many-to-one association to Tipovalortarifa
	@ManyToOne
	@JoinColumn(name = "COD_TIPO_VLR_TARI", referencedColumnName = "COD_TIPO_VLR_TARI", nullable = false)
	private TipoValorTarifa tipoValorTarifa;

	public ConfiguracaoCanalServicoArrecadacao() {
	}

	public Integer getCodigoConfiguracaoCanalServicoArrecadacao() {
		return this.codigoConfiguracaoCanalServicoArrecadacao;
	}

	public void setCodigoConfiguracaoCanalServicoArrecadacao(Integer codigoConfiguracaoCanalServicoArrecadacao) {
		this.codigoConfiguracaoCanalServicoArrecadacao = codigoConfiguracaoCanalServicoArrecadacao;
	}

	public Integer getQuantidadeDiaFloatingServicoArrecadacao() {
		return this.quantidadeDiaFloatingServicoArrecadacao;
	}

	public void setQuantidadeDiaFloatingServicoArrecadacao(Integer quantidadeDiaFloatingServicoArrecadacao) {
		this.quantidadeDiaFloatingServicoArrecadacao = quantidadeDiaFloatingServicoArrecadacao;
	}

	public BigDecimal getValorTarifaServicoArrecadacao() {
		return this.valorTarifaServicoArrecadacao;
	}

	public void setValorTarifaServicoArrecadacao(BigDecimal valorTarifaServicoArrecadacao) {
		this.valorTarifaServicoArrecadacao = valorTarifaServicoArrecadacao;
	}

	public AcordoComercialCanalDisponivel getAcordocomercialcanaldisponivel() {
		return this.acordoComercialCanalDisponivel;
	}

	public void setAcordocomercialcanaldisponivel(AcordoComercialCanalDisponivel acordoComercialCanalDisponivel) {
		this.acordoComercialCanalDisponivel = acordoComercialCanalDisponivel;
	}

	public TipoValorTarifa getTipoValorTarifa() {
		return this.tipoValorTarifa;
	}

	public void setTipovalortarifa(TipoValorTarifa tipoValorTarifa) {
		this.tipoValorTarifa = tipoValorTarifa;
	}

}
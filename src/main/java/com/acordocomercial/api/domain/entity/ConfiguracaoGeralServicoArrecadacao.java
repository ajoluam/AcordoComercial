package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the configuracaogeralservicoarrecadacao database
 * table.
 * 
 */
@Entity
@Table(name = "configuracaogeralservicoarrecadacao")
@NamedQuery(name = "ConfiguracaoGeralServicoArrecadacao.findAll", query = "SELECT c FROM ConfiguracaoGeralServicoArrecadacao c")
public class ConfiguracaoGeralServicoArrecadacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConfiguracaoGeralServicoArrecadacaoPK id;

	@Column(name = "COD_CRIT_TXA_CMON_ACOR_CONT", nullable = false)
	private Integer codigoCriterioTaxaCorrecaoMonetariaAcordoContrato;

	@Column(name = "DAT_PRDC_TARI_SERV_ARRE", length = 1)
	private String codigoPeriodicidadeTarifaServicoArrecadacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_FIM_VIGE_TARI_SERV_ARRE", nullable = false)
	private Date dataFimVigenciaTarifaServicoArrecadacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_INIO_VIGE_TARI_SERV_ARRE", nullable = false)
	private Date dataInicioVigenciaTarifaServicoArrecadacao;

	@Column(name = "NUM_ACOR_COML_PACE", nullable = false)
	private Integer numeroAcordoComercialParceiro;

	@Column(name = "NUM_VERS_ACOR_COML", nullable = false)
	private Integer numeroVersaoAcordoComercial;

	// bi-directional many-to-one association to Tipodebitotarifa
	@ManyToOne
	@JoinColumn(name = "COD_TIPO_DEBT_TARI", referencedColumnName = "COD_TIPO_DEBT_TARI", nullable = false, insertable = false, updatable = false)
	private TipoDebitoTarifa tipoDebitoTarifa;

	public ConfiguracaoGeralServicoArrecadacao() {
	}

	public ConfiguracaoGeralServicoArrecadacaoPK getId() {
		return this.id;
	}

	public void setId(ConfiguracaoGeralServicoArrecadacaoPK id) {
		this.id = id;
	}

	public Integer getCodigoCriterioTaxaCorrecaoMonetariaAcordoContrato() {
		return this.codigoCriterioTaxaCorrecaoMonetariaAcordoContrato;
	}

	public void setCodigoCriterioTaxaCorrecaoMonetariaAcordoContrato(
			Integer codigoCriterioTaxaCorrecaoMonetariaAcordoContrato) {
		this.codigoCriterioTaxaCorrecaoMonetariaAcordoContrato = codigoCriterioTaxaCorrecaoMonetariaAcordoContrato;
	}

	public String getCodigoPeriodicidadeTarifaServicoArrecadacao() {
		return this.codigoPeriodicidadeTarifaServicoArrecadacao;
	}

	public void setCodigoPeriodicidadeTarifaServicoArrecadacao(String codigoPeriodicidadeTarifaServicoArrecadacao) {
		this.codigoPeriodicidadeTarifaServicoArrecadacao = codigoPeriodicidadeTarifaServicoArrecadacao;
	}

	public Date getDataFimVigenciaTarifaServicoArrecadacao() {
		return this.dataFimVigenciaTarifaServicoArrecadacao;
	}

	public void setDataFimVigenciaTarifaServicoArrecadacao(Date dataFimVigenciaTarifaServicoArrecadacao) {
		this.dataFimVigenciaTarifaServicoArrecadacao = dataFimVigenciaTarifaServicoArrecadacao;
	}

	public Date getDataInicioVigenciaTarifaServicoArrecadacao() {
		return this.dataInicioVigenciaTarifaServicoArrecadacao;
	}

	public void setDataInicioVigenciaTarifaServicoArrecadacao(Date dataInicioVigenciaTarifaServicoArrecadacao) {
		this.dataInicioVigenciaTarifaServicoArrecadacao = dataInicioVigenciaTarifaServicoArrecadacao;
	}

	public Integer getNumeroAcordoComercialParceiro() {
		return this.numeroAcordoComercialParceiro;
	}

	public void setNumeroAcordoComercialParceiro(Integer numeroAcordoComercialParceiro) {
		this.numeroAcordoComercialParceiro = numeroAcordoComercialParceiro;
	}

	public Integer getNumeroVersaoAcordoComercial() {
		return this.numeroVersaoAcordoComercial;
	}

	public void setNumeroVersaoAcordoComercial(Integer numeroVersaoAcordoComercial) {
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
	}

	public TipoDebitoTarifa getTipoDebitoTarifa() {
		return this.tipoDebitoTarifa;
	}

	public void setTipodebitotarifa(TipoDebitoTarifa tipoDebitoTarifa) {
		this.tipoDebitoTarifa = tipoDebitoTarifa;
	}

}
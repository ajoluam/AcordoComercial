package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIG_GRL_SVC_ARREC")
public class ConfiguracaoGeralServicoArrecadacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CFG_GRL_SV_ARREC")
	private Integer codConfiguracaoGeralServicoArrecadacao;

	@Column(name = "NUM_ACD_CMRL_PRC")
	private Integer numAcordoComercialParceiro;

	@Column(name = "NUM_VRS_ACD_CMRL")
	private Integer numVersaoAcordoComercial;

	private Integer codPeriodicidade;
	private Integer codCriterio;
	private LocalDateTime dataInicioVigencia;
	private LocalDateTime dataFimVigencia;

	@ManyToOne
	@JoinColumn(name = "COD_TP_DB_TF")
	private TipoDebitoTarifa codTipoDebitoTarifa;

	public Integer getCodConfiguracaoGeralServicoArrecadacao() {
		return codConfiguracaoGeralServicoArrecadacao;
	}

	public void setCodConfiguracaoGeralServicoArrecadacao(Integer codConfiguracaoGeralServicoArrecadacao) {
		this.codConfiguracaoGeralServicoArrecadacao = codConfiguracaoGeralServicoArrecadacao;
	}

	
	public Integer getNumAcordoComercialParceiro() {
		return numAcordoComercialParceiro;
	}

	public void setNumAcordoComercialParceiro(Integer numAcordoComercialParceiro) {
		this.numAcordoComercialParceiro = numAcordoComercialParceiro;
	}

	public Integer getNumVersaoAcordoComercial() {
		return numVersaoAcordoComercial;
	}

	public void setNumVersaoAcordoComercial(Integer numVersaoAcordoComercial) {
		this.numVersaoAcordoComercial = numVersaoAcordoComercial;
	}

	public Integer getCodPeriodicidade() {
		return codPeriodicidade;
	}

	public void setCodPeriodicidade(Integer codPeriodicidade) {
		this.codPeriodicidade = codPeriodicidade;
	}

	public Integer getCodCriterio() {
		return codCriterio;
	}

	public void setCodCriterio(Integer codCriterio) {
		this.codCriterio = codCriterio;
	}

	public LocalDateTime getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(LocalDateTime dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public LocalDateTime getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(LocalDateTime dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public TipoDebitoTarifa getCodTipoDebitoTarifa() {
		return codTipoDebitoTarifa;
	}

	public void setCodTipoDebitoTarifa(TipoDebitoTarifa codTipoDebitoTarifa) {
		this.codTipoDebitoTarifa = codTipoDebitoTarifa;
	}

}

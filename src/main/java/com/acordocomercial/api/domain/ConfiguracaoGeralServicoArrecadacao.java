package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIG_GRL_SVC_ARREC")
public class ConfiguracaoGeralServicoArrecadacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CFG_GRL_SV_ARREC")
	private Integer codConfiguracaoGeralServicoArrecadacao;

	@OneToOne
	@JoinColumns({
			@JoinColumn(name = "numAcordoComercialParceiro", referencedColumnName = "NUM_ACD_CMRL_PRC"),
			@JoinColumn(name = "numeroVersaoAcordoComercial", referencedColumnName = "NUM_VRS_ACD_CMRL") })
	@MapsId
	private AcordoComercialParceiro acordoComercialParceiro;

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

	public AcordoComercialParceiro getAcordoComercialParceiro() {
		return acordoComercialParceiro;
	}

	public void setAcordoComercialParceiro(AcordoComercialParceiro acordoComercialParceiro) {
		this.acordoComercialParceiro = acordoComercialParceiro;
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

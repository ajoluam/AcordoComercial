package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the configuracaogeralservicoarrecadacao database table.
 * 
 */
@Entity
@Table(name="configuracaogeralservicoarrecadacao")
@NamedQuery(name="ConfiguracaoGeralServicoArrecadacao.findAll", query="SELECT c FROM ConfiguracaoGeralServicoArrecadacao c")
public class ConfiguracaoGeralServicoArrecadacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConfiguracaoGeralServicoArrecadacaoPK id;

	@Column(nullable=false)
	private int codigoCriterioTaxaCorrecaoMonetariaAcordoContrato;

	@Column(length=1)
	private String codigoPeriodicidadeTarifaServicoArrecadacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date dataFimVigenciaTarifaServicoArrecadacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date dataInicioVigenciaTarifaServicoArrecadacao;

	@Column(nullable=false)
	private int numeroAcordoComercialParceiro;

	@Column(nullable=false)
	private int numeroVersaoAcordoComercial;

	//bi-directional many-to-one association to Tipodebitotarifa
	@ManyToOne
	@JoinColumn(name="codigoTipoDebitoTarifa", nullable=false, insertable=false, updatable=false)
	private TipoDebitoTarifa tipoDebitoTarifa;

	public ConfiguracaoGeralServicoArrecadacao() {
	}

	public ConfiguracaoGeralServicoArrecadacaoPK getId() {
		return this.id;
	}

	public void setId(ConfiguracaoGeralServicoArrecadacaoPK id) {
		this.id = id;
	}

	public int getCodigoCriterioTaxaCorrecaoMonetariaAcordoContrato() {
		return this.codigoCriterioTaxaCorrecaoMonetariaAcordoContrato;
	}

	public void setCodigoCriterioTaxaCorrecaoMonetariaAcordoContrato(int codigoCriterioTaxaCorrecaoMonetariaAcordoContrato) {
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

	public TipoDebitoTarifa getTipoDebitoTarifa() {
		return this.tipoDebitoTarifa;
	}

	public void setTipodebitotarifa(TipoDebitoTarifa tipoDebitoTarifa) {
		this.tipoDebitoTarifa = tipoDebitoTarifa;
	}

}
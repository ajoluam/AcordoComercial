package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the configuracaogeralservicoarrecadacao database table.
 * 
 */
@Entity
@NamedQuery(name="Configuracaogeralservicoarrecadacao.findAll", query="SELECT c FROM Configuracaogeralservicoarrecadacao c")
public class Configuracaogeralservicoarrecadacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigoConfiguracaoGeralServicoArrecadacao;

	private int codigoCriterioTaxaCorrecaoMonetariaAcordoContrato;

	private String codigoPeriodicidadeTarifaServicoArrecadacao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFimVigenciaTarifaServicoArrecadacao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicioVigenciaTarifaServicoArrecadacao;

	//bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro"),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial")
		})
	private Acordocomercialparceiro acordocomercialparceiro;

	//bi-directional many-to-one association to Tipodebitotarifa
	@ManyToOne
	@JoinColumn(name="codigoTipoDebitoTarifa")
	private Tipodebitotarifa tipodebitotarifa;

	public Configuracaogeralservicoarrecadacao() {
	}

	public int getCodigoConfiguracaoGeralServicoArrecadacao() {
		return this.codigoConfiguracaoGeralServicoArrecadacao;
	}

	public void setCodigoConfiguracaoGeralServicoArrecadacao(int codigoConfiguracaoGeralServicoArrecadacao) {
		this.codigoConfiguracaoGeralServicoArrecadacao = codigoConfiguracaoGeralServicoArrecadacao;
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

	public Acordocomercialparceiro getAcordocomercialparceiro() {
		return this.acordocomercialparceiro;
	}

	public void setAcordocomercialparceiro(Acordocomercialparceiro acordocomercialparceiro) {
		this.acordocomercialparceiro = acordocomercialparceiro;
	}

	public Tipodebitotarifa getTipodebitotarifa() {
		return this.tipodebitotarifa;
	}

	public void setTipodebitotarifa(Tipodebitotarifa tipodebitotarifa) {
		this.tipodebitotarifa = tipodebitotarifa;
	}

}
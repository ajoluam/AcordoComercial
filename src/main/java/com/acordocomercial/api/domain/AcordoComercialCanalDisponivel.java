package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the acordocomercialcanaldisponivel database table.
 * 
 */
@Entity
@Table(name = "acordocomercialcanaldisponivel")
@NamedQuery(name = "AcordoComercialCanalDisponivel.findAll", query = "SELECT a FROM AcordoComercialCanalDisponivel a")
public class AcordoComercialCanalDisponivel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordoComercialCanalDisponivelPK id;

	@Column(name = "COD_SITU", nullable = false)
	private Integer codigoSituacao;

	// bi-directional many-to-one association to Acordocanalmeiopagamento
	@OneToMany(mappedBy = "acordoComercialCanalDisponivel")
	private List<AcordoCanalMeioPagamento> acordoCanalMeioPagamentos = new ArrayList<>();

	// bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "NUM_ACOR_COML_PACE", referencedColumnName = "NUM_ACOR_COML_PACE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NUM_VERS_ACOR_COML", referencedColumnName = "NUM_VERS_ACOR_COML", nullable = false, insertable = false, updatable = false) })
	private AcordoComercialParceiro acordoComercialParceiro;

	// bi-directional many-to-one association to Configuracaocanalservicoarrecadacao
	@OneToMany(mappedBy = "acordoComercialCanalDisponivel")
	private List<ConfiguracaoCanalServicoArrecadacao> configuracaoCanalServicoArrecadacoes = new ArrayList<>();

	public AcordoComercialCanalDisponivel() {
	}

	public AcordoComercialCanalDisponivelPK getId() {
		return this.id;
	}

	public void setId(AcordoComercialCanalDisponivelPK id) {
		this.id = id;
	}

	public Integer getCodigoSituacao() {
		return this.codigoSituacao;
	}

	public void setCodigoSituacao(Integer codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public List<AcordoCanalMeioPagamento> getAcordocanalmeiopagamentos() {
		return this.acordoCanalMeioPagamentos;
	}

	public void setAcordocanalmeiopagamentos(List<AcordoCanalMeioPagamento> acordoCanalMeioPagamentos) {
		this.acordoCanalMeioPagamentos = acordoCanalMeioPagamentos;
	}

	public AcordoCanalMeioPagamento addAcordocanalmeiopagamento(AcordoCanalMeioPagamento acordoCanalMeioPagamento) {
		getAcordocanalmeiopagamentos().add(acordoCanalMeioPagamento);
		acordoCanalMeioPagamento.setAcordocomercialcanaldisponivel(this);

		return acordoCanalMeioPagamento;
	}

	public AcordoCanalMeioPagamento removeAcordocanalmeiopagamento(AcordoCanalMeioPagamento acordoCanalMeioPagamento) {
		getAcordocanalmeiopagamentos().remove(acordoCanalMeioPagamento);
		acordoCanalMeioPagamento.setAcordocomercialcanaldisponivel(null);

		return acordoCanalMeioPagamento;
	}

	public AcordoComercialParceiro getAcordocomercialparceiro() {
		return this.acordoComercialParceiro;
	}

	public void setAcordocomercialparceiro(AcordoComercialParceiro acordocomercialparceiro) {
		this.acordoComercialParceiro = acordocomercialparceiro;
	}

	public List<ConfiguracaoCanalServicoArrecadacao> getConfiguracaocanalservicoarrecadacoes() {
		return this.configuracaoCanalServicoArrecadacoes;
	}

	public void setConfiguracaocanalservicoarrecadacaos(
			List<ConfiguracaoCanalServicoArrecadacao> configuracaoCanalServicoArrecadacoes) {
		this.configuracaoCanalServicoArrecadacoes = configuracaoCanalServicoArrecadacoes;
	}

	public ConfiguracaoCanalServicoArrecadacao addConfiguracaocanalservicoarrecadacao(
			ConfiguracaoCanalServicoArrecadacao configuracaoCanalServicoArrecadacao) {
		getConfiguracaocanalservicoarrecadacoes().add(configuracaoCanalServicoArrecadacao);
		configuracaoCanalServicoArrecadacao.setAcordocomercialcanaldisponivel(this);

		return configuracaoCanalServicoArrecadacao;
	}

	public ConfiguracaoCanalServicoArrecadacao removeConfiguracaocanalservicoarrecadacao(
			ConfiguracaoCanalServicoArrecadacao configuracaoCanalServicoArrecadacao) {
		getConfiguracaocanalservicoarrecadacoes().remove(configuracaoCanalServicoArrecadacao);
		configuracaoCanalServicoArrecadacao.setAcordocomercialcanaldisponivel(null);

		return configuracaoCanalServicoArrecadacao;
	}

}
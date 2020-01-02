package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the tipodebitotarifa database table.
 * 
 */
@Entity
@Table(name = "tipodebitotarifa")
@NamedQuery(name = "TipoDebitoTarifa.findAll", query = "SELECT t FROM TipoDebitoTarifa t")
public class TipoDebitoTarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_TIPO_DEBT_TARI", unique = true, nullable = false)
	private Integer codigoTipoDebitoTarifa;

	@Column(name = "NOM_TIPO_DEBT_TARI", nullable = false, length = 30)
	private String nomeTipoDebitoTarifa;

	// bi-directional many-to-one association to Configuracaogeralservicoarrecadacao
	@OneToMany(mappedBy = "tipoDebitoTarifa")
	private List<ConfiguracaoGeralServicoArrecadacao> configuracaoGeralServicoArrecadacoes = new ArrayList<>();

	public TipoDebitoTarifa() {
	}

	public Integer getCodigoTipoDebitoTarifa() {
		return this.codigoTipoDebitoTarifa;
	}

	public void setCodigoTipoDebitoTarifa(Integer codigoTipoDebitoTarifa) {
		this.codigoTipoDebitoTarifa = codigoTipoDebitoTarifa;
	}

	public String getNomeTipoDebitoTarifa() {
		return this.nomeTipoDebitoTarifa;
	}

	public void setNomeTipoDebitoTarifa(String nomeTipoDebitoTarifa) {
		this.nomeTipoDebitoTarifa = nomeTipoDebitoTarifa;
	}

	public List<ConfiguracaoGeralServicoArrecadacao> getConfiguracaoGeralServicoArrecadacoes() {
		return this.configuracaoGeralServicoArrecadacoes;
	}

	public void setConfiguracaogeralservicoarrecadacaos(
			List<ConfiguracaoGeralServicoArrecadacao> configuracaoGeralServicoArrecadacoes) {
		this.configuracaoGeralServicoArrecadacoes = configuracaoGeralServicoArrecadacoes;
	}

	public ConfiguracaoGeralServicoArrecadacao addConfiguracaogeralservicoarrecadacao(
			ConfiguracaoGeralServicoArrecadacao configuracaoGeralServicoArrecadacao) {
		getConfiguracaoGeralServicoArrecadacoes().add(configuracaoGeralServicoArrecadacao);
		configuracaoGeralServicoArrecadacao.setTipodebitotarifa(this);

		return configuracaoGeralServicoArrecadacao;
	}

	public ConfiguracaoGeralServicoArrecadacao removeConfiguracaogeralservicoarrecadacao(
			ConfiguracaoGeralServicoArrecadacao configuracaoGeralServicoArrecadacao) {
		getConfiguracaoGeralServicoArrecadacoes().remove(configuracaoGeralServicoArrecadacao);
		configuracaoGeralServicoArrecadacao.setTipodebitotarifa(null);

		return configuracaoGeralServicoArrecadacao;
	}

}
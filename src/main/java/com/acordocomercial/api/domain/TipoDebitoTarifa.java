package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_TIPO_DEBT_TARI", unique = true, nullable = false)
	private int codigoTipoDebitoTarifa;

	@Column(name = "NOM_TIPO_DEBT_TARI", nullable = false, length = 30)
	private String nomeTipoDebitoTarifa;

	// bi-directional many-to-one association to Configuracaogeralservicoarrecadacao
	@OneToMany(mappedBy = "tipoDebitoTarifa")
	private List<ConfiguracaoGeralServicoArrecadacao> configuracaoGeralServicoArrecadacoes;

	public TipoDebitoTarifa() {
	}

	public int getCodigoTipoDebitoTarifa() {
		return this.codigoTipoDebitoTarifa;
	}

	public void setCodigoTipoDebitoTarifa(int codigoTipoDebitoTarifa) {
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
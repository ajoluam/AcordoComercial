package com.acordocomercial.api.domain;

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
 * The persistent class for the tipovalortarifa database table.
 * 
 */
@Entity
@Table(name = "tipovalortarifa")
@NamedQuery(name = "TipoValorTarifa.findAll", query = "SELECT t FROM TipoValorTarifa t")
public class TipoValorTarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_TIPO_VLR_TARI", unique = true, nullable = false)
	private Integer codigoTipoValorTarifa;

	@Column(name = "NOM_TIPO_VLR_TARI", nullable = false, length = 30)
	private String nomeTipoValorTarifa;

	// bi-directional many-to-one association to Configuracaocanalservicoarrecadacao
	@OneToMany(mappedBy = "tipoValorTarifa")
	private List<ConfiguracaoCanalServicoArrecadacao> configuracaoCanalServicoArrecadacoes = new ArrayList<>();

	public TipoValorTarifa() {
	}

	public Integer getCodigoTipoValorTarifa() {
		return this.codigoTipoValorTarifa;
	}

	public void setCodigoTipoValorTarifa(Integer codigoTipoValorTarifa) {
		this.codigoTipoValorTarifa = codigoTipoValorTarifa;
	}

	public String getNomeTipoValorTarifa() {
		return this.nomeTipoValorTarifa;
	}

	public void setNomeTipoValorTarifa(String nomeTipoValorTarifa) {
		this.nomeTipoValorTarifa = nomeTipoValorTarifa;
	}

	public List<ConfiguracaoCanalServicoArrecadacao> getConfiguracaoCanalServicoArrecadacoes() {
		return this.configuracaoCanalServicoArrecadacoes;
	}

	public void setConfiguracaocanalservicoarrecadacaos(
			List<ConfiguracaoCanalServicoArrecadacao> configuracaoCanalServicoArrecadacoes) {
		this.configuracaoCanalServicoArrecadacoes = configuracaoCanalServicoArrecadacoes;
	}

	public ConfiguracaoCanalServicoArrecadacao addConfiguracaocanalservicoarrecadacao(
			ConfiguracaoCanalServicoArrecadacao configuracaoCanalServicoArrecadacao) {
		getConfiguracaoCanalServicoArrecadacoes().add(configuracaoCanalServicoArrecadacao);
		configuracaoCanalServicoArrecadacao.setTipovalortarifa(this);

		return configuracaoCanalServicoArrecadacao;
	}

	public ConfiguracaoCanalServicoArrecadacao removeConfiguracaocanalservicoarrecadacao(
			ConfiguracaoCanalServicoArrecadacao configuracaoCanalServicoArrecadacao) {
		getConfiguracaoCanalServicoArrecadacoes().remove(configuracaoCanalServicoArrecadacao);
		configuracaoCanalServicoArrecadacao.setTipovalortarifa(null);

		return configuracaoCanalServicoArrecadacao;
	}

}
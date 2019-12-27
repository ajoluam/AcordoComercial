package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_DEB_TRF")
public class TipoDebitoTarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_TP_DB_TF")
	private Integer codTipoDebitoTarifa;

	private String nomeTipoDebitoTarifa;

	@OneToMany(mappedBy = "codTipoDebitoTarifa")
	private List<ConfiguracaoGeralServicoArrecadacao> configuracoes = new ArrayList<>();

	public Integer getCodTipoDebitoTarifa() {
		return codTipoDebitoTarifa;
	}

	public void setCodTipoDebitoTarifa(Integer codTipoDebitoTarifa) {
		this.codTipoDebitoTarifa = codTipoDebitoTarifa;
	}

	public String getNomeTipoDebitoTarifa() {
		return nomeTipoDebitoTarifa;
	}

	public void setNomeTipoDebitoTarifa(String nomeTipoDebitoTarifa) {
		this.nomeTipoDebitoTarifa = nomeTipoDebitoTarifa;
	}

	public List<ConfiguracaoGeralServicoArrecadacao> getConfiguracoes() {
		return configuracoes;
	}

	public void setConfiguracoes(List<ConfiguracaoGeralServicoArrecadacao> configuracoes) {
		this.configuracoes = configuracoes;
	}

}

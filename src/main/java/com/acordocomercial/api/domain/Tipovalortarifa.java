package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipovalortarifa database table.
 * 
 */
@Entity
@Table(name="tipovalortarifa")
@NamedQuery(name="Tipovalortarifa.findAll", query="SELECT t FROM Tipovalortarifa t")
public class Tipovalortarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int codigoTipoValorTarifa;

	@Column(nullable=false, length=30)
	private String nomeTipoValorTarifa;

	//bi-directional many-to-one association to Configuracaocanalservicoarrecadacao
	@OneToMany(mappedBy="tipovalortarifa")
	private List<Configuracaocanalservicoarrecadacao> configuracaocanalservicoarrecadacaos;

	public Tipovalortarifa() {
	}

	public int getCodigoTipoValorTarifa() {
		return this.codigoTipoValorTarifa;
	}

	public void setCodigoTipoValorTarifa(int codigoTipoValorTarifa) {
		this.codigoTipoValorTarifa = codigoTipoValorTarifa;
	}

	public String getNomeTipoValorTarifa() {
		return this.nomeTipoValorTarifa;
	}

	public void setNomeTipoValorTarifa(String nomeTipoValorTarifa) {
		this.nomeTipoValorTarifa = nomeTipoValorTarifa;
	}

	public List<Configuracaocanalservicoarrecadacao> getConfiguracaocanalservicoarrecadacaos() {
		return this.configuracaocanalservicoarrecadacaos;
	}

	public void setConfiguracaocanalservicoarrecadacaos(List<Configuracaocanalservicoarrecadacao> configuracaocanalservicoarrecadacaos) {
		this.configuracaocanalservicoarrecadacaos = configuracaocanalservicoarrecadacaos;
	}

	public Configuracaocanalservicoarrecadacao addConfiguracaocanalservicoarrecadacao(Configuracaocanalservicoarrecadacao configuracaocanalservicoarrecadacao) {
		getConfiguracaocanalservicoarrecadacaos().add(configuracaocanalservicoarrecadacao);
		configuracaocanalservicoarrecadacao.setTipovalortarifa(this);

		return configuracaocanalservicoarrecadacao;
	}

	public Configuracaocanalservicoarrecadacao removeConfiguracaocanalservicoarrecadacao(Configuracaocanalservicoarrecadacao configuracaocanalservicoarrecadacao) {
		getConfiguracaocanalservicoarrecadacaos().remove(configuracaocanalservicoarrecadacao);
		configuracaocanalservicoarrecadacao.setTipovalortarifa(null);

		return configuracaocanalservicoarrecadacao;
	}

}
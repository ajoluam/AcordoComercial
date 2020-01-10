package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipodebitotarifa database table.
 * 
 */
@Entity
@NamedQuery(name="Tipodebitotarifa.findAll", query="SELECT t FROM Tipodebitotarifa t")
public class Tipodebitotarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigoTipoDebitoTarifa;

	private String nomeTipoDebitoTarifa;

	//bi-directional many-to-one association to Configuracaogeralservicoarrecadacao
	@OneToMany(mappedBy="tipodebitotarifa")
	private List<Configuracaogeralservicoarrecadacao> configuracaogeralservicoarrecadacaos;

	public Tipodebitotarifa() {
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

	public List<Configuracaogeralservicoarrecadacao> getConfiguracaogeralservicoarrecadacaos() {
		return this.configuracaogeralservicoarrecadacaos;
	}

	public void setConfiguracaogeralservicoarrecadacaos(List<Configuracaogeralservicoarrecadacao> configuracaogeralservicoarrecadacaos) {
		this.configuracaogeralservicoarrecadacaos = configuracaogeralservicoarrecadacaos;
	}

	public Configuracaogeralservicoarrecadacao addConfiguracaogeralservicoarrecadacao(Configuracaogeralservicoarrecadacao configuracaogeralservicoarrecadacao) {
		getConfiguracaogeralservicoarrecadacaos().add(configuracaogeralservicoarrecadacao);
		configuracaogeralservicoarrecadacao.setTipodebitotarifa(this);

		return configuracaogeralservicoarrecadacao;
	}

	public Configuracaogeralservicoarrecadacao removeConfiguracaogeralservicoarrecadacao(Configuracaogeralservicoarrecadacao configuracaogeralservicoarrecadacao) {
		getConfiguracaogeralservicoarrecadacaos().remove(configuracaogeralservicoarrecadacao);
		configuracaogeralservicoarrecadacao.setTipodebitotarifa(null);

		return configuracaogeralservicoarrecadacao;
	}

}
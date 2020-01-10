package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the acordocomercialcanaldisponivel database table.
 * 
 */
@Entity
@NamedQuery(name="Acordocomercialcanaldisponivel.findAll", query="SELECT a FROM Acordocomercialcanaldisponivel a")
public class Acordocomercialcanaldisponivel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordocomercialcanaldisponivelPK id;

	private int codigoSituacao;

	//bi-directional many-to-one association to Acordocanalmeiopagamento
	@OneToMany(mappedBy="acordocomercialcanaldisponivel")
	private List<Acordocanalmeiopagamento> acordocanalmeiopagamentos;

	//bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro"),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial")
		})
	private Acordocomercialparceiro acordocomercialparceiro;

	//bi-directional many-to-one association to Configuracaocanalservicoarrecadacao
	@OneToMany(mappedBy="acordocomercialcanaldisponivel")
	private List<Configuracaocanalservicoarrecadacao> configuracaocanalservicoarrecadacaos;

	public Acordocomercialcanaldisponivel() {
	}

	public AcordocomercialcanaldisponivelPK getId() {
		return this.id;
	}

	public void setId(AcordocomercialcanaldisponivelPK id) {
		this.id = id;
	}

	public int getCodigoSituacao() {
		return this.codigoSituacao;
	}

	public void setCodigoSituacao(int codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public List<Acordocanalmeiopagamento> getAcordocanalmeiopagamentos() {
		return this.acordocanalmeiopagamentos;
	}

	public void setAcordocanalmeiopagamentos(List<Acordocanalmeiopagamento> acordocanalmeiopagamentos) {
		this.acordocanalmeiopagamentos = acordocanalmeiopagamentos;
	}

	public Acordocanalmeiopagamento addAcordocanalmeiopagamento(Acordocanalmeiopagamento acordocanalmeiopagamento) {
		getAcordocanalmeiopagamentos().add(acordocanalmeiopagamento);
		acordocanalmeiopagamento.setAcordocomercialcanaldisponivel(this);

		return acordocanalmeiopagamento;
	}

	public Acordocanalmeiopagamento removeAcordocanalmeiopagamento(Acordocanalmeiopagamento acordocanalmeiopagamento) {
		getAcordocanalmeiopagamentos().remove(acordocanalmeiopagamento);
		acordocanalmeiopagamento.setAcordocomercialcanaldisponivel(null);

		return acordocanalmeiopagamento;
	}

	public Acordocomercialparceiro getAcordocomercialparceiro() {
		return this.acordocomercialparceiro;
	}

	public void setAcordocomercialparceiro(Acordocomercialparceiro acordocomercialparceiro) {
		this.acordocomercialparceiro = acordocomercialparceiro;
	}

	public List<Configuracaocanalservicoarrecadacao> getConfiguracaocanalservicoarrecadacaos() {
		return this.configuracaocanalservicoarrecadacaos;
	}

	public void setConfiguracaocanalservicoarrecadacaos(List<Configuracaocanalservicoarrecadacao> configuracaocanalservicoarrecadacaos) {
		this.configuracaocanalservicoarrecadacaos = configuracaocanalservicoarrecadacaos;
	}

	public Configuracaocanalservicoarrecadacao addConfiguracaocanalservicoarrecadacao(Configuracaocanalservicoarrecadacao configuracaocanalservicoarrecadacao) {
		getConfiguracaocanalservicoarrecadacaos().add(configuracaocanalservicoarrecadacao);
		configuracaocanalservicoarrecadacao.setAcordocomercialcanaldisponivel(this);

		return configuracaocanalservicoarrecadacao;
	}

	public Configuracaocanalservicoarrecadacao removeConfiguracaocanalservicoarrecadacao(Configuracaocanalservicoarrecadacao configuracaocanalservicoarrecadacao) {
		getConfiguracaocanalservicoarrecadacaos().remove(configuracaocanalservicoarrecadacao);
		configuracaocanalservicoarrecadacao.setAcordocomercialcanaldisponivel(null);

		return configuracaocanalservicoarrecadacao;
	}

}
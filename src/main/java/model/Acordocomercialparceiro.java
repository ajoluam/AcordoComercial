package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the acordocomercialparceiro database table.
 * 
 */
@Entity
@NamedQuery(name="Acordocomercialparceiro.findAll", query="SELECT a FROM Acordocomercialparceiro a")
public class Acordocomercialparceiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordocomercialparceiroPK id;

	private int codigoParceiroComercial;

	private int codigoProdutoOperacional;

	private int codigoSituacao;

	private int codigoTipoCategoriaProdutoParceiro;

	private int codigoTipoComposicaoProdutoParceiro;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFimVigenciaAcordo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicioVigenciaAcordo;

	private String indicadorAusenciaFimVigencia;

	private String numeroFuncionalColaboradorConglomeradoAtualizacao;

	//bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@OneToMany(mappedBy="acordocomercialparceiro")
	private List<Acordocomercialcanaldisponivel> acordocomercialcanaldisponivels;

	//bi-directional many-to-one association to Configuracaogeralservicoarrecadacao
	@OneToMany(mappedBy="acordocomercialparceiro")
	private List<Configuracaogeralservicoarrecadacao> configuracaogeralservicoarrecadacaos;

	//bi-directional many-to-one association to Containtermediariaacordocomercial
	@OneToMany(mappedBy="acordocomercialparceiro")
	private List<Containtermediariaacordocomercial> containtermediariaacordocomercials;

	//bi-directional many-to-one association to Contarepasse
	@OneToMany(mappedBy="acordocomercialparceiro")
	private List<Contarepasse> contarepasses;

	public Acordocomercialparceiro() {
	}

	public AcordocomercialparceiroPK getId() {
		return this.id;
	}

	public void setId(AcordocomercialparceiroPK id) {
		this.id = id;
	}

	public int getCodigoParceiroComercial() {
		return this.codigoParceiroComercial;
	}

	public void setCodigoParceiroComercial(int codigoParceiroComercial) {
		this.codigoParceiroComercial = codigoParceiroComercial;
	}

	public int getCodigoProdutoOperacional() {
		return this.codigoProdutoOperacional;
	}

	public void setCodigoProdutoOperacional(int codigoProdutoOperacional) {
		this.codigoProdutoOperacional = codigoProdutoOperacional;
	}

	public int getCodigoSituacao() {
		return this.codigoSituacao;
	}

	public void setCodigoSituacao(int codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public int getCodigoTipoCategoriaProdutoParceiro() {
		return this.codigoTipoCategoriaProdutoParceiro;
	}

	public void setCodigoTipoCategoriaProdutoParceiro(int codigoTipoCategoriaProdutoParceiro) {
		this.codigoTipoCategoriaProdutoParceiro = codigoTipoCategoriaProdutoParceiro;
	}

	public int getCodigoTipoComposicaoProdutoParceiro() {
		return this.codigoTipoComposicaoProdutoParceiro;
	}

	public void setCodigoTipoComposicaoProdutoParceiro(int codigoTipoComposicaoProdutoParceiro) {
		this.codigoTipoComposicaoProdutoParceiro = codigoTipoComposicaoProdutoParceiro;
	}

	public Date getDataFimVigenciaAcordo() {
		return this.dataFimVigenciaAcordo;
	}

	public void setDataFimVigenciaAcordo(Date dataFimVigenciaAcordo) {
		this.dataFimVigenciaAcordo = dataFimVigenciaAcordo;
	}

	public Date getDataInicioVigenciaAcordo() {
		return this.dataInicioVigenciaAcordo;
	}

	public void setDataInicioVigenciaAcordo(Date dataInicioVigenciaAcordo) {
		this.dataInicioVigenciaAcordo = dataInicioVigenciaAcordo;
	}

	public String getIndicadorAusenciaFimVigencia() {
		return this.indicadorAusenciaFimVigencia;
	}

	public void setIndicadorAusenciaFimVigencia(String indicadorAusenciaFimVigencia) {
		this.indicadorAusenciaFimVigencia = indicadorAusenciaFimVigencia;
	}

	public String getNumeroFuncionalColaboradorConglomeradoAtualizacao() {
		return this.numeroFuncionalColaboradorConglomeradoAtualizacao;
	}

	public void setNumeroFuncionalColaboradorConglomeradoAtualizacao(String numeroFuncionalColaboradorConglomeradoAtualizacao) {
		this.numeroFuncionalColaboradorConglomeradoAtualizacao = numeroFuncionalColaboradorConglomeradoAtualizacao;
	}

	public List<Acordocomercialcanaldisponivel> getAcordocomercialcanaldisponivels() {
		return this.acordocomercialcanaldisponivels;
	}

	public void setAcordocomercialcanaldisponivels(List<Acordocomercialcanaldisponivel> acordocomercialcanaldisponivels) {
		this.acordocomercialcanaldisponivels = acordocomercialcanaldisponivels;
	}

	public Acordocomercialcanaldisponivel addAcordocomercialcanaldisponivel(Acordocomercialcanaldisponivel acordocomercialcanaldisponivel) {
		getAcordocomercialcanaldisponivels().add(acordocomercialcanaldisponivel);
		acordocomercialcanaldisponivel.setAcordocomercialparceiro(this);

		return acordocomercialcanaldisponivel;
	}

	public Acordocomercialcanaldisponivel removeAcordocomercialcanaldisponivel(Acordocomercialcanaldisponivel acordocomercialcanaldisponivel) {
		getAcordocomercialcanaldisponivels().remove(acordocomercialcanaldisponivel);
		acordocomercialcanaldisponivel.setAcordocomercialparceiro(null);

		return acordocomercialcanaldisponivel;
	}

	public List<Configuracaogeralservicoarrecadacao> getConfiguracaogeralservicoarrecadacaos() {
		return this.configuracaogeralservicoarrecadacaos;
	}

	public void setConfiguracaogeralservicoarrecadacaos(List<Configuracaogeralservicoarrecadacao> configuracaogeralservicoarrecadacaos) {
		this.configuracaogeralservicoarrecadacaos = configuracaogeralservicoarrecadacaos;
	}

	public Configuracaogeralservicoarrecadacao addConfiguracaogeralservicoarrecadacao(Configuracaogeralservicoarrecadacao configuracaogeralservicoarrecadacao) {
		getConfiguracaogeralservicoarrecadacaos().add(configuracaogeralservicoarrecadacao);
		configuracaogeralservicoarrecadacao.setAcordocomercialparceiro(this);

		return configuracaogeralservicoarrecadacao;
	}

	public Configuracaogeralservicoarrecadacao removeConfiguracaogeralservicoarrecadacao(Configuracaogeralservicoarrecadacao configuracaogeralservicoarrecadacao) {
		getConfiguracaogeralservicoarrecadacaos().remove(configuracaogeralservicoarrecadacao);
		configuracaogeralservicoarrecadacao.setAcordocomercialparceiro(null);

		return configuracaogeralservicoarrecadacao;
	}

	public List<Containtermediariaacordocomercial> getContaintermediariaacordocomercials() {
		return this.containtermediariaacordocomercials;
	}

	public void setContaintermediariaacordocomercials(List<Containtermediariaacordocomercial> containtermediariaacordocomercials) {
		this.containtermediariaacordocomercials = containtermediariaacordocomercials;
	}

	public Containtermediariaacordocomercial addContaintermediariaacordocomercial(Containtermediariaacordocomercial containtermediariaacordocomercial) {
		getContaintermediariaacordocomercials().add(containtermediariaacordocomercial);
		containtermediariaacordocomercial.setAcordocomercialparceiro(this);

		return containtermediariaacordocomercial;
	}

	public Containtermediariaacordocomercial removeContaintermediariaacordocomercial(Containtermediariaacordocomercial containtermediariaacordocomercial) {
		getContaintermediariaacordocomercials().remove(containtermediariaacordocomercial);
		containtermediariaacordocomercial.setAcordocomercialparceiro(null);

		return containtermediariaacordocomercial;
	}

	public List<Contarepasse> getContarepasses() {
		return this.contarepasses;
	}

	public void setContarepasses(List<Contarepasse> contarepasses) {
		this.contarepasses = contarepasses;
	}

	public Contarepasse addContarepass(Contarepasse contarepass) {
		getContarepasses().add(contarepass);
		contarepass.setAcordocomercialparceiro(this);

		return contarepass;
	}

	public Contarepasse removeContarepass(Contarepasse contarepass) {
		getContarepasses().remove(contarepass);
		contarepass.setAcordocomercialparceiro(null);

		return contarepass;
	}

}
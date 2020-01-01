package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the acordocomercialparceiro database table.
 * 
 */
@Entity
@Table(name="acordocomercialparceiro")
@NamedQuery(name="Acordocomercialparceiro.findAll", query="SELECT a FROM Acordocomercialparceiro a")
public class Acordocomercialparceiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordocomercialparceiroPK id;

	@Column(nullable=false)
	private int codigoParceiroComercial;

	@Column(nullable=false)
	private int codigoProdutoOperacional;

	@Column(nullable=false)
	private int codigoSituacao;

	@Column(nullable=false)
	private int codigoTipoCategoriaProdutoParceiro;

	@Column(nullable=false)
	private int codigoTipoComposicaoProdutoParceiro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date dataFimVigenciaAcordo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date dataInicioVigenciaAcordo;

	@Column(nullable=false, length=1)
	private String indicadorAusenciaFimVigencia;

	@Column(nullable=false, length=9)
	private String numeroFuncionalColaboradorConglomeradoAtualizacao;

	//bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@OneToMany(mappedBy="acordocomercialparceiro")
	private List<Acordocomercialcanaldisponivel> acordocomercialcanaldisponivels;

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
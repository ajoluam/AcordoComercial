package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the acordocomercialparceiro database table.
 * 
 */
@Entity
@Table(name = "acordocomercialparceiro")
@NamedQuery(name = "AcordoComercialParceiro.findAll", query = "SELECT a FROM AcordoComercialParceiro a")
public class AcordoComercialParceiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordoComercialParceiroPK id;

	@Column(name = "COD_PACE_COML", nullable = false)
	private Integer codigoParceiroComercial;

	@Column(name = "COD_PROD_OPEL", nullable = false)
	private Integer codigoProdutoOperacional;

	@Column(name = "COD_SITU", nullable = false)
	private Integer codigoSituacao;

	@Column(name = "COD_TIPO_CATE_PROD_PACE", nullable = false)
	private Integer codigoTipoCategoriaProdutoParceiro;

	@Column(name = "COD_TIPO_CPSC_PROD_PACE", nullable = false)
	private Integer codigoTipoComposicaoProdutoParceiro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_FIM_VIGE_ACOR", nullable = false)
	private Date dataFimVigenciaAcordo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DAT_INIO_VIGE_ACOR", nullable = false)
	private Date dataInicioVigenciaAcordo;

	@Column(name = "IND_ASNA_FIM_VIGE", nullable = false, length = 1)
	private String indicadorAusenciaFimVigencia;

	@Column(name = "NUM_FUNL_COLA_COG_ATUA", nullable = false, length = 9)
	private String numeroFuncionalColaboradorConglomeradoAtualizacao;

	// bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@OneToMany(mappedBy = "acordoComercialParceiro")
	private List<AcordoComercialCanalDisponivel> acordoComercialCanalDisponiveis = new ArrayList<>();

	// bi-directional many-to-one association to Contarepasse
	@OneToMany(mappedBy = "acordoComercialParceiro")
	private List<ContaRepasse> contaRepasses = new ArrayList<>();

	public AcordoComercialParceiro() {
	}

	public AcordoComercialParceiroPK getId() {
		return this.id;
	}

	public void setId(AcordoComercialParceiroPK id) {
		this.id = id;
	}

	public Integer getCodigoParceiroComercial() {
		return this.codigoParceiroComercial;
	}

	public void setCodigoParceiroComercial(Integer codigoParceiroComercial) {
		this.codigoParceiroComercial = codigoParceiroComercial;
	}

	public Integer getCodigoProdutoOperacional() {
		return this.codigoProdutoOperacional;
	}

	public void setCodigoProdutoOperacional(Integer codigoProdutoOperacional) {
		this.codigoProdutoOperacional = codigoProdutoOperacional;
	}

	public Integer getCodigoSituacao() {
		return this.codigoSituacao;
	}

	public void setCodigoSituacao(Integer codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public Integer getCodigoTipoCategoriaProdutoParceiro() {
		return this.codigoTipoCategoriaProdutoParceiro;
	}

	public void setCodigoTipoCategoriaProdutoParceiro(Integer codigoTipoCategoriaProdutoParceiro) {
		this.codigoTipoCategoriaProdutoParceiro = codigoTipoCategoriaProdutoParceiro;
	}

	public Integer getCodigoTipoComposicaoProdutoParceiro() {
		return this.codigoTipoComposicaoProdutoParceiro;
	}

	public void setCodigoTipoComposicaoProdutoParceiro(Integer codigoTipoComposicaoProdutoParceiro) {
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

	public void setNumeroFuncionalColaboradorConglomeradoAtualizacao(
			String numeroFuncionalColaboradorConglomeradoAtualizacao) {
		this.numeroFuncionalColaboradorConglomeradoAtualizacao = numeroFuncionalColaboradorConglomeradoAtualizacao;
	}

	public List<AcordoComercialCanalDisponivel> getAcordoComercialCanalDisponiveis() {
		return this.acordoComercialCanalDisponiveis;
	}

	public void setAcordocomercialcanaldisponivels(
			List<AcordoComercialCanalDisponivel> acordoComercialCanalDisponiveis) {
		this.acordoComercialCanalDisponiveis = acordoComercialCanalDisponiveis;
	}

	public AcordoComercialCanalDisponivel addAcordocomercialcanaldisponivel(
			AcordoComercialCanalDisponivel acordoComercialCanalDisponivel) {
		getAcordoComercialCanalDisponiveis().add(acordoComercialCanalDisponivel);
		acordoComercialCanalDisponivel.setAcordocomercialparceiro(this);

		return acordoComercialCanalDisponivel;
	}

	public AcordoComercialCanalDisponivel removeAcordocomercialcanaldisponivel(
			AcordoComercialCanalDisponivel acordoComercialCanalDisponivel) {
		getAcordoComercialCanalDisponiveis().remove(acordoComercialCanalDisponivel);
		acordoComercialCanalDisponivel.setAcordocomercialparceiro(null);

		return acordoComercialCanalDisponivel;
	}

	public List<ContaRepasse> getContaRepasses() {
		return this.contaRepasses;
	}

	public void setContarepasses(List<ContaRepasse> contaRepasses) {
		this.contaRepasses = contaRepasses;
	}

	public ContaRepasse addContarepass(ContaRepasse contaRepasses) {
		getContaRepasses().add(contaRepasses);
		contaRepasses.setAcordocomercialparceiro(this);

		return contaRepasses;
	}

	public ContaRepasse removeContarepass(ContaRepasse contaRepasses) {
		getContaRepasses().remove(contaRepasses);
		contaRepasses.setAcordocomercialparceiro(null);

		return contaRepasses;
	}

}
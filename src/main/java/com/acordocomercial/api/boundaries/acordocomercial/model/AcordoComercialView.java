package com.acordocomercial.api.boundaries.acordocomercial.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class AcordoComercialView implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer numeroAcordoComercialParceiro;
	private Integer numeroVersaoAcordoComercial;
	private Integer codigoParceiroComercial;
	private Integer codigoProdutoOperacional;
	private Integer codigoSituacao;
	private Integer codigoTipoCategoriaProdutoParceiro;
	private Integer codigoTipoComposicaoProdutoParceiro;
	private Date dataFimVigenciaAcordo;
	private Date dataInicioVigenciaAcordo;
	private String indicadorAusenciaFimVigencia;
	private String numeroFuncionalColaboradorConglomeradoAtualizacao;
	
	
	public AcordoComercialView() {
		
	}
	
	public Integer getNumeroAcordoComercialParceiro() {
		return numeroAcordoComercialParceiro;
	}
	public Integer getNumeroVersaoAcordoComercial() {
		return numeroVersaoAcordoComercial;
	}
	public Integer getCodigoParceiroComercial() {
		return codigoParceiroComercial;
	}
	public Integer getCodigoProdutoOperacional() {
		return codigoProdutoOperacional;
	}
	public Integer getCodigoSituacao() {
		return codigoSituacao;
	}
	public Integer getCodigoTipoCategoriaProdutoParceiro() {
		return codigoTipoCategoriaProdutoParceiro;
	}
	public Integer getCodigoTipoComposicaoProdutoParceiro() {
		return codigoTipoComposicaoProdutoParceiro;
	}
	public Date getDataFimVigenciaAcordo() {
		return dataFimVigenciaAcordo;
	}
	public Date getDataInicioVigenciaAcordo() {
		return dataInicioVigenciaAcordo;
	}
	public String getIndicadorAusenciaFimVigencia() {
		return indicadorAusenciaFimVigencia;
	}
	public String getNumeroFuncionalColaboradorConglomeradoAtualizacao() {
		return numeroFuncionalColaboradorConglomeradoAtualizacao;
	}
	public AcordoComercialView(Integer numeroAcordoComercialParceiro, Integer numeroVersaoAcordoComercial,
			Integer codigoParceiroComercial, Integer codigoProdutoOperacional, Integer codigoSituacao,
			Integer codigoTipoCategoriaProdutoParceiro, Integer codigoTipoComposicaoProdutoParceiro,
			Date dataFimVigenciaAcordo, Date dataInicioVigenciaAcordo, String indicadorAusenciaFimVigencia,
			String numeroFuncionalColaboradorConglomeradoAtualizacao) {
		super();
		this.numeroAcordoComercialParceiro = numeroAcordoComercialParceiro;
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
		this.codigoParceiroComercial = codigoParceiroComercial;
		this.codigoProdutoOperacional = codigoProdutoOperacional;
		this.codigoSituacao = codigoSituacao;
		this.codigoTipoCategoriaProdutoParceiro = codigoTipoCategoriaProdutoParceiro;
		this.codigoTipoComposicaoProdutoParceiro = codigoTipoComposicaoProdutoParceiro;
		this.dataFimVigenciaAcordo = dataFimVigenciaAcordo;
		this.dataInicioVigenciaAcordo = dataInicioVigenciaAcordo;
		this.indicadorAusenciaFimVigencia = indicadorAusenciaFimVigencia;
		this.numeroFuncionalColaboradorConglomeradoAtualizacao = numeroFuncionalColaboradorConglomeradoAtualizacao;
	}
	public void setNumeroAcordoComercialParceiro(Integer numeroAcordoComercialParceiro) {
		this.numeroAcordoComercialParceiro = numeroAcordoComercialParceiro;
	}
	public void setNumeroVersaoAcordoComercial(Integer numeroVersaoAcordoComercial) {
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
	}
	public void setCodigoParceiroComercial(Integer codigoParceiroComercial) {
		this.codigoParceiroComercial = codigoParceiroComercial;
	}
	public void setCodigoProdutoOperacional(Integer codigoProdutoOperacional) {
		this.codigoProdutoOperacional = codigoProdutoOperacional;
	}
	public void setCodigoSituacao(Integer codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}
	public void setCodigoTipoCategoriaProdutoParceiro(Integer codigoTipoCategoriaProdutoParceiro) {
		this.codigoTipoCategoriaProdutoParceiro = codigoTipoCategoriaProdutoParceiro;
	}
	public void setCodigoTipoComposicaoProdutoParceiro(Integer codigoTipoComposicaoProdutoParceiro) {
		this.codigoTipoComposicaoProdutoParceiro = codigoTipoComposicaoProdutoParceiro;
	}
	public void setDataFimVigenciaAcordo(Date dataFimVigenciaAcordo) {
		this.dataFimVigenciaAcordo = dataFimVigenciaAcordo;
	}
	public void setDataInicioVigenciaAcordo(Date dataInicioVigenciaAcordo) {
		this.dataInicioVigenciaAcordo = dataInicioVigenciaAcordo;
	}
	public void setIndicadorAusenciaFimVigencia(String indicadorAusenciaFimVigencia) {
		this.indicadorAusenciaFimVigencia = indicadorAusenciaFimVigencia;
	}
	public void setNumeroFuncionalColaboradorConglomeradoAtualizacao(
			String numeroFuncionalColaboradorConglomeradoAtualizacao) {
		this.numeroFuncionalColaboradorConglomeradoAtualizacao = numeroFuncionalColaboradorConglomeradoAtualizacao;
	}
	
}

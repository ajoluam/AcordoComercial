package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the containtermediariaacordocomercial database
 * table.
 * 
 */
@Entity
@Table(name = "containtermediariaacordocomercial")
@NamedQuery(name = "ContaIntermediariaAcordoComercial.findAll", query = "SELECT c FROM ContaIntermediariaAcordoComercial c")
public class ContaIntermediariaAcordoComercial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_CONT_INTM_ACOR_COML", unique = true, nullable = false)
	private Integer codigoContaIntermediariaAcordoComercial;

	@Column(name = "COD_BANCO", nullable = false, length = 3)
	private String codigoEmpresaConglomerado;

	@Column(name = "TPEMPRES", nullable = false, length = 3)
	private String codigoTipoEmpresaConglomerado;

	@Column(name = "NUM_ACOR_COML_PACE", nullable = false)
	private Integer numeroAcordoComercialParceiro;

	@Column(name = "CONTA", nullable = false, length = 7)
	private String numeroConta;

	@Column(name = "DAC10", nullable = false, length = 1)
	private String numeroDigitoVerificadorConta;

	@Column(name = "AGENCIA", nullable = false, length = 4)
	private String numeroUnidadeAtendimentoConglomerado;

	@Column(name = "NUM_VERS_ACOR_COML", nullable = false)
	private Integer numeroVersaoAcordoComercial;

	public ContaIntermediariaAcordoComercial() {
	}

	public Integer getCodigoContaIntermediariaAcordoComercial() {
		return this.codigoContaIntermediariaAcordoComercial;
	}

	public void setCodigoContaIntermediariaAcordoComercial(Integer codigoContaIntermediariaAcordoComercial) {
		this.codigoContaIntermediariaAcordoComercial = codigoContaIntermediariaAcordoComercial;
	}

	public String getCodigoEmpresaConglomerado() {
		return this.codigoEmpresaConglomerado;
	}

	public void setCodigoEmpresaConglomerado(String codigoEmpresaConglomerado) {
		this.codigoEmpresaConglomerado = codigoEmpresaConglomerado;
	}

	public String getCodigoTipoEmpresaConglomerado() {
		return this.codigoTipoEmpresaConglomerado;
	}

	public void setCodigoTipoEmpresaConglomerado(String codigoTipoEmpresaConglomerado) {
		this.codigoTipoEmpresaConglomerado = codigoTipoEmpresaConglomerado;
	}

	public Integer getNumeroAcordoComercialParceiro() {
		return this.numeroAcordoComercialParceiro;
	}

	public void setNumeroAcordoComercialParceiro(Integer numeroAcordoComercialParceiro) {
		this.numeroAcordoComercialParceiro = numeroAcordoComercialParceiro;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroDigitoVerificadorConta() {
		return this.numeroDigitoVerificadorConta;
	}

	public void setNumeroDigitoVerificadorConta(String numeroDigitoVerificadorConta) {
		this.numeroDigitoVerificadorConta = numeroDigitoVerificadorConta;
	}

	public String getNumeroUnidadeAtendimentoConglomerado() {
		return this.numeroUnidadeAtendimentoConglomerado;
	}

	public void setNumeroUnidadeAtendimentoConglomerado(String numeroUnidadeAtendimentoConglomerado) {
		this.numeroUnidadeAtendimentoConglomerado = numeroUnidadeAtendimentoConglomerado;
	}

	public Integer getNumeroVersaoAcordoComercial() {
		return this.numeroVersaoAcordoComercial;
	}

	public void setNumeroVersaoAcordoComercial(Integer numeroVersaoAcordoComercial) {
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
	}

}
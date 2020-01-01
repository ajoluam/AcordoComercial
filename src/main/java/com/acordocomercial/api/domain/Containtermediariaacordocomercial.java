package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the containtermediariaacordocomercial database table.
 * 
 */
@Entity
@Table(name="containtermediariaacordocomercial")
@NamedQuery(name="Containtermediariaacordocomercial.findAll", query="SELECT c FROM Containtermediariaacordocomercial c")
public class Containtermediariaacordocomercial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int codigoContaIntermediariaAcordoComercial;

	@Column(nullable=false, length=3)
	private String codigoEmpresaConglomerado;

	@Column(nullable=false, length=3)
	private String codigoTipoEmpresaConglomerado;

	@Column(nullable=false)
	private int numeroAcordoComercialParceiro;

	@Column(nullable=false, length=7)
	private String numeroConta;

	@Column(nullable=false, length=1)
	private String numeroDigitoVerificadorConta;

	@Column(nullable=false, length=4)
	private String numeroUnidadeAtendimentoConglomerado;

	@Column(nullable=false)
	private int numeroVersaoAcordoComercial;

	public Containtermediariaacordocomercial() {
	}

	public int getCodigoContaIntermediariaAcordoComercial() {
		return this.codigoContaIntermediariaAcordoComercial;
	}

	public void setCodigoContaIntermediariaAcordoComercial(int codigoContaIntermediariaAcordoComercial) {
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

	public int getNumeroAcordoComercialParceiro() {
		return this.numeroAcordoComercialParceiro;
	}

	public void setNumeroAcordoComercialParceiro(int numeroAcordoComercialParceiro) {
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

	public int getNumeroVersaoAcordoComercial() {
		return this.numeroVersaoAcordoComercial;
	}

	public void setNumeroVersaoAcordoComercial(int numeroVersaoAcordoComercial) {
		this.numeroVersaoAcordoComercial = numeroVersaoAcordoComercial;
	}

}
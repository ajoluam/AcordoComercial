package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the containtermediariaacordocomercial database table.
 * 
 */
@Entity
@NamedQuery(name="Containtermediariaacordocomercial.findAll", query="SELECT c FROM Containtermediariaacordocomercial c")
public class Containtermediariaacordocomercial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codContaIntermAcordoComercial;

	private String codigoEmpresaConglomerado;

	private String codigoTipoEmpresaConglomerado;

	private String numeroConta;

	private String numeroDigitoVerificadorConta;

	private String numeroUnidadeAtendimentoConglomerado;

	//bi-directional many-to-one association to Acordocomercialparceiro
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro"),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial")
		})
	private Acordocomercialparceiro acordocomercialparceiro;

	public Containtermediariaacordocomercial() {
	}

	public int getCodContaIntermAcordoComercial() {
		return this.codContaIntermAcordoComercial;
	}

	public void setCodContaIntermAcordoComercial(int codContaIntermAcordoComercial) {
		this.codContaIntermAcordoComercial = codContaIntermAcordoComercial;
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

	public Acordocomercialparceiro getAcordocomercialparceiro() {
		return this.acordocomercialparceiro;
	}

	public void setAcordocomercialparceiro(Acordocomercialparceiro acordocomercialparceiro) {
		this.acordocomercialparceiro = acordocomercialparceiro;
	}

}
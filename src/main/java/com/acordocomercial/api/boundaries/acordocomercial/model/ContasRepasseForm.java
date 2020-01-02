
package com.acordocomercial.api.boundaries.acordocomercial.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContasRepasseForm {

	@JsonProperty("codigo_banco")
	private String codigoBanco;
	@JsonProperty("numero_agencia")
	private String numeroAgencia;
	@JsonProperty("numero_conta")
	private String numeroConta;
	@JsonProperty("digito_verificador")
	private String digitoVerificador;
	@JsonProperty("percentual_rateio")
	private Double percentualRateio;
	@JsonProperty("codigo_mensagem_spb")
	private String codigoMensagemSpb;
	@JsonProperty("codigo_finalidade")
	private String codigoFinalidade;

	public ContasRepasseForm() {
	}

	public ContasRepasseForm(String codigoBanco, String numeroAgencia, String numeroConta, String digitoVerificador,
			Double percentualRateio, String codigoMensagemSpb, String codigoFinalidade) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.digitoVerificador = digitoVerificador;
		this.percentualRateio = percentualRateio;
		this.codigoMensagemSpb = codigoMensagemSpb;
		this.codigoFinalidade = codigoFinalidade;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Double getPercentualRateio() {
		return percentualRateio;
	}

	public void setPercentualRateio(Double percentualRateio) {
		this.percentualRateio = percentualRateio;
	}

	public String getCodigoMensagemSpb() {
		return codigoMensagemSpb;
	}

	public void setCodigoMensagemSpb(String codigoMensagemSpb) {
		this.codigoMensagemSpb = codigoMensagemSpb;
	}

	public String getCodigoFinalidade() {
		return codigoFinalidade;
	}

	public void setCodigoFinalidade(String codigoFinalidade) {
		this.codigoFinalidade = codigoFinalidade;
	}

}


package com.acordocomercial.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContaIntermediariaForm {

    @JsonProperty("codigo_empresa")
    private String codigoEmpresa;
    @JsonProperty("codigo_banco")
    private String codigoBanco;
    @JsonProperty("numero_agencia")
    private String numeroAgencia;
    @JsonProperty("numero_conta")
    private String numeroConta;
    @JsonProperty("digito_verificador")
    private String digitoVerificador;

    public ContaIntermediariaForm() {
    }

    public ContaIntermediariaForm(String codigoEmpresa, String codigoBanco, String numeroAgencia, String numeroConta, String digitoVerificador) {
        super();
        this.codigoEmpresa = codigoEmpresa;
        this.codigoBanco = codigoBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.digitoVerificador = digitoVerificador;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
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

}

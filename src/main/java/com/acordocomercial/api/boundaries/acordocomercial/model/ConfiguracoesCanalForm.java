
package com.acordocomercial.api.boundaries.acordocomercial.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfiguracoesCanalForm {

    @JsonProperty("id_canal")
    private String idCanal;
    @JsonProperty("situacao")
    private String situacao;
    @JsonProperty("valor_tarifa")
    private Double valorTarifa;
    @JsonProperty("tipo_valor")
    private String tipoValor;
    @JsonProperty("quantidade_dias_floating")
    private Integer quantidadeDiasFloating;
    @JsonProperty("meios_pagamento")
    private List<MeiosPagamentoForm> meiosPagamento = new ArrayList<MeiosPagamentoForm>();

    public ConfiguracoesCanalForm() {
    }

    public ConfiguracoesCanalForm(String idCanal, String situacao, Double valorTarifa, String tipoValor, Integer quantidadeDiasFloating, List<MeiosPagamentoForm> meiosPagamento) {
        super();
        this.idCanal = idCanal;
        this.situacao = situacao;
        this.valorTarifa = valorTarifa;
        this.tipoValor = tipoValor;
        this.quantidadeDiasFloating = quantidadeDiasFloating;
        this.meiosPagamento = meiosPagamento;
    }

    public String getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(String idCanal) {
        this.idCanal = idCanal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(Double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    public Integer getQuantidadeDiasFloating() {
        return quantidadeDiasFloating;
    }

    public void setQuantidadeDiasFloating(Integer quantidadeDiasFloating) {
        this.quantidadeDiasFloating = quantidadeDiasFloating;
    }

    public List<MeiosPagamentoForm> getMeiosPagamento() {
        return meiosPagamento;
    }

    public void setMeiosPagamento(List<MeiosPagamentoForm> meiosPagamento) {
        this.meiosPagamento = meiosPagamento;
    }

}

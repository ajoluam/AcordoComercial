
package com.acordocomercial.api.boundaries.acordocomercial.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfiguracaoServicoArrecadacaoForm {

    @JsonProperty("codigo_tipo_debito_tarifa")
    private Integer codigoTipoDebitoTarifa;
    @JsonProperty("tipo_debito_tarifa")
    private String tipoDebitoTarifa;
    @JsonProperty("data_fim_vigencia")
    private String dataFimVigencia;
    @JsonProperty("codigo_indice_correcao")
    private Integer codigoIndiceCorrecao;
    @JsonProperty("indice_correcao")
    private String indiceCorrecao;

    public ConfiguracaoServicoArrecadacaoForm() {
    }

    public ConfiguracaoServicoArrecadacaoForm(Integer codigoTipoDebitoTarifa, String tipoDebitoTarifa, String dataFimVigencia, Integer codigoIndiceCorrecao, String indiceCorrecao) {
        super();
        this.codigoTipoDebitoTarifa = codigoTipoDebitoTarifa;
        this.tipoDebitoTarifa = tipoDebitoTarifa;
        this.dataFimVigencia = dataFimVigencia;
        this.codigoIndiceCorrecao = codigoIndiceCorrecao;
        this.indiceCorrecao = indiceCorrecao;
    }

    public Integer getCodigoTipoDebitoTarifa() {
        return codigoTipoDebitoTarifa;
    }

    public void setCodigoTipoDebitoTarifa(Integer codigoTipoDebitoTarifa) {
        this.codigoTipoDebitoTarifa = codigoTipoDebitoTarifa;
    }

    public String getTipoDebitoTarifa() {
        return tipoDebitoTarifa;
    }

    public void setTipoDebitoTarifa(String tipoDebitoTarifa) {
        this.tipoDebitoTarifa = tipoDebitoTarifa;
    }

    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public Integer getCodigoIndiceCorrecao() {
        return codigoIndiceCorrecao;
    }

    public void setCodigoIndiceCorrecao(Integer codigoIndiceCorrecao) {
        this.codigoIndiceCorrecao = codigoIndiceCorrecao;
    }

    public String getIndiceCorrecao() {
        return indiceCorrecao;
    }

    public void setIndiceCorrecao(String indiceCorrecao) {
        this.indiceCorrecao = indiceCorrecao;
    }

}

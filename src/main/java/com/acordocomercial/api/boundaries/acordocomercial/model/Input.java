
package com.acordocomercial.api.boundaries.acordocomercial.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Input {

    @JsonProperty("id_parceiro")
    private Integer idParceiro;
    @JsonProperty("id_categoria")
    private Integer idCategoria;
    @JsonProperty("id_composicao")
    private Integer idComposicao;
    @JsonProperty("id_produto")
    private Integer idProduto;
    @JsonProperty("situacao")
    private String situacao;
    @JsonProperty("data_inicio_vigencia")
    private String dataInicioVigencia;
    @JsonProperty("ausencia_fim_vigencia")
    private Boolean ausenciaFimVigencia;
    @JsonProperty("data_fim_vigencia")
    private String dataFimVigencia;
    @JsonProperty("contas_repasse")
    private List<ContasRepasseForm> contasRepasse = new ArrayList<ContasRepasseForm>();
    @JsonProperty("conta_intermediaria")
    private ContaIntermediariaForm contaIntermediaria;
    @JsonProperty("configuracao_servico_arrecadacao")
    private ConfiguracaoServicoArrecadacaoForm configuracaoServicoArrecadacao;
    @JsonProperty("configuracoes_canal")
    private List<ConfiguracoesCanalForm> configuracoesCanal = new ArrayList<ConfiguracoesCanalForm>();

    public Input() {
    }

    public Input(Integer idParceiro, Integer idCategoria, Integer idComposicao, Integer idProduto, String situacao, String dataInicioVigencia, Boolean ausenciaFimVigencia, String dataFimVigencia, List<ContasRepasseForm> contasRepasse, ContaIntermediariaForm contaIntermediaria, ConfiguracaoServicoArrecadacaoForm configuracaoServicoArrecadacao, List<ConfiguracoesCanalForm> configuracoesCanal) {
        super();
        this.idParceiro = idParceiro;
        this.idCategoria = idCategoria;
        this.idComposicao = idComposicao;
        this.idProduto = idProduto;
        this.situacao = situacao;
        this.dataInicioVigencia = dataInicioVigencia;
        this.ausenciaFimVigencia = ausenciaFimVigencia;
        this.dataFimVigencia = dataFimVigencia;
        this.contasRepasse = contasRepasse;
        this.contaIntermediaria = contaIntermediaria;
        this.configuracaoServicoArrecadacao = configuracaoServicoArrecadacao;
        this.configuracoesCanal = configuracoesCanal;
    }

    public Integer getIdParceiro() {
        return idParceiro;
    }

    public void setIdParceiro(Integer idParceiro) {
        this.idParceiro = idParceiro;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(Integer idComposicao) {
        this.idComposicao = idComposicao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    public void setDataInicioVigencia(String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }

    public Boolean getAusenciaFimVigencia() {
        return ausenciaFimVigencia;
    }

    public void setAusenciaFimVigencia(Boolean ausenciaFimVigencia) {
        this.ausenciaFimVigencia = ausenciaFimVigencia;
    }

    public String getDataFimVigencia() {
        return dataFimVigencia;
    }

    public void setDataFimVigencia(String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }

    public List<ContasRepasseForm> getContasRepasse() {
        return contasRepasse;
    }

    public void setContasRepasse(List<ContasRepasseForm> contasRepasse) {
        this.contasRepasse = contasRepasse;
    }

    public ContaIntermediariaForm getContaIntermediaria() {
        return contaIntermediaria;
    }

    public void setContaIntermediaria(ContaIntermediariaForm contaIntermediaria) {
        this.contaIntermediaria = contaIntermediaria;
    }

    public ConfiguracaoServicoArrecadacaoForm getConfiguracaoServicoArrecadacao() {
        return configuracaoServicoArrecadacao;
    }

    public void setConfiguracaoServicoArrecadacao(ConfiguracaoServicoArrecadacaoForm configuracaoServicoArrecadacao) {
        this.configuracaoServicoArrecadacao = configuracaoServicoArrecadacao;
    }

    public List<ConfiguracoesCanalForm> getConfiguracoesCanal() {
        return configuracoesCanal;
    }

    public void setConfiguracoesCanal(List<ConfiguracoesCanalForm> configuracoesCanal) {
        this.configuracoesCanal = configuracoesCanal;
    }

}

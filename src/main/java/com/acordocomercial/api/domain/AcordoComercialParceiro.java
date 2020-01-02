package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the acordocomercialparceiro database table.
 * 
 */
@Entity
@Table(name="acordocomercialparceiro")
@NamedQuery(name="AcordoComercialParceiro.findAll", query="SELECT a FROM AcordoComercialParceiro a")
public class AcordoComercialParceiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordoComercialParceiroPK id;

	@Column(name="COD_PACE_COML", nullable=false)
	private int codigoParceiroComercial;

	@Column(name="COD_PROD_OPEL", nullable=false)
	private int codigoProdutoOperacional;

	@Column(name="COD_SITU", nullable=false)
	private int codigoSituacao;

	@Column(name="COD_TIPO_CATE_PROD_PACE", nullable=false)
	private int codigoTipoCategoriaProdutoParceiro;

	@Column(name="COD_TIPO_CPSC_PROD_PACE", nullable=false)
	private int codigoTipoComposicaoProdutoParceiro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DAT_FIM_VIGE_ACOR", nullable=false)
	private Date dataFimVigenciaAcordo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DAT_INIO_VIGE_ACOR", nullable=false)
	private Date dataInicioVigenciaAcordo;

	@Column(name="IND_ASNA_FIM_VIGE", nullable=false, length=1)
	private String indicadorAusenciaFimVigencia;

	@Column(name="NUM_FUNL_COLA_COG_ATUA", nullable=false, length=9)
	private String numeroFuncionalColaboradorConglomeradoAtualizacao;

	//bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@OneToMany(mappedBy="acordoComercialParceiro")
	private List<AcordoComercialCanalDisponivel> acordoComercialCanalDisponiveis;

	//bi-directional many-to-one association to Contarepasse
	@OneToMany(mappedBy="acordoComercialParceiro")
	private List<ContaRepasse> contaRepasses;

	public AcordoComercialParceiro() {
	}

	public AcordoComercialParceiroPK getId() {
		return this.id;
	}

	public void setId(AcordoComercialParceiroPK id) {
		this.id = id;
	}

	public int getCodigoParceiroComercial() {
		return this.codigoParceiroComercial;
	}

	public void setCodigoParceiroComercial(int codigoParceiroComercial) {
		this.codigoParceiroComercial = codigoParceiroComercial;
	}

	public int getCodigoProdutoOperacional() {
		return this.codigoProdutoOperacional;
	}

	public void setCodigoProdutoOperacional(int codigoProdutoOperacional) {
		this.codigoProdutoOperacional = codigoProdutoOperacional;
	}

	public int getCodigoSituacao() {
		return this.codigoSituacao;
	}

	public void setCodigoSituacao(int codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public int getCodigoTipoCategoriaProdutoParceiro() {
		return this.codigoTipoCategoriaProdutoParceiro;
	}

	public void setCodigoTipoCategoriaProdutoParceiro(int codigoTipoCategoriaProdutoParceiro) {
		this.codigoTipoCategoriaProdutoParceiro = codigoTipoCategoriaProdutoParceiro;
	}

	public int getCodigoTipoComposicaoProdutoParceiro() {
		return this.codigoTipoComposicaoProdutoParceiro;
	}

	public void setCodigoTipoComposicaoProdutoParceiro(int codigoTipoComposicaoProdutoParceiro) {
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

	public void setNumeroFuncionalColaboradorConglomeradoAtualizacao(String numeroFuncionalColaboradorConglomeradoAtualizacao) {
		this.numeroFuncionalColaboradorConglomeradoAtualizacao = numeroFuncionalColaboradorConglomeradoAtualizacao;
	}

	public List<AcordoComercialCanalDisponivel> getAcordoComercialCanalDisponiveis() {
		return this.acordoComercialCanalDisponiveis;
	}

	public void setAcordocomercialcanaldisponivels(List<AcordoComercialCanalDisponivel> acordoComercialCanalDisponiveis) {
		this.acordoComercialCanalDisponiveis = acordoComercialCanalDisponiveis;
	}

	public AcordoComercialCanalDisponivel addAcordocomercialcanaldisponivel(AcordoComercialCanalDisponivel acordoComercialCanalDisponivel) {
		getAcordoComercialCanalDisponiveis().add(acordoComercialCanalDisponivel);
		acordoComercialCanalDisponivel.setAcordocomercialparceiro(this);

		return acordoComercialCanalDisponivel;
	}

	public AcordoComercialCanalDisponivel removeAcordocomercialcanaldisponivel(AcordoComercialCanalDisponivel acordoComercialCanalDisponivel) {
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
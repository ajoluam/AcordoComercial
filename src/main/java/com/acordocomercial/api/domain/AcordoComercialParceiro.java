package com.acordocomercial.api.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

@Entity
@IdClass(AcordoComercialParceiroId.class)
public class AcordoComercialParceiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NUM_ACD_CMRL_PRC")
	@GeneratedValue
	private Integer numAcordoComercialParceiro;

	@Id
	@Column(name = "NUM_VRS_ACD_CMRL")
	private Integer numVersaoAcordoComercial;

	private Integer codSituacao;
	private Integer numFuncionalColaborador;
	private Integer codParceiroComerical;
	
	@OneToMany(mappedBy = "acordoComercialparceiro")
	private List<AcordoComercialCanalDisponivel> acordoComCanalDisponivel = new ArrayList<>();

	public List<AcordoComercialCanalDisponivel> getAcordoComCanalDisponivel() {
		return acordoComCanalDisponivel;
	}

	public void setAcordoComCanalDisponivel(List<AcordoComercialCanalDisponivel> acordoComCanalDisponivel) {
		this.acordoComCanalDisponivel = acordoComCanalDisponivel;
	}

	public Integer getNumAcordoComercialParceiro() {
		return numAcordoComercialParceiro;
	}

	public void setNumAcordoComercialParceiro(Integer numAcordoComercialParceiro) {
		this.numAcordoComercialParceiro = numAcordoComercialParceiro;
	}

	public Integer getNumVersaoAcordoComercial() {
		return numVersaoAcordoComercial;
	}

	public void setNumVersaoAcordoComercial(Integer numVersaoAcordoComercial) {
		this.numVersaoAcordoComercial = numVersaoAcordoComercial;
	}

	public Integer getCodSituacao() {
		return codSituacao;
	}

	public void setCodSituacao(Integer codSituacao) {
		this.codSituacao = codSituacao;
	}

	public Integer getNumFuncionalColaborador() {
		return numFuncionalColaborador;
	}

	public void setNumFuncionalColaborador(Integer numFuncionalColaborador) {
		this.numFuncionalColaborador = numFuncionalColaborador;
	}

	public Integer getCodParceiroComerical() {
		return codParceiroComerical;
	}

	public void setCodParceiroComerical(Integer codParceiroComerical) {
		this.codParceiroComerical = codParceiroComerical;
	}

}

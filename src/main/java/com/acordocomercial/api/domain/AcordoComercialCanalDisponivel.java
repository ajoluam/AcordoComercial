package com.acordocomercial.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(AcordoComercialCanalDisponivelId.class)
public class AcordoComercialCanalDisponivel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	private AcordoComercialParceiro acordoComercialparceiro;	
	
	@Id
	private Integer CodCanalDistribuicao;
	
	private Integer codSituacao;

	public AcordoComercialParceiro getAcordoComercialparceiro() {
		return acordoComercialparceiro;
	}

	public void setAcordoComercialparceiro(AcordoComercialParceiro acordoComercialparceiro) {
		this.acordoComercialparceiro = acordoComercialparceiro;
	}

	public Integer getCodCanalDistribuicao() {
		return CodCanalDistribuicao;
	}

	public void setCodCanalDistribuicao(Integer codCanalDistribuicao) {
		CodCanalDistribuicao = codCanalDistribuicao;
	}

	public Integer getCodSituacao() {
		return codSituacao;
	}

	public void setCodSituacao(Integer codSituacao) {
		this.codSituacao = codSituacao;
	}
	
	
	
	
	

}

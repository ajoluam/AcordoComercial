package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the acordocanalmeiopagamento database table.
 * 
 */
@Entity
@Table(name = "acordocanalmeiopagamento")
@NamedQuery(name = "AcordoCanalMeioPagamento.findAll", query = "SELECT a FROM AcordoCanalMeioPagamento a")
public class AcordoCanalMeioPagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcordoCanalMeioPagamentoPK id;

	// bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "COD_CANA_DTBC", referencedColumnName = "COD_CANA_DTBC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NUM_ACOR_COML_PACE", referencedColumnName = "NUM_ACOR_COML_PACE", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NUM_VERS_ACOR_COML", referencedColumnName = "NUM_VERS_ACOR_COML", nullable = false, insertable = false, updatable = false) })
	private AcordoComercialCanalDisponivel acordoComercialCanalDisponivel;

	public AcordoCanalMeioPagamento() {
	}

	public AcordoCanalMeioPagamentoPK getId() {
		return this.id;
	}

	public void setId(AcordoCanalMeioPagamentoPK id) {
		this.id = id;
	}

	public AcordoComercialCanalDisponivel getAcordocomercialcanaldisponivel() {
		return this.acordoComercialCanalDisponivel;
	}

	public void setAcordocomercialcanaldisponivel(AcordoComercialCanalDisponivel acordoComercialCanalDisponivel) {
		this.acordoComercialCanalDisponivel = acordoComercialCanalDisponivel;
	}

}
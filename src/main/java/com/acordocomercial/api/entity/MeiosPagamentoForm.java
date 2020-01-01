
package com.acordocomercial.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeiosPagamentoForm {

	@JsonProperty("id_meio_pagamento")
	private Integer idMeioPagamento;

	public MeiosPagamentoForm() {
	}

	public MeiosPagamentoForm(Integer idMeioPagamento) {
		super();
		this.idMeioPagamento = idMeioPagamento;
	}

	public Integer getIdMeioPagamento() {
		return idMeioPagamento;
	}

	public void setIdMeioPagamento(Integer idMeioPagamento) {
		this.idMeioPagamento = idMeioPagamento;
	}

}

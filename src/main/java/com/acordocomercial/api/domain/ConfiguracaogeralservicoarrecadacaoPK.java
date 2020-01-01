package com.acordocomercial.api.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the configuracaogeralservicoarrecadacao database table.
 * 
 */
@Embeddable
public class ConfiguracaogeralservicoarrecadacaoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int codigoConfiguracaoGeralServicoArrecadacao;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int codigoTipoDebitoTarifa;

	public ConfiguracaogeralservicoarrecadacaoPK() {
	}
	public int getCodigoConfiguracaoGeralServicoArrecadacao() {
		return this.codigoConfiguracaoGeralServicoArrecadacao;
	}
	public void setCodigoConfiguracaoGeralServicoArrecadacao(int codigoConfiguracaoGeralServicoArrecadacao) {
		this.codigoConfiguracaoGeralServicoArrecadacao = codigoConfiguracaoGeralServicoArrecadacao;
	}
	public int getCodigoTipoDebitoTarifa() {
		return this.codigoTipoDebitoTarifa;
	}
	public void setCodigoTipoDebitoTarifa(int codigoTipoDebitoTarifa) {
		this.codigoTipoDebitoTarifa = codigoTipoDebitoTarifa;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConfiguracaogeralservicoarrecadacaoPK)) {
			return false;
		}
		ConfiguracaogeralservicoarrecadacaoPK castOther = (ConfiguracaogeralservicoarrecadacaoPK)other;
		return 
			(this.codigoConfiguracaoGeralServicoArrecadacao == castOther.codigoConfiguracaoGeralServicoArrecadacao)
			&& (this.codigoTipoDebitoTarifa == castOther.codigoTipoDebitoTarifa);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codigoConfiguracaoGeralServicoArrecadacao;
		hash = hash * prime + this.codigoTipoDebitoTarifa;
		
		return hash;
	}
}
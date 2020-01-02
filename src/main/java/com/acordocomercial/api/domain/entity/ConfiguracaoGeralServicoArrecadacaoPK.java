package com.acordocomercial.api.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the configuracaogeralservicoarrecadacao database
 * table.
 * 
 */
@Embeddable
public class ConfiguracaoGeralServicoArrecadacaoPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "COD_CNFG_GERL_SERV_ARRE", unique = true, nullable = false)
	private Integer codigoConfiguracaoGeralServicoArrecadacao;

	@Column(name = "COD_TIPO_DEBT_TARI", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer codigoTipoDebitoTarifa;

	public ConfiguracaoGeralServicoArrecadacaoPK() {
	}

	public Integer getCodigoConfiguracaoGeralServicoArrecadacao() {
		return this.codigoConfiguracaoGeralServicoArrecadacao;
	}

	public void setCodigoConfiguracaoGeralServicoArrecadacao(Integer codigoConfiguracaoGeralServicoArrecadacao) {
		this.codigoConfiguracaoGeralServicoArrecadacao = codigoConfiguracaoGeralServicoArrecadacao;
	}

	public Integer getCodigoTipoDebitoTarifa() {
		return this.codigoTipoDebitoTarifa;
	}

	public void setCodigoTipoDebitoTarifa(Integer codigoTipoDebitoTarifa) {
		this.codigoTipoDebitoTarifa = codigoTipoDebitoTarifa;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConfiguracaoGeralServicoArrecadacaoPK)) {
			return false;
		}
		ConfiguracaoGeralServicoArrecadacaoPK castOther = (ConfiguracaoGeralServicoArrecadacaoPK) other;
		return (this.codigoConfiguracaoGeralServicoArrecadacao == castOther.codigoConfiguracaoGeralServicoArrecadacao)
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
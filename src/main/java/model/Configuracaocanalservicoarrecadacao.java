package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the configuracaocanalservicoarrecadacao database table.
 * 
 */
@Entity
@NamedQuery(name="Configuracaocanalservicoarrecadacao.findAll", query="SELECT c FROM Configuracaocanalservicoarrecadacao c")
public class Configuracaocanalservicoarrecadacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigoConfiguracaoCanalServicoArrecadacao;

	private int quantidadeDiaFloatingServicoArrecadacao;

	private BigDecimal valorTarifaServicoArrecadacao;

	//bi-directional many-to-one association to Acordocomercialcanaldisponivel
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codigoCanalDistribuicao", referencedColumnName="codigoCanalDistribuicao"),
		@JoinColumn(name="numeroAcordoComercialParceiro", referencedColumnName="numeroAcordoComercialParceiro"),
		@JoinColumn(name="numeroVersaoAcordoComercial", referencedColumnName="numeroVersaoAcordoComercial")
		})
	private Acordocomercialcanaldisponivel acordocomercialcanaldisponivel;

	//bi-directional many-to-one association to Tipovalortarifa
	@ManyToOne
	@JoinColumn(name="codigoTipoValorTarifa")
	private Tipovalortarifa tipovalortarifa;

	public Configuracaocanalservicoarrecadacao() {
	}

	public int getCodigoConfiguracaoCanalServicoArrecadacao() {
		return this.codigoConfiguracaoCanalServicoArrecadacao;
	}

	public void setCodigoConfiguracaoCanalServicoArrecadacao(int codigoConfiguracaoCanalServicoArrecadacao) {
		this.codigoConfiguracaoCanalServicoArrecadacao = codigoConfiguracaoCanalServicoArrecadacao;
	}

	public int getQuantidadeDiaFloatingServicoArrecadacao() {
		return this.quantidadeDiaFloatingServicoArrecadacao;
	}

	public void setQuantidadeDiaFloatingServicoArrecadacao(int quantidadeDiaFloatingServicoArrecadacao) {
		this.quantidadeDiaFloatingServicoArrecadacao = quantidadeDiaFloatingServicoArrecadacao;
	}

	public BigDecimal getValorTarifaServicoArrecadacao() {
		return this.valorTarifaServicoArrecadacao;
	}

	public void setValorTarifaServicoArrecadacao(BigDecimal valorTarifaServicoArrecadacao) {
		this.valorTarifaServicoArrecadacao = valorTarifaServicoArrecadacao;
	}

	public Acordocomercialcanaldisponivel getAcordocomercialcanaldisponivel() {
		return this.acordocomercialcanaldisponivel;
	}

	public void setAcordocomercialcanaldisponivel(Acordocomercialcanaldisponivel acordocomercialcanaldisponivel) {
		this.acordocomercialcanaldisponivel = acordocomercialcanaldisponivel;
	}

	public Tipovalortarifa getTipovalortarifa() {
		return this.tipovalortarifa;
	}

	public void setTipovalortarifa(Tipovalortarifa tipovalortarifa) {
		this.tipovalortarifa = tipovalortarifa;
	}

}
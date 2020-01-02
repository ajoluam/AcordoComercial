package com.acordocomercial.api.boundaries.acordocomercial.converters;

import java.math.BigDecimal;

import org.springframework.core.convert.converter.Converter;

import com.acordocomercial.api.boundaries.acordocomercial.model.ContasRepasseForm;
import com.acordocomercial.api.domain.entity.ContaRepasse;

public class ConverterContasRepasseFormParaDb implements Converter<ContasRepasseForm, ContaRepasse> {

	@Override
	public ContaRepasse convert(ContasRepasseForm source) {
		
		ContaRepasse contaRepasse = new ContaRepasse();
		contaRepasse.setCodigoFinalidadeSistemaPagamentoBrasileiro(source.getCodigoFinalidade());
		contaRepasse.setCodigoMensagemSistemaPagamentoBrasileiro(source.getCodigoMensagemSpb());
		contaRepasse.setPercentualRateioContaRepasseParceiro(BigDecimal.valueOf(source.getPercentualRateio()));
		
		return contaRepasse;
	}

}

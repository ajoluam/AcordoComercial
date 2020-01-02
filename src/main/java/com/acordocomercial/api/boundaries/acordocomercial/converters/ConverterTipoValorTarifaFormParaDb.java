package com.acordocomercial.api.boundaries.acordocomercial.converters;

import org.springframework.core.convert.converter.Converter;

import com.acordocomercial.api.boundaries.acordocomercial.model.ConfiguracoesCanalForm;
import com.acordocomercial.api.domain.entity.TipoValorTarifa;

public class ConverterTipoValorTarifaFormParaDb implements Converter<ConfiguracoesCanalForm, TipoValorTarifa> {

	@Override
	public TipoValorTarifa convert(ConfiguracoesCanalForm source) {

		TipoValorTarifa tipoValorTarifa = new TipoValorTarifa();
		// Não vem nada
		tipoValorTarifa.setCodigoTipoValorTarifa(1);
		tipoValorTarifa.setNomeTipoValorTarifa(source.getTipoValor());

		return tipoValorTarifa;
	}

}

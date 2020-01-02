package com.acordocomercial.api.boundaries.acordocomercial.converters;

import org.springframework.core.convert.converter.Converter;

import com.acordocomercial.api.boundaries.acordocomercial.model.ConfiguracaoServicoArrecadacaoForm;
import com.acordocomercial.api.domain.entity.TipoDebitoTarifa;

public class ConverterTipoDebitoTarifaFormParaDb
		implements Converter<ConfiguracaoServicoArrecadacaoForm, TipoDebitoTarifa> {

	@Override
	public TipoDebitoTarifa convert(ConfiguracaoServicoArrecadacaoForm source) {
		
		TipoDebitoTarifa tipoDebitoTarifa = new TipoDebitoTarifa();
		tipoDebitoTarifa.setCodigoTipoDebitoTarifa(source.getCodigoTipoDebitoTarifa());
		tipoDebitoTarifa.setNomeTipoDebitoTarifa(source.getTipoDebitoTarifa());

		return tipoDebitoTarifa;
	}

}

package com.acordocomercial.api.boundaries.acordocomercial.converters;

import org.springframework.core.convert.converter.Converter;

import com.acordocomercial.api.boundaries.acordocomercial.model.ContaIntermediariaForm;
import com.acordocomercial.api.domain.entity.ContaIntermediariaAcordoComercial;

public class ConverterAcordoComercialFormParaDb implements Converter<ContaIntermediariaForm, ContaIntermediariaAcordoComercial>{

	@Override
	public ContaIntermediariaAcordoComercial convert(ContaIntermediariaForm source) {
		
		ContaIntermediariaAcordoComercial contaIntermediariaAcordoComercial = new ContaIntermediariaAcordoComercial();
		contaIntermediariaAcordoComercial.setCodigoEmpresaConglomerado(source.getCodigoBanco());
		contaIntermediariaAcordoComercial.setCodigoTipoEmpresaConglomerado(source.getCodigoEmpresa());
		contaIntermediariaAcordoComercial.setNumeroConta(source.getNumeroConta());
		contaIntermediariaAcordoComercial.setNumeroUnidadeAtendimentoConglomerado(source.getNumeroAgencia());
		contaIntermediariaAcordoComercial.setNumeroDigitoVerificadorConta(source.getDigitoVerificador());
		
		return contaIntermediariaAcordoComercial;
	}

	
}

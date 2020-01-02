package com.acordocomercial.api.boundaries.acordocomercial.converters;

import java.sql.Date;

import org.springframework.core.convert.converter.Converter;

import com.acordocomercial.api.boundaries.acordocomercial.model.Input;
import com.acordocomercial.api.domain.entity.AcordoComercialParceiro;

public class ConverterContaIntermediariaFormParaDb implements Converter<Input, AcordoComercialParceiro>{

	@Override
	public AcordoComercialParceiro convert(Input source) {
		
		AcordoComercialParceiro acordo = new AcordoComercialParceiro();
		acordo.setCodigoParceiroComercial(source.getIdParceiro());
		acordo.setCodigoProdutoOperacional(source.getIdProduto());
		//vem String, vou colocar 1
		acordo.setCodigoSituacao(1);
		acordo.setCodigoTipoCategoriaProdutoParceiro(source.getIdCategoria());
		acordo.setCodigoTipoComposicaoProdutoParceiro(source.getIdComposicao());
		//Vem String , vou colocar new Date
		acordo.setDataInicioVigenciaAcordo(Date.valueOf(source.getDataInicioVigencia()));
		//Vem String , vou colocar new Date
		acordo.setDataFimVigenciaAcordo(Date.valueOf(source.getDataFimVigencia()));
		//Vem Boolean
		acordo.setIndicadorAusenciaFimVigencia(source.getAusenciaFimVigencia().toString());
		//Não vem nada
		acordo.setNumeroFuncionalColaboradorConglomeradoAtualizacao("12345");
		
		
		return acordo;
	}

}

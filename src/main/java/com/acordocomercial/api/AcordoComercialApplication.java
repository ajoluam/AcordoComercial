package com.acordocomercial.api;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acordocomercial.api.boundaries.acordocomercial.repositories.AcordoCanalMeioPagamentoRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.AcordoComercialCanalDisponivelRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.AcordoComercialParceiroRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.ConfiguracaoCanalServicoArrecadacaoRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.ConfiguracaoGeralServicoArrecadacaoRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.ContaIntermediariaAcordoComercialRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.ContaRepasseRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.TipoDebitoTarifaRepository;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.TipoValorTarifaRepository;
import com.acordocomercial.api.domain.entity.AcordoCanalMeioPagamento;
import com.acordocomercial.api.domain.entity.AcordoCanalMeioPagamentoPK;
import com.acordocomercial.api.domain.entity.AcordoComercialCanalDisponivel;
import com.acordocomercial.api.domain.entity.AcordoComercialCanalDisponivelPK;
import com.acordocomercial.api.domain.entity.AcordoComercialParceiro;
import com.acordocomercial.api.domain.entity.AcordoComercialParceiroPK;
import com.acordocomercial.api.domain.entity.ConfiguracaoCanalServicoArrecadacao;
import com.acordocomercial.api.domain.entity.ConfiguracaoGeralServicoArrecadacao;
import com.acordocomercial.api.domain.entity.ConfiguracaoGeralServicoArrecadacaoPK;
import com.acordocomercial.api.domain.entity.ContaIntermediariaAcordoComercial;
import com.acordocomercial.api.domain.entity.ContaRepasse;
import com.acordocomercial.api.domain.entity.ContaRepassePK;
import com.acordocomercial.api.domain.entity.TipoDebitoTarifa;
import com.acordocomercial.api.domain.entity.TipoValorTarifa;

@SpringBootApplication
public class AcordoComercialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AcordoComercialApplication.class, args);
	}

	@Autowired
	AcordoCanalMeioPagamentoRepository acordoCanalMeioPagamentoRepository;
	
	@Autowired
	AcordoComercialCanalDisponivelRepository acordoComercialCanalDisponivelRepository;
	
	@Autowired
	AcordoComercialParceiroRepository acordoComercialParceiroRepository;
	
	@Autowired
	ConfiguracaoCanalServicoArrecadacaoRepository configuracaoCanalServicoArrecadacaoRepository;
	
	@Autowired
	ConfiguracaoGeralServicoArrecadacaoRepository configuracaoGeralServicoArrecadacaoRepository;
	
	@Autowired
	ContaIntermediariaAcordoComercialRepository contaIntermediariaAcordoComercialRepository;
	
	@Autowired
	ContaRepasseRepository contaRepasseRepository;
	
	@Autowired
	TipoDebitoTarifaRepository tipoDebitoTarifaRepository;
	
	@Autowired
	TipoValorTarifaRepository tipoValorTarifaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		

		AcordoComercialParceiro acordoComercialParceiro = new AcordoComercialParceiro();

		acordoComercialParceiro.setCodigoParceiroComercial(1);
		acordoComercialParceiro.setCodigoProdutoOperacional(1);
		acordoComercialParceiro.setCodigoSituacao(1);
		acordoComercialParceiro.setCodigoTipoCategoriaProdutoParceiro(1);
		acordoComercialParceiro.setCodigoTipoComposicaoProdutoParceiro(1);
		acordoComercialParceiro.setDataFimVigenciaAcordo(Date.valueOf("2020-11-21"));
		acordoComercialParceiro.setDataInicioVigenciaAcordo(Date.valueOf("2019-11-21"));
		acordoComercialParceiro.setIndicadorAusenciaFimVigencia("f");
		acordoComercialParceiro.setNumeroFuncionalColaboradorConglomeradoAtualizacao("1321");
		
		AcordoComercialParceiroPK id = new AcordoComercialParceiroPK();
		id.setNumeroAcordoComercialParceiro(11111);
		id.setNumeroVersaoAcordoComercial(1);
		acordoComercialParceiro.setId(id);
		
		acordoComercialParceiro = acordoComercialParceiroRepository.save(acordoComercialParceiro);
		
		
		AcordoComercialCanalDisponivelPK acordoComercialCanalDisponivelPK = new AcordoComercialCanalDisponivelPK();
		acordoComercialCanalDisponivelPK.setCodigoCanalDistribuicao("C1");
		acordoComercialCanalDisponivelPK.setNumeroAcordoComercialParceiro(id.getNumeroAcordoComercialParceiro());
		acordoComercialCanalDisponivelPK.setNumeroVersaoAcordoComercial(id.getNumeroVersaoAcordoComercial());
		AcordoComercialCanalDisponivel acordoComercialCanalDisponivel = new AcordoComercialCanalDisponivel();
		acordoComercialCanalDisponivel.setAcordocomercialparceiro(acordoComercialParceiro);
		acordoComercialCanalDisponivel.setCodigoSituacao(1);
		acordoComercialCanalDisponivel.setId(acordoComercialCanalDisponivelPK);

		acordoComercialCanalDisponivel = acordoComercialCanalDisponivelRepository.save(acordoComercialCanalDisponivel);
		
		TipoValorTarifa tipoValorTarifa = new TipoValorTarifa();
		tipoValorTarifa.setCodigoTipoValorTarifa(1);
		tipoValorTarifa.setNomeTipoValorTarifa("real");
		tipoValorTarifa = tipoValorTarifaRepository.save(tipoValorTarifa);
		
		ConfiguracaoCanalServicoArrecadacao configuracaoCanalServicoArrecadacao = new ConfiguracaoCanalServicoArrecadacao();
		configuracaoCanalServicoArrecadacao.setQuantidadeDiaFloatingServicoArrecadacao(0);
		configuracaoCanalServicoArrecadacao.setValorTarifaServicoArrecadacao(BigDecimal.valueOf(30.0));
		configuracaoCanalServicoArrecadacao.setAcordocomercialcanaldisponivel(acordoComercialCanalDisponivel);
		configuracaoCanalServicoArrecadacao.setTipovalortarifa(tipoValorTarifa);
		List<ConfiguracaoCanalServicoArrecadacao> configuracaoCanalServicoArrecadacoes = new ArrayList<>();
		acordoComercialCanalDisponivel.setConfiguracaocanalservicoarrecadacaos(configuracaoCanalServicoArrecadacoes);
		
		configuracaoCanalServicoArrecadacao = configuracaoCanalServicoArrecadacaoRepository.save(configuracaoCanalServicoArrecadacao);
		
		AcordoCanalMeioPagamentoPK acordoCanalMeioPagamentoPK = new AcordoCanalMeioPagamentoPK();
		acordoCanalMeioPagamentoPK.setCodigoCanalDistribuicao(acordoComercialCanalDisponivelPK.getCodigoCanalDistribuicao());
		acordoCanalMeioPagamentoPK.setCodigoTipoMeioPagamento(1);
		acordoCanalMeioPagamentoPK.setNumeroAcordoComercialParceiro(id.getNumeroAcordoComercialParceiro());
		acordoCanalMeioPagamentoPK.setNumeroVersaoAcordoComercial(id.getNumeroVersaoAcordoComercial());
		
		AcordoCanalMeioPagamento acordoCanalMeioPagamento = new AcordoCanalMeioPagamento();
		acordoCanalMeioPagamento.setAcordocomercialcanaldisponivel(acordoComercialCanalDisponivel);
		acordoCanalMeioPagamento.setId(acordoCanalMeioPagamentoPK);
		List<AcordoCanalMeioPagamento> acordoCanalMeioPagamentos = new ArrayList<>();
		acordoCanalMeioPagamentos.add(acordoCanalMeioPagamento);
		acordoComercialCanalDisponivel.setAcordocanalmeiopagamentos(acordoCanalMeioPagamentos);
		
		acordoCanalMeioPagamento = acordoCanalMeioPagamentoRepository.save(acordoCanalMeioPagamento);
		
		
		List<AcordoComercialCanalDisponivel> acordoComercialCanalDisponiveis =  new ArrayList<>();
		acordoComercialCanalDisponiveis.add(acordoComercialCanalDisponivel);
		acordoComercialParceiro.setAcordocomercialcanaldisponivels(acordoComercialCanalDisponiveis);
		
		ContaRepassePK contaRepassePK =  new ContaRepassePK();
		contaRepassePK.setCodigoParceiroComercial(1234);
		contaRepassePK.setNumeroAcordoComercialParceiro(id.getNumeroAcordoComercialParceiro());
		contaRepassePK.setNumeroSequencialContaParceiroComercial(1);
		contaRepassePK.setNumeroVersaoAcordoComercial(id.getNumeroVersaoAcordoComercial());
		ContaRepasse contaRepasse =  new ContaRepasse();
		contaRepasse.setAcordocomercialparceiro(acordoComercialParceiro);
		contaRepasse.setCodigoFinalidadeSistemaPagamentoBrasileiro("00001");
		contaRepasse.setCodigoMensagemSistemaPagamentoBrasileiro("STR0029");
		contaRepasse.setPercentualRateioContaRepasseParceiro(BigDecimal.valueOf(10.0));
		contaRepasse.setId(contaRepassePK);
		List<ContaRepasse> contaRepasses = new ArrayList<>();
		contaRepasses.add(contaRepasse);
		acordoComercialParceiro.setContarepasses(contaRepasses);
		
		contaRepasse = contaRepasseRepository.save(contaRepasse);
		
		TipoDebitoTarifa tipoDebitoTarifa = new TipoDebitoTarifa();
		tipoDebitoTarifa.setCodigoTipoDebitoTarifa(1);
		tipoDebitoTarifa.setNomeTipoDebitoTarifa("Deduzido");
		tipoDebitoTarifa = tipoDebitoTarifaRepository.save(tipoDebitoTarifa);
		
		ConfiguracaoGeralServicoArrecadacaoPK configuracaoGeralServicoArrecadacaoPK = new ConfiguracaoGeralServicoArrecadacaoPK();
		configuracaoGeralServicoArrecadacaoPK.setCodigoTipoDebitoTarifa(tipoDebitoTarifa.getCodigoTipoDebitoTarifa());;
		configuracaoGeralServicoArrecadacaoPK.setCodigoConfiguracaoGeralServicoArrecadacao(1);
		ConfiguracaoGeralServicoArrecadacao configuracaoGeralServicoArrecadacao = new ConfiguracaoGeralServicoArrecadacao();
		configuracaoGeralServicoArrecadacao.setCodigoCriterioTaxaCorrecaoMonetariaAcordoContrato(1);
		configuracaoGeralServicoArrecadacao.setCodigoPeriodicidadeTarifaServicoArrecadacao("I");
		configuracaoGeralServicoArrecadacao.setDataFimVigenciaTarifaServicoArrecadacao(Date.valueOf("2020-11-21"));
		configuracaoGeralServicoArrecadacao.setDataInicioVigenciaTarifaServicoArrecadacao(Date.valueOf("2019-11-21"));
		configuracaoGeralServicoArrecadacao.setId(configuracaoGeralServicoArrecadacaoPK);
		configuracaoGeralServicoArrecadacao.setNumeroAcordoComercialParceiro(id.getNumeroAcordoComercialParceiro());
		configuracaoGeralServicoArrecadacao.setNumeroVersaoAcordoComercial(id.getNumeroVersaoAcordoComercial());
		configuracaoGeralServicoArrecadacao.setTipodebitotarifa(tipoDebitoTarifa);
		List<ConfiguracaoGeralServicoArrecadacao> configuracaoGeralServicoArrecadacoes = new ArrayList<>(); 
		configuracaoGeralServicoArrecadacoes.add(configuracaoGeralServicoArrecadacao);
		tipoDebitoTarifa.setConfiguracaogeralservicoarrecadacaos(configuracaoGeralServicoArrecadacoes);
		
		configuracaoGeralServicoArrecadacao = configuracaoGeralServicoArrecadacaoRepository.save(configuracaoGeralServicoArrecadacao);
		
		ContaIntermediariaAcordoComercial contaIntermediariaAcordoComercial = new ContaIntermediariaAcordoComercial();
		contaIntermediariaAcordoComercial.setCodigoEmpresaConglomerado("341");
		contaIntermediariaAcordoComercial.setCodigoTipoEmpresaConglomerado("004");
		contaIntermediariaAcordoComercial.setNumeroConta("98418");
		contaIntermediariaAcordoComercial.setNumeroDigitoVerificadorConta("5");
		contaIntermediariaAcordoComercial.setNumeroUnidadeAtendimentoConglomerado("0390");
		contaIntermediariaAcordoComercial.setNumeroAcordoComercialParceiro(id.getNumeroAcordoComercialParceiro());
		contaIntermediariaAcordoComercial.setNumeroVersaoAcordoComercial(id.getNumeroVersaoAcordoComercial());
		
		contaIntermediariaAcordoComercial = contaIntermediariaAcordoComercialRepository.save(contaIntermediariaAcordoComercial);
		
	}

}

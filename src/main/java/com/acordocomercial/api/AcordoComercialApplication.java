package com.acordocomercial.api;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acordocomercial.api.domain.AcordoComercialParceiro;
import com.acordocomercial.api.domain.ConfiguracaoGeralServicoArrecadacao;
import com.acordocomercial.api.domain.TipoDebitoTarifa;
import com.acordocomercial.api.repository.AcordoComercialParceiroRepository;
import com.acordocomercial.api.repository.ConfiguracaoGeralServicoArrecadacaoRepository;
import com.acordocomercial.api.repository.TipoDebitoTarifaRepository;

@SpringBootApplication
public class AcordoComercialApplication implements CommandLineRunner {

	@Autowired
	private ConfiguracaoGeralServicoArrecadacaoRepository configuracaoGeralServicoArrecadacaoRepository;
	
	@Autowired
	private TipoDebitoTarifaRepository tipoDebitoTarifaRepository;
	
	@Autowired
	private AcordoComercialParceiroRepository acordoComercialParceiroRepository;
		
	
	public static void main(String[] args) {
		SpringApplication.run(AcordoComercialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		AcordoComercialParceiro acordo1 = new AcordoComercialParceiro();
		acordo1.setNumVersaoAcordoComercial(1);
		acordo1.setCodParceiroComerical(1);
		acordo1.setCodSituacao(1);
		acordo1.setNumFuncionalColaborador(123);
		
		AcordoComercialParceiro acordo2 = new AcordoComercialParceiro();
		acordo2.setNumVersaoAcordoComercial(1);;
		acordo2.setCodParceiroComerical(122);
		acordo2.setCodSituacao(122);
		acordo2.setNumFuncionalColaborador(12223);
		
		AcordoComercialParceiro acordo3 = new AcordoComercialParceiro();
		acordo3.setNumVersaoAcordoComercial(1);;
		acordo3.setCodParceiroComerical(133);
		acordo3.setCodSituacao(133);
		acordo3.setNumFuncionalColaborador(12333);
		
		
		TipoDebitoTarifa tip1 = new TipoDebitoTarifa();
		tip1.setNomeTipoDebitoTarifa("Debito em Conta Corrente");
		
		TipoDebitoTarifa tip2 = new TipoDebitoTarifa();
		tip2.setNomeTipoDebitoTarifa("Debito em Poupanca");
		
		ConfiguracaoGeralServicoArrecadacao cfg1 = new ConfiguracaoGeralServicoArrecadacao();
		cfg1.setCodCriterio(1);
		cfg1.setCodPeriodicidade(1);
		cfg1.setCodTipoDebitoTarifa(tip1);
		cfg1.setDataFimVigencia(LocalDateTime.now());
		cfg1.setDataInicioVigencia(LocalDateTime.now());
		
		
		ConfiguracaoGeralServicoArrecadacao cfg2 = new ConfiguracaoGeralServicoArrecadacao();
		cfg2.setCodCriterio(2);
		cfg2.setCodPeriodicidade(2);
		cfg2.setCodTipoDebitoTarifa(tip1);
		cfg2.setDataFimVigencia(LocalDateTime.now());
		cfg2.setDataInicioVigencia(LocalDateTime.now());
		
		ConfiguracaoGeralServicoArrecadacao cfg3 = new ConfiguracaoGeralServicoArrecadacao();
		cfg3.setCodCriterio(5);
		cfg3.setCodPeriodicidade(5);
		cfg3.setCodTipoDebitoTarifa(tip2);
		cfg3.setDataFimVigencia(LocalDateTime.now());
		cfg3.setDataInicioVigencia(LocalDateTime.now());
		

		
		List<ConfiguracaoGeralServicoArrecadacao> listCfg1 = Arrays.asList(cfg1, cfg2);
		List<ConfiguracaoGeralServicoArrecadacao> listCfg2 = Arrays.asList(cfg3);
		tip1.setConfiguracoes(listCfg1);
		tip2.setConfiguracoes(listCfg2);
		
		
		tipoDebitoTarifaRepository.saveAll(Arrays.asList(tip1, tip2));
		
		configuracaoGeralServicoArrecadacaoRepository.saveAll(Arrays.asList(cfg1, cfg2, cfg3));
		
		acordoComercialParceiroRepository.saveAll(Arrays.asList(acordo1, acordo2, acordo3));
	}

}

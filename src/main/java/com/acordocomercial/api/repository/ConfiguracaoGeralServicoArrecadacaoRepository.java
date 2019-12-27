package com.acordocomercial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acordocomercial.api.domain.ConfiguracaoGeralServicoArrecadacao;

@Repository
public interface ConfiguracaoGeralServicoArrecadacaoRepository extends JpaRepository<ConfiguracaoGeralServicoArrecadacao, Integer>{

}

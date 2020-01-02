package com.acordocomercial.api.boundaries.acordocomercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acordocomercial.api.domain.entity.AcordoCanalMeioPagamento;
import com.acordocomercial.api.domain.entity.AcordoCanalMeioPagamentoPK;

public interface AcordoCanalMeioPagamentoRepository extends JpaRepository<AcordoCanalMeioPagamento, AcordoCanalMeioPagamentoPK> {

}

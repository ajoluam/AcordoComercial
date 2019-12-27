package com.acordocomercial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acordocomercial.api.domain.TipoDebitoTarifa;

@Repository
public interface TipoDebitoTarifaRepository extends JpaRepository<TipoDebitoTarifa, Integer>{

}

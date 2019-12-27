package com.acordocomercial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acordocomercial.api.domain.AcordoComercialParceiro;

@Repository
public interface AcordoComercialParceiroRepository extends JpaRepository<AcordoComercialParceiro, Integer>{

}

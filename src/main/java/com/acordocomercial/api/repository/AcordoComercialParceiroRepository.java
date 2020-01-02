package com.acordocomercial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acordocomercial.api.domain.AcordoComercialParceiro;
import com.acordocomercial.api.domain.AcordoComercialParceiroPK;

public interface AcordoComercialParceiroRepository extends JpaRepository<AcordoComercialParceiro, AcordoComercialParceiroPK> {

}

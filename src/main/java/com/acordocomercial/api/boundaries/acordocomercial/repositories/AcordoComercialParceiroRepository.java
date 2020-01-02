package com.acordocomercial.api.boundaries.acordocomercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acordocomercial.api.domain.entity.AcordoComercialParceiro;
import com.acordocomercial.api.domain.entity.AcordoComercialParceiroPK;

public interface AcordoComercialParceiroRepository extends JpaRepository<AcordoComercialParceiro, AcordoComercialParceiroPK> {

}

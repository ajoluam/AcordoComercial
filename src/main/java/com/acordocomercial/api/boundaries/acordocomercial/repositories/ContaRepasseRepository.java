package com.acordocomercial.api.boundaries.acordocomercial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acordocomercial.api.domain.entity.ContaRepasse;
import com.acordocomercial.api.domain.entity.ContaRepassePK;

public interface ContaRepasseRepository extends JpaRepository<ContaRepasse, ContaRepassePK> {

}

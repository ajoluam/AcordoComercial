package com.acordocomercial.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acordocomercial.api.domain.ContaRepasse;
import com.acordocomercial.api.domain.ContaRepassePK;

public interface ContaRepasseRepository extends JpaRepository<ContaRepasse, ContaRepassePK> {

}

package com.fnd.helpdesk1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnd.helpdesk1.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{
	

}

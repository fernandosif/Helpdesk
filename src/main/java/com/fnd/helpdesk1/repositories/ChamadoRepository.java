package com.fnd.helpdesk1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnd.helpdesk1.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	

}

package com.fnd.helpdesk1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnd.helpdesk1.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	

}

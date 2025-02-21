package com.fnd.helpdesk1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fnd.helpdesk1.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	

}

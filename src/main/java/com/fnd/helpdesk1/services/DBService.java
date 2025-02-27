package com.fnd.helpdesk1.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fnd.helpdesk1.domain.Chamado;
import com.fnd.helpdesk1.domain.Cliente;
import com.fnd.helpdesk1.domain.Tecnico;
import com.fnd.helpdesk1.domain.enums.Perfil;
import com.fnd.helpdesk1.domain.enums.Prioridade;
import com.fnd.helpdesk1.domain.enums.Status;
import com.fnd.helpdesk1.repositories.ChamadoRepository;
import com.fnd.helpdesk1.repositories.ClienteRepository;
import com.fnd.helpdesk1.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "63653230268", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	
	}
}

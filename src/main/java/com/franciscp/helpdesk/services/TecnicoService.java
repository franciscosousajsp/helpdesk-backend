package com.franciscp.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciscp.helpdesk.domain.Tecnico;
import com.franciscp.helpdesk.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer Id) {
		Optional<Tecnico> obj = repository.findById(Id);
		
		return obj.orElse(null);
	}
	
}

package com.franciscp.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciscp.helpdesk.domain.Tecnico;
import com.franciscp.helpdesk.repositories.TecnicoRepository;
import com.franciscp.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectnotFoundException("Objeto não encontrado! Id: "+id));
	}
	
}

package com.franciscp.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciscp.helpdesk.domain.Tecnico;
import com.franciscp.helpdesk.dtos.TecnicoDTO;
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

	public List<Tecnico> findall() {
	
		return repository.findAll();
	}

	public Tecnico create(TecnicoDTO objDTO) {
		objDTO.setId(null);
		Tecnico newObj = new Tecnico(objDTO);
		return repository.save(newObj);
	}
	
}

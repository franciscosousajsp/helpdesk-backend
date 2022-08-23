package com.franciscp.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscp.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}

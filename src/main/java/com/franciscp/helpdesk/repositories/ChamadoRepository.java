package com.franciscp.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscp.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}

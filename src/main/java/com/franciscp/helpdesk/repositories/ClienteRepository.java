package com.franciscp.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscp.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

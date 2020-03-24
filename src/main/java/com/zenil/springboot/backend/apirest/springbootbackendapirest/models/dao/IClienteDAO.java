package com.zenil.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente, Long> {

}
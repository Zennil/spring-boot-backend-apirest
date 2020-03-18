package com.zenil.springboot.backend.apirest.models.dao;

import com.zenil.springboot.backend.apirest.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {

}
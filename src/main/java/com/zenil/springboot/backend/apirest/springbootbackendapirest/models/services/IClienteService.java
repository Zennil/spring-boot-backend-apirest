package com.zenil.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;


public interface IClienteService {

    public List<Cliente> findAll();

}
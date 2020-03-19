package com.zenil.springboot.backend.apirest.controllers;

import java.util.List;

import com.zenil.springboot.backend.apirest.models.entity.Cliente;
import com.zenil.springboot.backend.apirest.models.services.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClienteRestController
 */
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    public IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

}
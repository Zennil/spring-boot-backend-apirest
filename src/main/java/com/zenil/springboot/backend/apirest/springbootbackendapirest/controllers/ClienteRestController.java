package com.zenil.springboot.backend.apirest.springbootbackendapirest.controllers;

import java.util.List;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.services.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * ClienteRestController
 */
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping(value = "/clientes/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Cliente show(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping(value = "/clientes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }


}
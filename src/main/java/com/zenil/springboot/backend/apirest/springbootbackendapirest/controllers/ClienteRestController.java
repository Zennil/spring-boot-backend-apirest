package com.zenil.springboot.backend.apirest.springbootbackendapirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.services.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping(value = "/clientes", name = "listar")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping(value = "/clientes/{id}", name = "mostrar")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> show(@PathVariable Long id) {

        Map<String, Object> response = new HashMap<>();
        Cliente cliente = null;

        try {

            cliente = clienteService.findById(id);

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al consultar en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (cliente == null) {
            response.put("mensaje",
                    "El cliente con el ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PostMapping(value = "/clientes", name = "crear")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping(value = "/clientes/{id}", name = "actualizar")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente clienteActual = clienteService.findById(id);

        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setEmail(cliente.getEmail());

        return clienteService.save(clienteActual);
    }

    @DeleteMapping(value = "/clientes/{id}", name = "eliminar")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        clienteService.delete(id);
    }

}
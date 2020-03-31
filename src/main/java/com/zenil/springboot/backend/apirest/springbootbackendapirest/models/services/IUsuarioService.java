package com.zenil.springboot.backend.apirest.springbootbackendapirest.models.services;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;

/**
 * IUsuarioService
 */
public interface IUsuarioService {

    public Usuario findByUsername(String username);

}
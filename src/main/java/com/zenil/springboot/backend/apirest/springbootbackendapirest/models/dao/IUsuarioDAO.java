package com.zenil.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Usuario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * IUsuarioDAO
 */
public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {

    // Si se quiere agregar mas campo se debe usar And
    // public Usuario findByUsername(String username);

    @Query("slelect u from Usuario u where u.username = ?1")
    public Usuario findByUsername2(String username);

}
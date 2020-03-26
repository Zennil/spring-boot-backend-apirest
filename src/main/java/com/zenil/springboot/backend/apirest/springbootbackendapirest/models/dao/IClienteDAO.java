package com.zenil.springboot.backend.apirest.springbootbackendapirest.models.dao;

import java.util.List;

import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import com.zenil.springboot.backend.apirest.springbootbackendapirest.models.entity.Region;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    public List<Region> findAllRegiones();

}
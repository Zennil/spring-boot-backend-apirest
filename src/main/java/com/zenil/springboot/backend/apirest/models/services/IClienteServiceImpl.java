package com.zenil.springboot.backend.apirest.models.services;

import java.util.List;

import com.zenil.springboot.backend.apirest.models.dao.IClienteDAO;
import com.zenil.springboot.backend.apirest.models.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDAO.findAll();
    }

}
package com.adso.project2.service;

import com.adso.project2.model.Registro;
import com.adso.project2.repository.RepositoryRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceRegistro {
    @Autowired
    private RepositoryRegistro repositoryRegister;

    public List<Registro> getAllRegistro(){
        return repositoryRegister.findAll();
    }

    public Registro saveRegister(Registro registro){
        return repositoryRegister.save(registro);
    }
}
